package characters;

import enums.MythicalCreatureType;
import enums.SpellType;
import player.Player;

public class Warlock extends Magician {

    public Warlock(SpellType spell, MythicalCreatureType creature){
        super(spell, creature);
    }

    public void changeHealth(Player player, int healthValue){

    }
}
