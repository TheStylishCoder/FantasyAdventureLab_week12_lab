package game;

public class BattleRoom extends Room {
    EnemyType enemy;

    public BattleRoom(String name, boolean roomComplete, EnemyType enemy){
        super(name, roomComplete);
        this.enemy = enemy;
    }
}
