package game;

public abstract class Room {

    String name;
    boolean roomComplete;

    public Room(String name, boolean roomComplete){
        this.name = name;
        this.roomComplete = roomComplete;
    }
}
