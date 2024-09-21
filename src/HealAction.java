public class HealAction extends Action {
    private int healPercentage;

    HealAction(String name, double time, int healAmount, int manaRequired) {
        super(name, time, manaRequired);
        this.healPercentage = healAmount;
    }

    public double getHealPercentage() {
        return healPercentage;
    }
}
