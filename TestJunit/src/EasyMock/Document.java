package EasyMock;

public class Document {

    private final Printer printer;

    private String content;

    public Document(Printer printer) {
        this.printer = printer;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void print() {
        printer.print(content);
    }
}
