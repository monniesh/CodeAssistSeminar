import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculateTest {
    @Test
    public void testAdd() {
        assertEquals(5, Calculate.add(2, 3));
    }
}

    @Test
    public void testAddNegativeNumbers() {
        assertEquals(-5, Calculate.add(-2, -3));
    }

    @Test
    public void testAddZero() {
        assertEquals(0, Calculate.add(0, 0));
    }
