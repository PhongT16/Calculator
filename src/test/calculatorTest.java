package test;
import com.company.Calculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.rules.ExpectedException;

public class calculatorTest {
    @Test
    public void testAddition() throws Exception {
        Calculator calculator = new Calculator();
        double sum = calculator.calculate("3 + 4");
        assertEquals(7.0, sum, 0.01);
    }
    @Test
    public void testSubtraction() throws Exception {
        Calculator calculator = new Calculator();
        double sum = calculator.calculate("3 - 4");
        assertEquals(-1.0, sum, 0.01);
    }

    @Test
    public void testMultiplication() throws Exception {
        Calculator calculator = new Calculator();
        double sum = calculator.calculate("3 * 4");
        assertEquals(12, sum, 0.01);
    }

    @Test
    public void testMultiplication() throws Exception {
        Calculator calculator = new Calculator();
        double sum = calculator.calculate("3 * 4");
        assertEquals(12, sum, 0.01);
    }

}
