public class Mage<E extends Character> extends Character implements iDPS{
    private double currentMana;
    private double maxMana;

    public Mage(String name) {
        super(name);
        maxMana = 100;
        currentMana = maxMana;
    }

    @Override
    void displayActions() {
        System.out.println("1 - 'Fire Bolt'");
        System.out.println("2 - 'Frost Nova'");
        System.out.println("3 - 'Arcane Blast'");
    }

    @Override
    public void attack(Character target, int actionNumber) {

        switch(actionNumber) {
            case 1: {
                System.out.println("Casting 'Fire Bolt'...");
                target.decreaseHealth(10);
                currentMana -= currentMana * 5 / 100;
                System.out.println(target.getName() + "'s health was decreased to " + target.getCurrentHealth());
            }
            break;
            case 2: {
                System.out.println("Casting 'Frost Nova'...");
                target.increaseHealth(20);
                currentMana -= currentMana * 12 / 100;
                System.out.println(target.getName() + "'s health was decreased up to " + target.getCurrentHealth());
            }
            break;
            case 3: {
                System.out.println("Casting 'Arcane Blast'...");
                target.increaseHealth(50);
                currentMana -= currentMana * 25 / 100;
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
