import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.text.ParseException;
import java.util.List;
import java.util.stream.Stream;

public class LexicalAnalyzerTest {

    @ParameterizedTest
    @MethodSource("correctDefinition")
    void testCorrectDefinition(String input, List<Token> expected) {
        LexicalAnalyzer lexAnalyzer = createLexicalAnalyzer(input);
        List<Token> actualTokens = lexAnalyzer.getAllTokens();
        Assertions.assertIterableEquals(expected, actualTokens);
    }

    private static Stream<Arguments> correctDefinition() {
        return Stream.of(
                Arguments.of("int name();", List.of(Token.TYPE, Token.IDENTIFIER, Token.LBRACKET, Token.RBRACKET, Token.SEMICOLON)),
                Arguments.of("double name();", List.of(Token.TYPE, Token.IDENTIFIER, Token.LBRACKET, Token.RBRACKET, Token.SEMICOLON)),
                Arguments.of("int name(double n);", List.of(Token.TYPE,Token.IDENTIFIER, Token.LBRACKET, Token.TYPE, Token.IDENTIFIER, Token.RBRACKET, Token.SEMICOLON)),
                Arguments.of("char name(double *n);", List.of(Token.TYPE,Token.IDENTIFIER, Token.LBRACKET, Token.TYPE, Token.POINTER, Token.IDENTIFIER, Token.RBRACKET, Token.SEMICOLON)),
                Arguments.of("float name(int *    *       *n);", List.of(Token.TYPE,Token.IDENTIFIER, Token.LBRACKET, Token.TYPE, Token.POINTER, Token.POINTER, Token.POINTER, Token.IDENTIFIER, Token.RBRACKET, Token.SEMICOLON)),
                Arguments.of("void name(int *    *       *n, char ***a);", List.of(Token.TYPE,Token.IDENTIFIER, Token.LBRACKET, Token.TYPE, Token.POINTER,  Token.POINTER, Token.POINTER,
                        Token.IDENTIFIER, Token.COMMA, Token.TYPE, Token.POINTER,  Token.POINTER, Token.POINTER,  Token.IDENTIFIER, Token.RBRACKET, Token.SEMICOLON))
        );
    }

    @Test
    void testEmptyInput() {
        LexicalAnalyzer lexAnalyzer = createLexicalAnalyzer("");
        List<Token> actualTokens = lexAnalyzer.getAllTokens();
        Assertions.assertEquals(List.of(), actualTokens);
    }

    private LexicalAnalyzer createLexicalAnalyzer(String input) {
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        return new LexicalAnalyzer(inputStream);
    }
}
