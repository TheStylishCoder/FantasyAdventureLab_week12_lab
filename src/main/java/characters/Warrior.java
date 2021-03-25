package characters;

import behaviours.ICharacter;
import enums.WeaponType;

public abstract class Warrior implements ICharacter {
    WeaponType weapon;

    public Warrior(WeaponType weapon) {
        this.weapon = weapon;
    }
}
