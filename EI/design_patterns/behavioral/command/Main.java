package design_patterns.behavioral.command;

public class Main {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        Command insertCommand = new InsertCommand(textEditor, "Hello World");
        Command deleteCommand = new DeleteCommand(textEditor, "Hello");

        insertCommand.execute();
        textEditor.showContent();
        
        insertCommand.undo();
        textEditor.showContent();

        deleteCommand.execute();
        textEditor.showContent();
    }
}
