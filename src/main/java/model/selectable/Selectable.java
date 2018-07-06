package model.selectable;

import java.util.Observable;

public class Selectable extends Observable {
    private String name = "";
    private int hp = 0;
    private int constructionTime = 0;
    private int mineralCost = 0;
    private int gasCost = 0;
    private boolean isBuildable = false;

    public Selectable(String name, int hp, int constructionTime, int mineralCost, int gasCost, boolean isBuildable) {
        this.name = name;
        this.hp = hp;
        this.constructionTime = constructionTime;
        this.mineralCost = mineralCost;
        this.gasCost = gasCost;
        this.isBuildable = false;
    }

    public void setName(String name) {
        this.name = name;
        setChanged();
        notifyObservers();
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
}
