package characterTests;

import characters.Dwarf;
import enums.WeaponType;
import org.junit.Before;

public class DwarfTest {

    Dwarf dwarf;

    @Before
    public void before(){
        dwarf = new Dwarf(WeaponType.AXE);
    }
}
