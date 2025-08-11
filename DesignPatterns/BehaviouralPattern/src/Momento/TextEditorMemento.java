package DesignPatterns.BehaviouralPattern.src.Momento;

// Memento class
// The object used to capture and store the internal state of the Originator (TextEditor).

/*
 * The lock box that is written and read by the originator, and shepherded by the caretaker.
 */

public class TextEditorMemento {

    private final String content;

    public TextEditorMemento(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

}
