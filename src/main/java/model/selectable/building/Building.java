package model.selectable.building;

import model.player.Player;
import view.ConsoleView;

public class Building extends model.selectable.Selectable {
    
    private String name = "";
    private int hp = 0;
    private int constructionTime = 0;
    private int mineralCost = 0;
    private int gasCost = 0;
    private int xSize = 0;
    private int ySize = 0;
    private boolean isBuildable = false;

    public Building(String name, int hp, int constructionTime, int mineralCost, int gasCost, int xSize, int ySize, boolean isBuildable, int armor, String race, int attack) {
        super(name, hp, constructionTime, mineralCost, gasCost, isBuildable, armor, race, false, 0);
        this.xSize = xSize;
        this.ySize = ySize;
    }

    public void activateBuildingEffect(Building building, Player player) {
        ConsoleView.consoleDebug("Building effect activated!.. this should never happen!!..hurray!!!");
    }

    public void deactivateBuildingEffect(Building building, Player player) {
        ConsoleView.consoleDebug("Building effect deactivated!.. this should never happen!!..hurray!!!");
    }

    public boolean hasAccessTechTree() {
        return false;
    }

    public void setXSize(int xSize) {
        this.xSize = xSize;
        setChanged();
        notifyObservers();
    }

    public int getXSize() {
        return this.xSize;
    }

    public void setYSize(int ySize) {
        this.ySize = ySize;
        setChanged();
        notifyObservers();
    }

    public int getYSize() {
        return this.ySize;
    }

}