public class Warrior<E extends Character> extends Character implements iDPS {
    private double currentEnergy;
    private double maxEnergy;

    public Warrior(String name) {
        super(name);
        maxEnergy = 100;
        currentEnergy = maxEnergy;
    }

    @Override
    void displayActions() {
        System.out.println("1 - 'Quick strike'");
        System.out.println("2 - 'Power slash'");
        System.out.println("3 - 'Cleave'");
    }

    @Override
    public void attack(Character target, int actionNumber) {
        switch(actionNumber) {
            case 1: {
                System.out.println("Performing 'Quick strike'...");
                target.decreaseHealth(10);
                currentEnergy -= currentEnergy * 5 / 100;
                System.out.println(target.getName() + "'s health was decreased to " + target.getCurrentHealth());
            }
            break;
            case 2: {
                System.out.println("Performing 'Power slash'...");
                target.increaseHealth(20);
                currentEnergy -= currentEnergy * 12 / 100;
                System.out.println(target.getName() + "'s health was decreased up to " + target.getCurrentHealth());
            }
            break;
            case 3: {
                System.out.println("Performing 'Cleave'...");
                target.increaseHealth(50);
                currentEnergy -= currentEnergy * 25 / 100;
                System.out.println(target.getName() + "'s health was decreased up to " + target.getCurrentHealth());
            }
            break;
            default: {
                System.out.println("Choose one of the following actions:");
                this.displayActions();
            }
        }
    }
}
