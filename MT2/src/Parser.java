import java.io.InputStream;
import java.text.ParseException;
import java.util.List;
import java.util.Objects;

class Tree {
    String node;
    List<Tree> children;

    public Tree(String node, Tree... children) {
        this.node = node;
        this.children = List.of(children);
    }
}

class Parser {
    private LexicalAnalyzer lexicalAnalyzer;

    public Tree parse(InputStream input) throws ParseException {
        lexicalAnalyzer = new LexicalAnalyzer(input);
        lexicalAnalyzer.nextToken();

        return expression();
    }

    private Tree expression() throws ParseException {
        Tree fT = funcType();
        Tree sub = funForPointer();
        Tree identifier = processToken("N", Token.IDENTIFIER, false);
        Tree lBracket = processToken("", Token.LBRACKET, true);
        Tree args = args();
        Tree rBracket = processToken("",Token.RBRACKET, true);
        Tree semicolon = processToken("",Token.SEMICOLON, true);
        processToken("$",Token.END, false);

        return new Tree("E", fT,sub, identifier, lBracket, args, rBracket, semicolon);
    }

    private Tree funcType() throws ParseException {
        if (Objects.requireNonNull(lexicalAnalyzer.curToken) == Token.TYPE) {
            Tree tree = new Tree("FT", new Tree(lexicalAnalyzer.curToken.name() + ": " + lexicalAnalyzer.curWord));
            lexicalAnalyzer.nextToken();
            return tree;
        }
        throw new ParseException("Expected function type at position " + lexicalAnalyzer.curWordPos, lexicalAnalyzer.curWordPos);
    }
    private Tree funForPointer() throws ParseException {
        if (Objects.requireNonNull(lexicalAnalyzer.curToken) == Token.POINTER) {
            return new Tree("SUB",processToken("",Token.POINTER, true), funForPointer());
        } else if (lexicalAnalyzer.curToken == Token.IDENTIFIER) {
            return  new Tree("EPS");
        }
        else {
            throw new ParseException("Expected pointer or function name at position " + lexicalAnalyzer.curWordPos, lexicalAnalyzer.curWordPos);
        }
    }

    private Tree processToken(String str, Token token, Boolean term) throws ParseException {
        if (token == lexicalAnalyzer.curToken) {
            Tree tree;
            if (term) {
                tree = new Tree(token.name() + ": " + lexicalAnalyzer.curWord);
            } else {
                tree = new Tree(str, new Tree(token.name() + ": " + lexicalAnalyzer.curWord));
            }
            lexicalAnalyzer.nextToken();
            return tree;
        } else {
            throw new ParseException("Expected " + token.name() + " at position " + lexicalAnalyzer.curWordPos, lexicalAnalyzer.curWordPos);
        }
    }

    private Tree args() throws ParseException {
        if (Objects.requireNonNull(lexicalAnalyzer.curToken) == Token.RBRACKET) {
            return new Tree("AS", new Tree("EPS"));
        }
        return new Tree("AS", argsP());
    }

    private Tree argsP() throws ParseException {
        return new Tree("AC", arg(), argsPP());
    }

    private Tree arg() throws ParseException {
        return new Tree("A", processToken("FT",Token.TYPE, false), argN());

    }

    private Tree argsPP() throws ParseException {
        if (lexicalAnalyzer.curToken == Token.RBRACKET) {
            return new Tree("AB", new Tree("EPS"));
        } else if (lexicalAnalyzer.curToken == Token.COMMA) {
            return new Tree("AB", processToken("",Token.COMMA, true), argsP());
        } else {
            throw new ParseException("Expected ',' or ')' at position " + lexicalAnalyzer.curWordPos, lexicalAnalyzer.curWordPos);
        }
    }

    private Tree argN() throws ParseException {
        switch (lexicalAnalyzer.curToken) {
            case IDENTIFIER -> {
                return processToken("N",Token.IDENTIFIER, false);
            }
            case POINTER -> {
                return new Tree("AN", processToken("",Token.POINTER, true), argN());
            }
            default ->
                    throw new ParseException("Expected ',' or ')' or argument identifier at position " + lexicalAnalyzer.curWordPos, lexicalAnalyzer.curWordPos);
        }
    }
}


