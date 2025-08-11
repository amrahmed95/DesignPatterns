package LiskovSubstiutionPrinciple.GoodCode;

public class File implements IReadable {

    @Override
    public void read() {
        System.out.println("Reading file");
    }

}
