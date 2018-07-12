package model.selectable.unit.protoss;

public class ProtossUnit extends model.selectable.unit.Unit {

    private int shield = 0;
    private int shieldRegeneration = 0;
    private int shieldUpgrade = 0;

    public ProtossUnit(String name, int hp, int constructionTime, int mineralCost, int gasCost, boolean isBuildable, int supplyCost, float movementSpeed, int shield, int shieldRegeneration, int armor, boolean isFlying, int attack, int groundWeaponUpgrade, int groundArmorUpgrade, int flightWeaponUpgrade, int flightArmorUpgrade, int shieldUpgrade) {
        super(name, hp, constructionTime, mineralCost, gasCost, isBuildable, supplyCost, movementSpeed, armor, "Protoss", isFlying, attack, groundWeaponUpgrade, groundArmorUpgrade, flightWeaponUpgrade, flightArmorUpgrade);
        this.shield = shield;
        this.shieldUpgrade = shieldUpgrade;
        this.shieldRegeneration = shieldRegeneration;
    }

    public void setShield(int shield) {
        this.shield = shield;
        setChanged();
        notifyObservers();
    }

    public int getShield() {
        return this.shield;
    }

    public void setShieldRegeneration(int shieldRegeneration) {
        this.shieldRegeneration = shieldRegeneration;
        setChanged();
        notifyObservers();
    }

    public int getShieldRegeneration() {
        return this.shieldRegeneration;
    }

    public void setShieldUpgrade(int shieldUpgrade) {
        this.shieldUpgrade = shieldUpgrade;
    }

    public int getShieldUpgrade() {
        return shieldUpgrade;
    }
}
