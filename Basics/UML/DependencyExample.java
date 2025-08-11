package Basics.UML;

class Document {
    private String content;

    public Document(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}

// Printer class (depends on Document to print)
class Printer {
    public void print(Document doc) {
        System.out.println("Printing document: " + doc.getContent());
    }
}
public class DependencyExample {
    public static void main(String[] args) {
        Document document = new Document("Hello, world!");
        Printer printer = new Printer();
        printer.print(document);
    }
}

// Output:
// Printing document: Hello, world!
