import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import java.util.ArrayList;
import java.util.List;

public class LexicalAnalyzer {
    private final InputStreamReader input;
    private final char EOF = Character.MAX_VALUE;
    private char curChar = ' ';
    private int curCharPos = 0;
    Token curToken;
    Token lastToken;
    String curWord;
    int curWordPos = 0;

    public LexicalAnalyzer(InputStream input) {
        this.input = new InputStreamReader(input);
        nextChar();
    }

    public void nextToken() {
        skipWhitespace();

        switch (curChar) {
            case '(' -> {
                nextChar();
                lastToken = curToken;
                curToken = Token.LBRACKET;
            }
            case ')' -> {
                nextChar();
                lastToken = curToken;
                curToken = Token.RBRACKET;
            }
            case '*' -> {
                nextChar();
                lastToken = curToken;
                curToken = Token.POINTER;
            }
            case ',' -> {
                nextChar();
                lastToken = curToken;
                curToken = Token.COMMA;
            }
            case ';' -> {
                nextChar();
                lastToken = curToken;
                curToken = Token.SEMICOLON;
            }
            case (char) EOF -> curToken = Token.END;
            default -> {
                nextWord();
                lastToken = curToken;
                curToken = checkWord();
            }
        }
    }

    public List<Token> getAllTokens() {
        List<Token> list = new ArrayList<>();

        nextToken();
        while (curToken != Token.END) {
            list.add(curToken);
            nextToken();
        }
        return list;
    }

    private Token checkWord() {
        return switch (curWord) {
            case "int", "double", "float", "char", "void" -> Token.TYPE;
            default -> Token.IDENTIFIER;
        };
    }

    private void nextWord() {
        StringBuilder stringBuilder = new StringBuilder();

        while (isCIdentifierPart()) {
            stringBuilder.append(curChar);
            nextChar();
        }

        curWord = stringBuilder.toString();
    }

    private void skipWhitespace() {
        while (Character.isWhitespace(curChar)) {
            nextChar();
        }
        curWordPos = curCharPos;
        curWord = Character.toString(curChar);
    }

    private void nextChar() {
        curCharPos++;
        try {
            int readChar = input.read();
            curChar = (char) readChar;
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    public void close() {
        try {
            input.close();
        } catch (IOException e) {
            throw new RuntimeException("Error closing input stream", e);
        }
    }

    private boolean isCIdentifierPart() {
        return Character.isJavaIdentifierPart(curChar) && curChar <= 255;
    }

}
