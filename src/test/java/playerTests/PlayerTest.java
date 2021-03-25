package playerTests;

import characters.Barbarian;
import org.junit.Before;
import player.Player;

public class PlayerTest {

    Player player;
    Barbarian barbarian;

    @Before
    public void before(){
        player = new Player("Dexter", 100, barbarian);
    }

}
