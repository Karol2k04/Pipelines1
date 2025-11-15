import org.example.HRCalculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class HRCalculatorTest {
    @Test
    public void testValidMaxHR(){
        var result = HRCalculator.calculateMaxHR(25);
        assertEquals(195, result);
    }
    @Test
    public void testInvalidMinHR_ageTooHigh() {
        assertThrows(IllegalArgumentException.class,
                () -> HRCalculator.calculateMaxHR(500));
    }
    @Test
    public void testInvalidMinHR_ageTooLow() {
        assertThrows(IllegalArgumentException.class,
                () -> HRCalculator.calculateMaxHR(-1));
    }
    @Test
    public void testWorkoutZones() {
        assertEquals("Very light", HRCalculator.getWorkoutZone(40, 75));
        assertEquals("Light", HRCalculator.getWorkoutZone(40, 90));
        assertEquals("Moderate", HRCalculator.getWorkoutZone(40, 120));
        assertEquals("Anaerobic", HRCalculator.getWorkoutZone(40, 150));
    }

}
