package design_patterns.behavioral.command;

public class InsertCommand implements Command {
    private TextEditor textEditor;
    private String text;

    public InsertCommand(TextEditor textEditor, String text) {
        this.textEditor = textEditor;
        this.text = text;
    }

    @Override
    public void execute() {
        textEditor.insertText(text);
    }

    @Override
    public void undo() {
        textEditor.deleteText(text.length());
    }
}
