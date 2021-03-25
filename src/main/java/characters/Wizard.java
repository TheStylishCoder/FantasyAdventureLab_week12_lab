package characters;

import enums.MythicalCreatureType;
import enums.SpellType;

public class Wizard extends Magician {

    public Wizard(SpellType spell, MythicalCreatureType creature){
        super(spell, creature);


    }

    public String hasName(String name) {
        return null;
    }

    public int changeHealth(int healthValue) {
        return 0;
    }
}
