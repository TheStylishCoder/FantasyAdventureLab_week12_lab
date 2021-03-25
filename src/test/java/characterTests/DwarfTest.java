package characterTests;

import characters.Barbarian;
import characters.Dwarf;
import enums.WeaponType;
import org.junit.Before;
import org.junit.Test;
import player.Player;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    Dwarf dwarf;
    Player player;

    @Before
    public void before(){
        dwarf = new Dwarf(WeaponType.AXE);
        player = new Player("Dexter", 100, dwarf);
    }

    @Test
    public void canChangeHealth(){
        dwarf.changeHealth(player, 10);
        assertEquals(90, player.getHealthPoints());
    }

    @Test
    public void canChangeWeapon(){
        dwarf.changeWeapon(WeaponType.CLUB);
        assertEquals(WeaponType.CLUB, dwarf.getWeapon());
    }
}
