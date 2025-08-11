The **Liskov Substitution Principle (LSP)**
states that objects of a superclass should be replaceable with objects of a subclass
without altering or affecting the correctness of the program.

It ensures that a subclass can stand in for its parent class and function
correctly in any context that expects the parent class.

Example:
----------
class Bird {
    eat();
    fly();
}


class Ostrich extends Bird {

}

The Liskov Substitution Principle is violated in this example because an ostrich cannot fly.


***No Client should be forced to depend on methods it does not use. Split large interfaces into smaller, more focused and specific ones.***