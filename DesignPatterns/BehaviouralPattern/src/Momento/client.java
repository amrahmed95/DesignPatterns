package DesignPatterns.BehaviouralPattern.src.Momento;

public class client {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        caretaker caretaker = new caretaker(); // History manager - state management object

        // Write some content
        editor.writeContent("Hello, World!");
        System.out.println("Current Content: " + editor.getContent());

        // Save the state
        caretaker.saveState(editor);

        // Write more content
        editor.writeContent("Hello, Design Patterns!");
        System.out.println("Current Content: " + editor.getContent());

        // Save the new state
        caretaker.saveState(editor);

        // Write even more content
        editor.writeContent("Hello, Memento Pattern!");
        System.out.println("Current Content: " + editor.getContent());

        // Save the new state
        caretaker.saveState(editor);

        // Write final content
        editor.writeContent("Final Content!");
        System.out.println("Current Content: " + editor.getContent());

        // Save the new state
        caretaker.saveState(editor);

        // Undo to previous state
        caretaker.undo(editor);
        System.out.println("After Undo: " + editor.getContent());

        // Check if there is a memento available
        if (caretaker.hasMemento()) {
            System.out.println("There is a previous state available.");
        } else {
            System.out.println("No previous state available.");
        }

        // Undo again to restore the state before the last change
        caretaker.undo(editor);
        System.out.println("After another Undo: " + editor.getContent());

        // Check again if there is a memento available
        if (caretaker.hasMemento()) {
            System.out.println("There is a previous state available.");
        } else {
            System.out.println("No previous state available.");
        }

        // Undo again to restore the state before the last change
        caretaker.undo(editor);
        System.out.println("After another Undo: " + editor.getContent());

        // Check again if there is a memento available
        if (caretaker.hasMemento()) {
            System.out.println("There is a previous state available.");
        } else {
            System.out.println("No previous state available.");
        }

        // Undo again to restore the state before the last change
        caretaker.undo(editor);
        System.out.println("After another Undo: " + editor.getContent());

        // Check again if there is a memento available
        if (caretaker.hasMemento()) {
            System.out.println("There is a previous state available.");
        } else {
            System.out.println("No previous state available.");
        }
    }
}


/*
 * Output:
 * -----------

Current Content: Hello, World!
Current Content: Hello, Design Patterns!
Current Content: Hello, Memento Pattern!
Current Content: Final Content!
After Undo: Hello, Memento Pattern!
There is a previous state available.
After another Undo: Hello, Design Patterns!
There is a previous state available.
After another Undo: Hello, World!
There is a previous state available.
After another Undo: Hello, World!
No previous state available.

 */