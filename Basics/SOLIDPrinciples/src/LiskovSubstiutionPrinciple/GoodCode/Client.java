package LiskovSubstiutionPrinciple.GoodCode;

public class Client {

    public static void readAnyFIle(File file) {
        file.read();
        // file.write();    // undefined
    }


    public static void main(String[] args) {
        ReadOnlyFile readOnly = new ReadOnlyFile();
        readOnly.read();
        // readOnly.write();  // undefined

        ReadWriteFile readWrite = new ReadWriteFile();
        readWrite.read();
        readWrite.write();


        readAnyFIle(readOnly);
        readAnyFIle(readWrite);
    }

}
