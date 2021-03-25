package playerTests;

import org.junit.Before;
import player.Player;

public class PlayerTest {

    Player player;

    @Before
    public void before(){
        player = new Player("Dexter", 100, barbarian);
    }

}
