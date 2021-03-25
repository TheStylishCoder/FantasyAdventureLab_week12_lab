package characterTests;

import characters.Knight;
import enums.WeaponType;
import org.junit.Before;

public class KnightClassTest {

    Knight knight;

    @Before
    public void before(){
        knight = new Knight(WeaponType.SWORD);
    }
}
