import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    private Printer printer;

    @Before
    public void before(){
        printer = new Printer(50,50);
    }

    @Test
    public void paperCount() {
        assertEquals(50, printer.getPaperCount());
    }

    @Test
    public void tonerAmount() {
        assertEquals(50, printer.getTonerAmount());
    }

    @Test
    public void canItPrintTrue() {
        assertEquals(true, printer.canPrint(5));
    }

    @Test
    public void canItPrintFalse() {
        assertEquals(false, printer.canPrint(51));
    }

    @Test
    public void canRefill(){
        printer.refill(5);
        assertEquals(55,printer.getPaperCount());
    }

    @Test
    public void tonerGetsUsed() {
        printer.tonerPagePrinted(5);
        assertEquals(45, printer.getTonerAmount());
    }

    @Test
    public void canPrintTrue() {
        printer.print(20, 1);
        assertEquals(30,printer.getPaperCount());
        assertEquals(30, printer.getTonerAmount());
    }

    @Test
    public void canPrintFalse() {
        printer.print(10, 13);
        assertEquals(50,printer.getPaperCount());
        assertEquals(50, printer.getTonerAmount());
    }


}
