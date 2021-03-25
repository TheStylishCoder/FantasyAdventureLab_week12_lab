package characterTests;

import characters.Knight;
import enums.WeaponType;
import org.junit.Before;
import org.junit.Test;
import player.Player;

import static org.junit.Assert.assertEquals;

public class KnightClassTest {

    Knight knight;
    Player player;

    @Before
    public void before(){
        knight = new Knight(WeaponType.SWORD);
        player = new Player("Dexter", 100, knight);
    }

    @Test
    public void canChangeHealth(){
        knight.changeHealth(player, 10);
        assertEquals(90, player.getHealthPoints());
    }

    @Test
    public void canChangeWeapon(){
        knight.changeWeapon(WeaponType.SPEAR);
        assertEquals(WeaponType.SPEAR, knight.getWeapon());
    }



}
