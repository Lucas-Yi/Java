import org.junit.jupiter.api.*;

@DisplayName("Repeated Test Case")
public class RepeatedTestCase {

    @DisplayName("Repeated Test")
    @RepeatedTest(value = 3)
    public void repeated_test() {
        System.out.println("test begins");
    }

    @DisplayName("Customize Repeated Test")
    @RepeatedTest(value = 3, name = "{displayName} {currentRepetition}")
    public void repeated_test_2() {
        System.out.println("test begins");
    }
}
