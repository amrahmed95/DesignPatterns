package InterfaceSegregationPrinciple.BadCode;

public class SimplePrinter implements IMachine {

    // ONLY PRINTING IS SUPPORTED

    @Override
    public void print(Document doc) {
        System.out.println("Printing document ...");
    }

    @Override
    public void scan(Document doc) {
        throw new UnsupportedOperationException("Scanning is not supported");
    }

    @Override
    public void copy(Document doc) {
        throw new UnsupportedOperationException("Copying is not supported");
    }

}
