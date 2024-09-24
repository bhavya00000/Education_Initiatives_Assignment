package design_patterns.behavioral.command;

public class TextEditor {
    private StringBuilder content = new StringBuilder();

    public void insertText(String text) {
        content.append(text);
        System.out.println("Inserted: " + text);
    }

    public void deleteText(int length) {
        if (length > content.length()) length = content.length();
        content.delete(content.length() - length, content.length());
        System.out.println("Deleted last " + length + " characters");
    }

    public void showContent() {
        System.out.println("Content: " + content.toString());
    }
}
