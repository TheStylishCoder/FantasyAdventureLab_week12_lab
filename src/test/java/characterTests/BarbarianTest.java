package characterTests;

import characters.Barbarian;
import enums.WeaponType;
import org.junit.Before;

public class BarbarianTest {

    Barbarian barbarian;

    @Before
    public void before(){
        barbarian = new Barbarian(WeaponType.SPEAR);
    }

}
