public class Printer {

    private int paperCount;
    private int tonerAmount;

    public Printer(int paperCount, int tonerAmount) {
        this.paperCount = paperCount;
        this.tonerAmount = tonerAmount;
    }

    public int getPaperCount() {
        return this.paperCount;
    }
    public int getTonerAmount() {
        return this.tonerAmount;
    }

    public boolean canPrint(int paperToPrint) {
        return (this.paperCount >= paperToPrint);
    }

    public void print(int pages, int copies) {
        int totalPages = pages * copies;
        if (canPrint(totalPages)) {
            this.paperCount -= pages * copies;
            tonerPagePrinted(totalPages);
        }
    }

    public void refill(int paper) {
        this.paperCount += paper;
    };

    public void tonerPagePrinted(int pagesPrinted) {
        this.tonerAmount -= pagesPrinted;
    }



}
