import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Test
    public void canAdd() {
        assertEquals(7, calculator.Add(3, 4));
    }

    @Test
    public void canSubtract(){
        assertEquals(8,calculator.Subtract(14,6));
    }

    @Test
    public void canMultiply(){
        assertEquals(35, calculator.Multiply(7,5));
    }

    @Test
    public void canDivide(){
        assertEquals(3.5,calculator.Divide(7f,2f),0.0);
    }

}
