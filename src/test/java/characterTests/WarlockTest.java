package characterTests;

import characters.Warlock;
import enums.MythicalCreatureType;
import enums.SpellType;
import org.junit.Before;

public class WarlockTest {

    Warlock warlock;

    @Before
    public void before(){
        warlock = new Warlock(SpellType.CRYSTALDEATH, MythicalCreatureType.DRAGON);
    }
}
