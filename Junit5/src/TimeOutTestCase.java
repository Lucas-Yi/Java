import java.time.Duration;
import java.time.temporal.ChronoUnit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Time Out Test Case")
public class TimeOutTestCase {
    @Test
    @DisplayName("Time Out Test 1")
    void test_should_complete_in_one_second() {
        Assertions.assertTimeoutPreemptively(Duration.of(1, ChronoUnit.SECONDS), () -> Thread.sleep(900));
    }
    
    @Test
    @DisplayName("Time Out Test 2")
    void test_should_complete_beyond_one_second() {
        Assertions.assertTimeoutPreemptively(Duration.of(1, ChronoUnit.SECONDS), () -> Thread.sleep(1100));
    }
}
