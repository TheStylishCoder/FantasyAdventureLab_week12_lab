package enums;

public enum MythicalCreatureType {
    DRAGON(50),
    PHOENIX(40),
    CENTAUR(30);

    private final int defence;

    MythicalCreatureType(int defence){
        this.defence = defence;
    }

}
