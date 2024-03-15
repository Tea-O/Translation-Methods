import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.ByteArrayInputStream;
import java.text.ParseException;
import java.util.stream.Stream;

public class ParserTest {
    @ParameterizedTest
    @MethodSource("correctDefinition")
    void testCorrectDefinition(String definition, String expected) throws ParseException {
        Parser parser = new Parser();

        ByteArrayInputStream inputStream = new ByteArrayInputStream(definition.getBytes());
        Tree tree = parser.parse(inputStream);
        Visualizer visualizer = new Visualizer("output.dot");
        String curStr = visualizer.concatLeaf(tree);
        Assertions.assertEquals(expected, curStr, "Expected: " + expected + ", Actual: " + curStr);

    }
    private static Stream<Arguments> correctDefinition() {
        return Stream.of(
                Arguments.of("int name();", "int name();"),
                Arguments.of("double name();", "double name();"),
                Arguments.of("int name(double n);", "int name(double n);"),
                Arguments.of("char name(double *n);", "char name(double *n);"),
                Arguments.of("float name(int *    *       *n);", "float name(int ***n);"),
                Arguments.of("void name(int *    *       *n, char ***a);", "void name(int ***n, char ***a);")

        );
    }

    @ParameterizedTest
    @MethodSource("incorrectDefinition")
    void testIncorrectDefinition(String definition, int position) {
        Parser parser = new Parser();
        ByteArrayInputStream inputStream = new ByteArrayInputStream(definition.getBytes());
        try {
            parser.parse(inputStream);
        } catch (ParseException e) {
            Assertions.assertEquals(position, e.getErrorOffset());
        }
    }
    private static Stream<Arguments> incorrectDefinition() {
        return Stream.of(
                Arguments.of("int name(;", 10),
                Arguments.of("int name(float);", 15),
                Arguments.of("int name(float a)", 18),
                Arguments.of("name(float a);", 1),
                Arguments.of("float name(a);", 12),
                Arguments.of("char name(*);", 11),
                Arguments.of("int %name();", 5),
                Arguments.of("int name(int a, b);", 17)
        );
    }


}
