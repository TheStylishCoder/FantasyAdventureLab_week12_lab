package characterTests;

import characters.Cleric;
import enums.HealingTool;
import org.junit.Before;
import org.junit.Test;

public class ClericTest {

    Cleric cleric;

    @Before
    public void before(){
        cleric = new Cleric(HealingTool.HALFHEALTH, 30);
    }
}
