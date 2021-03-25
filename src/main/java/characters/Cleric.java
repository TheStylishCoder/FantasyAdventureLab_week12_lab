package characters;

import behaviours.ICharacter;
import enums.HealingTool;

public class Cleric implements ICharacter {

    HealingTool healingTool;
    int shield;

    public Cleric(HealingTool healingTool, int shield){
        this.healingTool = healingTool;
        this.shield = shield;
    }

    public String hasName(String name) {
        return null;
    }

    public int changeHealth(int healthValue) {
        return 0;
    }
}
