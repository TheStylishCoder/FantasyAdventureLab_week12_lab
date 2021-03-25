package enums;

public enum EnemyType {

    BALLOONBORRIS1(30, 5),
    PIGEONDETECTIVE2(50, 20),
    TROUBLESOMETROLL3(70, 30),
    DRAGOSDRAGON4(150, 40);

    private final int healthValue;
    private final int attackValue;

    public EnemyType(int healthValue, int attackValue){
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }
}
