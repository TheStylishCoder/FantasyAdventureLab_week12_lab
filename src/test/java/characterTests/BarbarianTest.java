package characterTests;

import characters.Barbarian;
import enums.WeaponType;
import org.junit.Before;
import org.junit.Test;
import player.Player;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;
    Player player;

    @Before
    public void before(){
        barbarian = new Barbarian(WeaponType.SPEAR);
        player = new Player("Dexter", 100, barbarian);
    }

    @Test
    public void canChangeHealth(){
        barbarian.changeHealth(player, 10);
        assertEquals(90, player.getHealthPoints());
    }

    @Test
    public void canChangeWeapon(){
        barbarian.changeWeapon(WeaponType.AXE);
        assertEquals(WeaponType.AXE, barbarian.getWeapon());
    }

}
