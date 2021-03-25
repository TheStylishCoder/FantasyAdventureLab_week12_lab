package enums;

public enum SpellType {

    ICEBLAST(40),
    CRYSTALDEATH(50),
    FIREWALL(30),
    BLASTOID(30);

    private final int attackValue;

    SpellType(int attackValue) {
        this.attackValue = attackValue;
    }
}
