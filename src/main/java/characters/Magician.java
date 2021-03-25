package characters;

import behaviours.ICharacter;

public abstract class Magician implements ICharacter {
    SpellType spell;
    MythicalCreatureType creature;

    public Magician(SpellType spell, MythicalCreatureType creature){
        this.spell = spell;
        this.creature = creature;
    }


}
