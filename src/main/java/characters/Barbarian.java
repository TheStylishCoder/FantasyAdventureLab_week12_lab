package characters;

import enums.WeaponType;
import player.Player;

public class Barbarian extends Warrior {

    public Barbarian(WeaponType weapon){
        super(weapon);
    }


    public void changeHealth(Player player, int healthValue) {
        int currentHealth = player.getHealthPoints();
        player.setHealthPoints(currentHealth - healthValue) ;
    }
}
