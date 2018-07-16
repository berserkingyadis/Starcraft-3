package model.selectable.unit;

public class Unit extends model.selectable.Selectable {

    private int supplyCost = 0;
    private int groundWeaponUpgrade = 0;
    private int groundArmorUpgrade = 0;
    private int flightWeaponUpgrade = 0;
    private int flightArmorUpgrade = 0;
    private float movementSpeed = 0f;

    public Unit(String name, int hp, int constructionTime, int mineralCost, int gasCost, boolean isBuildable, int supplyCost, float movementSpeed, int armor, String race, boolean isFlying, int attack, int groundWeaponUpgrade, int groundArmorUpgrade, int flightWeaponUpgrade, int flightArmorUpgrade) {
        super(name, hp, constructionTime, mineralCost, gasCost, isBuildable, armor, race, isFlying, attack);
        this.supplyCost = supplyCost;
        this.movementSpeed = movementSpeed;
        this.groundWeaponUpgrade = groundWeaponUpgrade;
        this.groundArmorUpgrade = groundArmorUpgrade;
        this.flightWeaponUpgrade = flightWeaponUpgrade;
        this.flightArmorUpgrade = flightArmorUpgrade;
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

    public void setGroundWeaponUpgrade(int groundWeaponUpgrade) {
        this.groundWeaponUpgrade = groundWeaponUpgrade;
    }

    public int getGroundWeaponUpgrade() {
        return groundWeaponUpgrade;
    }

    public void setGroundArmorUpgrade(int groundArmorUpgrade) {
        this.groundArmorUpgrade = groundArmorUpgrade;
    }

    public int getGroundArmorUpgrade() {
        return groundArmorUpgrade;
    }

    public void setFlightWeaponUpgrade(int flightWeaponUpgrade) {
        this.flightWeaponUpgrade = flightWeaponUpgrade;
    }

    public int getFlightWeaponUpgrade() {
        return flightWeaponUpgrade;
    }

    public void setFlightArmorUpgrade(int flightArmorUpgrade) {
        this.flightArmorUpgrade = flightArmorUpgrade;
    }

    public int getFlightArmorUpgrade() {
        return flightArmorUpgrade;
    }
}
