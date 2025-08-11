package LiskovSubstiutionPrinciple.GoodCode;

public class ReadWriteFile extends File implements IWritable {
    @Override
    public void write() {
        System.out.println("Writing file");
    }
}
