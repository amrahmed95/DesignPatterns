package DesignPatterns.BehaviouralPattern.src.Momento;

// Originator class
// the object whose state needs to be saved

/*
 * The Object that knows how to save itself
*/

public class TextEditor {

    private String content;

    public void writeContent(String content) {
        this.content = content;
    }

    // Save the current state of the editor
    public TextEditorMemento save() {
        return new TextEditorMemento(content);
    }

    // Restore the editor's content from a memento
    // Memento -> Update the state of the current content
    public void restore(TextEditorMemento memento) {
        if (memento != null) {
            this.content = memento.getContent();
        }
    }

    public String getContent() {
        return content;
    }

}
