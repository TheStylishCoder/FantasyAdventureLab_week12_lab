package characters;

import enums.MythicalCreatureType;
import enums.SpellType;
import player.Player;

public class Wizard extends Magician {

    public Wizard(SpellType spell, MythicalCreatureType creature){
        super(spell, creature);


    }

    public void changeHealth(Player player, int healthValue){

    }
}
