public abstract class Character {
    private String name; // Encapsulation
    private int level;
    private double currentHealth;
    private double maxHealth;

    Character(String name) {
        this.name = name;
        level = 1;
        maxHealth = 200;
        currentHealth = 200;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public double getCurrentHealth() {
        return currentHealth;
    }

    public double getMaxHealth() {
        return maxHealth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void levelUp() {
        this.level++;
    }

    public void diminishHealth(double damagePercentage) {
        if (damagePercentage >= currentHealth) {
//            throw new CharacterKilled();
        } else {
            this.currentHealth -= damagePercentage;
        }
    }

    public void increaseHealth(int increasePercentage) {
        double increasedHealth = currentHealth + (currentHealth * increasePercentage / 100);
        if (increasedHealth > maxHealth) {
            this.currentHealth = maxHealth;
        } else {
            currentHealth = increasedHealth;
        }
    }

    public void increaseMaxHealth(double increase){
        this.maxHealth+= increase;
        this.currentHealth = this.maxHealth;
    }

    @Override
    public String toString() {
        return "Character details:" +
                "name - '" + name +
                ", level - " + level +
                ", maxHealth - " + maxHealth +
                ", health - " + currentHealth;
    }
}
