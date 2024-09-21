import java.util.ArrayList;
import java.util.Arrays;

public class Healer<C extends Character> extends Character implements iHealer {
    private double currentMana;
    private double maxMana;

    public Healer(String name) {
        super(name);
        maxMana = 50;
        currentMana = 50;
    }

    public double getCurrentMana() {
        return currentMana;
    }

    public double getMaxMana() {
        return maxMana;
    }

    @Override
    public void displayActions() {
        System.out.println("1 - 'Quick heal'");
        System.out.println("2 - 'Small heal'");
        System.out.println("3 - 'Major heal'");
    }

    @Override
    public void heal(Character target, int actionNumber) {
        switch(actionNumber) {
            case 1: {
                System.out.println("Casting 'Quick heal'...");
                target.increaseHealth(10);
                currentMana -= currentMana * 5 / 100;
                System.out.println(target.getName() + "'s health was increased up to " + target.getCurrentHealth());
            }
            break;
            case 2: {
                System.out.println("Casting 'Small heal'...");
                target.increaseHealth(20);
                currentMana -= currentMana * 12 / 100;
                System.out.println(target.getName() + "'s health was increased up to " + target.getCurrentHealth());
            }
            break;
            case 3: {
                System.out.println("Casting 'Major heal'...");
                target.increaseHealth(50);
                currentMana -= currentMana * 25 / 100;
                System.out.println(target.getName() + "'s health was increased up to " + target.getCurrentHealth());
            }
            break;
            default: {
                System.out.println("Choose one of the following actions:");
                this.displayActions();
            }
        }
    }
}
