package DesignPatterns.BehaviouralPattern.src.Memento;

import java.util.Stack;

/*
 * Caretaker class:
 * The object that is responsible for managing the state / mementos (snapshots of the originator/TextEditor).
 * It keeps track of the mementos and can restore the originator's state from them
 *
 * The Object that knows why and when the originator needs to save and restore itself.
 */

public class caretaker {

    private final Stack<TextEditorMemento> history = new Stack<>();

    public void saveState(TextEditor editor) {
        history.push(editor.save());
    }

    public void undo(TextEditor editor) {
        if (!history.isEmpty()) {
            history.pop();
            TextEditorMemento memento = history.isEmpty() ? null : history.peek();
            editor.restore(memento);
        } else {
            System.out.println("No previous state to restore.");
        }
    }

    public boolean hasMemento() {
        return !history.isEmpty();
    }

}
