package Basics.UML;


// Superclass: Animal
class Animal {
    public void eat() {
        System.out.println("This animal is eating");
    }
}

// Subclass: Dog (inherits from Animal)
class Dog extends Animal {
    public void bark() {
        System.out.println("The dog is barking");
    }
}


public class InheritanceExample {
    public static void main(String[] args) {
        // Create an instance of Dog
        Dog myDog = new Dog();

        // Call methods from the superclass
        myDog.eat(); // Output: This animal is eating

        // Call methods from both classes
        myDog.bark(); // Output: The dog is barking
    }
}
