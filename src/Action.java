public abstract class Action {
    private String name;
    private double time; // in seconds
    private int resourceCost; // percents

    public Action(String name, double time, int resourceCost) {
        this.name = name;
        this.time = time;
        this.resourceCost = resourceCost;
    }

    public String getName() {
        return name;
    }

    public int getResourceCost() {
        return resourceCost;
    }

    public double getTime() {
        return time;
    }
}
