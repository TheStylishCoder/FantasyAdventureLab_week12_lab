package characters;

import enums.MythicalCreatureType;
import enums.SpellType;

public class Warlock extends Magician {

    public Warlock(SpellType spell, MythicalCreatureType creature){
        super(spell, creature);
    }

    public String hasName(String name) {
        return null;
    }

    public int changeHealth(int healthValue) {
        return 0;
    }
}
