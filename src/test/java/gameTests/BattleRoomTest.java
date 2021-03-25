package gameTests;

import enums.EnemyType;
import game.BattleRoom;
import org.junit.Before;

public class BattleRoomTest {

    BattleRoom battleRoom;

    @Before
    public void before(){
        battleRoom = new BattleRoom("The Dungeon", false, EnemyType.BALLOONBORRIS1);
    }
}
