import java.util.ArrayList;
import java.util.Arrays;

public class Healer<C extends Character> extends Character implements iHealer {
    private double currentMana;
    private double maxMana;
    private ArrayList<HealAction> actions;

    public Healer(String name) {
        super(name);
        maxMana = 50;
        currentMana = 50;
        actions = new ArrayList<>(Arrays.asList(new HealAction("Quick heal", 1, 10, 5), new HealAction("Small heal", 1.5, 20, 10), new HealAction("Major heal", 3, 50, 25)));actions.put("Small heal", );
    }

    public double getCurrentMana() {
        return currentMana;
    }

    public double getMaxMana() {
        return maxMana;
    }

    @Override
    public void heal(Character target, int actionNumber) {
        switch(actionNumber) {
            case 1: {
                target.increaseHealth(10);
            }
        }
    }

    @Override
    public void restoreMana(int seconds) {

    }
}
