package Basics.UML;

import java.util.ArrayList;
import java.util.List;

class Room {
    private String name;

    public Room(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class House {
    private List<Room> rooms;

    public House() {
        rooms = new ArrayList<>();
        rooms.add(new Room("Bedroom"));
        rooms.add(new Room("Bathroom"));
    }

    public void showRooms() {
        for (Room room : rooms) {
            System.out.println(room.getName());
        }
    }
}

public class CompositionExample {
    public static void main(String[] args) {
        House house = new House();
        house.showRooms();

        // Output:
        // Living Room
        // Bedroom
    }
}
