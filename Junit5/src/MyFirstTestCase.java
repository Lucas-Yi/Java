import org.junit.jupiter.api.*;

@DisplayName("My First Test Case")
class MyFirstTestCase {

	@BeforeAll
    public static void init() {
        System.out.println("initialize data");
    }

    @AfterAll
    public static void cleanup() {
        System.out.println("clean up data");
    }

    @BeforeEach
    public void tearup() {
        System.out.println("current method begins");
    }

    @AfterEach
    public void tearDown() {
        System.out.println("current method ends");
    }

    @DisplayName("My First Test")
    @Test
    void testFirstTest() {
        System.out.println("First Test begins");
    }

    @DisplayName("My Second Test")
    @Test
    void testSecondTest() {
        System.out.println("Second Test begins");
    }

    @DisplayName("My Third Test")
    @Disabled
    @Test
    void testThirdTest() {
    	System.out.println("Third Test begins");
    }
    
}
