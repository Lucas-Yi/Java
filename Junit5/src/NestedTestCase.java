import org.junit.jupiter.api.*;

@DisplayName("Nested Test Case")
public class NestedTestCase {
    @BeforeEach
    void init() {
        System.out.println("current method begins");
    }

    @Nested
    @DisplayName("First Nested Test class")
    class FirstNestTest {
        @Test
        void test() {
            System.out.println("first nested test begins");
        }
    }

    @Nested
    @DisplayName("Second Nested Test class")
    class SecondNestTest {
        @Test
        void test() {
            System.out.println("second nested test begins");
        }
    }
}