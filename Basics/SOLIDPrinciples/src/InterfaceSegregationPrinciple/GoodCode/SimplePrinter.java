package InterfaceSegregationPrinciple.GoodCode;

public class SimplePrinter implements IPrint {
    @Override
    public void print(Document doc) {
        System.out.println("Simple - Printing document ...");
    }
}
