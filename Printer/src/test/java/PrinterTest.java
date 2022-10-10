import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(100,50);
    }

    @Test
    public void canReducePaper(){
        printer.print(2,3);
        assertEquals(94,printer.getPaper());
    }
    @Test
    public void canNotPrintTooMuch(){
        printer.print(24,3);
        assertEquals(100,printer.getPaper());
        }

    @Test
    public void canReduceToner(){
        printer.print(4,3);
        assertEquals(38, printer.getToner());
    }



}
