import java.util.*;

// ideally would be immutable, but passing maps is a pain :)
class Room {
    // name is ugly name (identifier), title is nice name, description is full description
    private String name, title, description;
    private Map<String, Room> possibleMovements; // key is direction, value is room

    public Room(String name, String title, String description) {
        this.name=name;
        this.description=description;
        this.title=title;
    }

    public setMovement(String direction, Room location)
    {
        possibleMovements.put(direction, location);
    }

    public List<String> getPossibleMovementDirections() {
        return possibleMovements.keySet();
    }

    public Room getRoomAtDirection(String direction) {
        return possibleMovements[direction];
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}

public class AdventureGame {
    public Map<String,Room> rooms= new Map<String,Room>(); // maps from the room name to the room
    public String initialRoomName, goalName;

    public static void main(String args[]) {
        AdventureGame game= new AdventureGame();

        Room frontPorch=new Room("front","Outside the house, in the front yard.", "You see the house..");
        Room kitchen=new Room("kitchen","The Kitchen", "You see food, a table with six chairs.");
        Room livingRoom=new Room("lr","The Living Room", "You see a couch..");
        Room kitchen=new Room("kitchek","The Kitchen", "You're in the kitchen. You see food.");

    }
}


