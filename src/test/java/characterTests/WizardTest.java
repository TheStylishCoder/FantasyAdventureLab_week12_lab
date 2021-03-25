package characterTests;

import characters.Wizard;
import enums.MythicalCreatureType;
import enums.SpellType;
import org.junit.Before;

public class WizardTest {

    Wizard wizard;

    @Before
    public void before(){
        wizard = new Wizard(SpellType.ICEBLAST, MythicalCreatureType.PHOENIX);
    }
}
