package model.selectable.building;

public class Building {
    
    private String name = "";
    private int hp = 0;
    private int constructionTime = 0;
    private int mineralCost = 0;
    private int gasCost = 0;
    private int xSize = 0;
    private int ySize = 0;

    public Building(String name, int hp, int constructionTime, int mineralCost, int gasCost, int xSize, int ySize) {
        this.name = name;
        this.hp = hp;
        this.constructionTime = constructionTime;
        this.mineralCost = mineralCost;
        this.gasCost = gasCost;
        this.xSize = xSize;
        this.ySize = ySize;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setHp(int hp) {
        this.hp = hp;
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
    }

    public int getMineralCost() {
        return this.mineralCost;
    }

    public void setGasCost(int gasCost) {
        this.gasCost = gasCost;
    }

    public int getGasCost() {
        return this.gasCost;
    }

    public void setXSize(int xSize) {
        this.xSize = xSize;
    }

    public int getXSize() {
        return this.xSize;
    }

    public void setYSize(int ySize) {
        this.ySize = ySize;
    }

    public int getYSize() {
        return this.ySize;
    }
}