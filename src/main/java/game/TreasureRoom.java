package game;

public class TreasureRoom extends Room{

    boolean treasure;

    public TreasureRoom(String name, boolean roomComplete, boolean treasure){
        super(name, roomComplete);
        this.treasure = treasure;
    }
}
