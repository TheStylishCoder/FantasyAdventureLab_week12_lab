package enums;

public enum HealingTool {

    FULLHEALTH(100),
    HALFHEALTH(50),
    WINE(10),
    SNACK(20);

    private final int healingValue;

    HealingTool(int healingValue) {
        this.healingValue = healingValue;
    }
}
