package model.selectable.building;

import model.player.Player;

public class Building extends model.selectable.Selectable {
    
    private String name = "";
    private int hp = 0;
    private int constructionTime = 0;
    private int mineralCost = 0;
    private int gasCost = 0;
    private int xSize = 0;
    private int ySize = 0;
    private boolean isBuildable = false;

    public Building(String name, int hp, int constructionTime, int mineralCost, int gasCost, int xSize, int ySize, boolean isBuildable) {
        super(name, hp, constructionTime, mineralCost, gasCost, isBuildable);
        this.xSize = xSize;
        this.ySize = ySize;
    }

    public void activateBuildingEffect(Building building, Player player) {
        System.out.println("Building effect activated!.. this should never happen!!..hurray!!!");
    }

    public void deactivateBuildingEffect(Building building, Player player) {
        System.out.println("Building effect deactivated!.. this should never happen!!..hurray!!!");
    }

    public boolean hasAccessTechTree() {
        return false;
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