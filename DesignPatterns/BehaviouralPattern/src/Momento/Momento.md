**The <ins>Memento Pattern</ins> is a behavioral design pattern that allows saving and restoring an object's state without exposing its internal details, commonly used for implementing undo functionality.**

**Definition and Purpose**
-----------
The **Memento Pattern** is a software design pattern that enables the capture and restoration of an object's internal state without violating encapsulation. This pattern is particularly useful in scenarios where you need to implement undo/redo functionality, such as in text editors or games. It allows an object to save its state at a certain point in time and revert back to that state when needed.


**Components of the Memento Pattern**
----------
The Memento Pattern consists of three main components:
1. **Originator**: This is the object whose state needs to be saved. The Originator creates a Memento containing a snapshot of its current state and can restore its state from a Memento.
2. **Memento**: This object stores the internal state of the Originator. It provides a way to retrieve the state without allowing external access to modify it, thus preserving encapsulation.
3. **Caretaker**: The Caretaker is responsible for managing the Memento objects. It requests Mementos from the Originator to save its state and can later use these Mementos to restore the Originator's state when needed.

**How It Works**
------------
- When the Originator's state changes, it creates a Memento to save its current state.
- The Caretaker stores the Memento and can later request the Originator to restore its state from the Memento.
- The Memento allows the Originator to revert to a previous state without exposing its internal structure to the Caretaker or other objects.


**Example Use Case**
----------------
A common example of the Memento Pattern is in text editors where users can undo and redo their actions. When a user makes changes to a document, the editor can save the current state of the document as a Memento. If the user decides to undo an action, the editor retrieves the last saved Memento and restores the document to that state.

- Originator -> Editor
- Memento -> EditorState
- Caretaker -> HistoryClass

