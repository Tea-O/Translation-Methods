import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {
    public static void main(String[] args) {
        String expressions = """
                a = 2;
                a = [3,2] * 2 + 1 ;
                c = 6 / 2 * (1 + 2);
                c = a + 2;
                """;

        CharStream charStream = CharStreams.fromString(expressions);

        lab3Lexer lexer = new lab3Lexer(charStream);
        lab3Parser parser = new lab3Parser(new CommonTokenStream(lexer));

        System.out.println(parser.start().res);
    }
}
