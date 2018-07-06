package model.selectable.unit;

public class Unit extends model.selectable.Selectable {

    private String name = "";
    private int hp = 0;
    private int constructionTime = 0;
    private int mineralCost = 0;
    private int gasCost = 0;
    private int supplyCost = 0;
    private float movementSpeed = 0f;
    private boolean isBuildable = false;

    public Unit(String name, int hp, int constructionTime, int mineralCost, int gasCost, boolean isBuildable, int supplyCost, float movementSpeed) {
        super(name, hp, constructionTime, mineralCost, gasCost, isBuildable);
        this.supplyCost = supplyCost;
        this.movementSpeed = movementSpeed;
    }

    public void setMovementSpeed(float movementSpeed) {
        this.movementSpeed = movementSpeed;
        setChanged();
        notifyObservers();
    }

    public float getMovementSpeed() {
        return this.movementSpeed;
    }

    public void setSupplyCost(int supplyCost) {
        this.supplyCost = supplyCost;
        setChanged();
        notifyObservers();
    }

    public int getSupplyCost() {
        return this.supplyCost;
    }
}
