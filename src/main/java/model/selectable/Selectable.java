package model.selectable;

import java.util.Observable;

public class Selectable extends Observable {
    private String name = "";
    private int hp = 0;
    private int constructionTime = 0;
    private int mineralCost = 0;
    private int gasCost = 0;
    private int armor = 0;
    private int attack = 0;
    private String race = "";
    private boolean isFlying = false;
    private boolean isBuildable = false;

    public Selectable(String name, int hp, int constructionTime, int mineralCost, int gasCost, boolean isBuildable, int armor, String race, boolean isFlying, int attack) {
        this.name = name;
        this.hp = hp;
        this.constructionTime = constructionTime;
        this.mineralCost = mineralCost;
        this.gasCost = gasCost;
        this.isBuildable = false;
        this.armor = armor;
        this.race = race;
        this.isFlying = isFlying;
        this.attack = attack;
    }

    public void setName(String name) {
        this.name = name;
        setChanged();
        notifyObservers(name);
    }

    public String getName() {
        return this.name;
    }

    public void setHp(int hp) {
        this.hp = hp;
        setChanged();
        notifyObservers();
    }

    public int getHp() {
        return this.hp;
    }

    public void setConstructionTime(int constructionTime) {
        this.constructionTime = constructionTime;
    }

    public int getConstructionTime() {
        return this.constructionTime;
    }

    public void setMineralCost(int mineralCost) {
        this.mineralCost = mineralCost;
        setChanged();
        notifyObservers();
    }

    public int getMineralCost() {
        return this.mineralCost;
    }

    public void setGasCost(int gasCost) {
        this.gasCost = gasCost;
        setChanged();
        notifyObservers();
    }

    public int getGasCost() {
        return this.gasCost;
    }

    public void setBuildable(boolean isBuildable) {
        this.isBuildable = isBuildable;
        setChanged();
        notifyObservers();
    }

    public boolean getBuildable() {
        return isBuildable;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getArmor() {
        return this.armor;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getRace() {
        return race;
    }

    public void setFlying(boolean isFlying) {
        this.isFlying = isFlying;
    }

    public boolean getFlying() {
        return isFlying;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getAttack() {
        return this.attack;
    }
}
