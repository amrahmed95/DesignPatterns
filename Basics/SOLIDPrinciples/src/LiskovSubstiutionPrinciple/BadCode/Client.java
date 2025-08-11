package LiskovSubstiutionPrinciple.BadCode;

public class Client {

    public static void main(String[] args) {
        File file = new ReadOnlyFile();
        file.read();    // Reading file
        file.write();   // This will throw an exception because ReadOnlyFile does not have a write method
    }

}
