package characters;

import enums.WeaponType;

public class Dwarf extends Warrior {

    public Dwarf(WeaponType weapon){
        super(weapon);
    }

    public String hasName(String name) {
        return null;
    }

    public int changeHealth(int healthValue) {
        return 0;
    }
}
