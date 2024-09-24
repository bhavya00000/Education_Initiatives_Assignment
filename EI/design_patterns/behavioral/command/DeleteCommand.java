package design_patterns.behavioral.command;

public class DeleteCommand implements Command {
    private TextEditor textEditor;
    private String deletedText;

    public DeleteCommand(TextEditor textEditor, String text) {
        this.textEditor = textEditor;
        this.deletedText = text;
    }

    @Override
    public void execute() {
        textEditor.deleteText(deletedText.length());
    }

    @Override
    public void undo() {
        textEditor.insertText(deletedText);
    }
}
