package characters;

import behaviours.ICharacter;
import enums.WeaponType;

public abstract class Warrior implements ICharacter {
    WeaponType weapon;

    public Warrior(WeaponType weapon) {
        this.weapon = weapon;
    }

    public WeaponType getWeapon(){
        return this.weapon;
    }

    public void changeWeapon(WeaponType weapon){
        this.weapon = weapon;
    }
}
