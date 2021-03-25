package enums;

public enum WeaponType {

    SWORD(10),
    AXE(20),
    CLUB(15),
    SPEAR(25);

    private final int attackValue;

    WeaponType(int attackValue){
        this.attackValue = attackValue;
    }
}
