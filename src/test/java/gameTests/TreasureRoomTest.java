package gameTests;

import game.TreasureRoom;
import org.junit.Before;

public class TreasureRoomTest {

    TreasureRoom treasureRoom;

    @Before
    public void before(){
        treasureRoom = new TreasureRoom("The King Jewel", false, true);
    }
}
