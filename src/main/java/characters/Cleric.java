package characters;

import behaviours.ICharacter;
import enums.HealingTool;
import player.Player;

public class Cleric implements ICharacter {

    HealingTool healingTool;
    int shield;

    public Cleric(HealingTool healingTool, int shield){
        this.healingTool = healingTool;
        this.shield = shield;
    }


   public void changeHealth(Player player, int healthValue){

   }
}
