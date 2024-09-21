public interface iHealer <E extends Character> {
    public void heal(E target, double healAmount);
    public void restoreMana(int seconds);
}
