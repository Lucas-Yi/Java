import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

@DisplayName("Parameterized Test Case")
public class ParameterizedTestCase{
    @ParameterizedTest
    @ValueSource(ints = {2, 3, 8})
    void testNumberShouldBeEven(int num) {
        Assertions.assertEquals(0, num % 2);
    }

    @ParameterizedTest
    @ValueSource(strings = {"Effective Java", "Code Complete", "Clean Code"})
    void testPrintTitle(String title) {
        System.out.println(title);
    }

    @ParameterizedTest
    @MethodSource("stringGenerator")
    void testNotBeNullString(String arg) {
        Assertions.assertNotNull(arg);
    }

    static Stream<String> stringGenerator() {
        return Stream.of("hello", "world", "let's", "test");
    }


    @ParameterizedTest
    @ArgumentsSource(CustomArgumentsGenerator.class)
    void testGeneratedArguments(double number) {
        Assertions.assertFalse(number == 0.D);
        Assertions.assertTrue(number > 0);
        Assertions.assertTrue(number < 1);
    }

    static class CustomArgumentsGenerator implements ArgumentsProvider {
        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
            return Stream.of(Math.random(), Math.random(), Math.random(), Math.random(), Math.random())
                    .map(Arguments::of);
        }
    }
}