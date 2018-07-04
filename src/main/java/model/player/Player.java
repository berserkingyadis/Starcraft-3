package model.player;

import model.map.Map;
import model.game.Game;
import model.selectable.building.Building;

public class Player {

    private Game game;

    private int minerals = 0;
    private int gas = 0;
    private int supply = 0;
    private int maxSupply = 0;

    public Player(int minerals, int gas, int supply, int maxSupply) {
        this.minerals = minerals;
        this.gas = gas;
        this.supply = supply;
        this.maxSupply = maxSupply;
    }

    public void createBuilding(String buildingName) {
        for(Building build : game.getBuildings()) {
            if(buildingName.equals(build.getName())) {

            }
        }
    }

//    public void deleteBuilding(Building building) {
//        map.removeBuilding(building);
//    }

    public void setMinerals(int minerals) {
        this.minerals = minerals;
    }

    public int getMinerals() {
        return this.minerals;
    }

    public void setGas(int gas) {
        this.gas = gas;
    }

    public int getGas() {
        return this.gas;
    }

    public void setSupply(int supply) {
        this.supply = supply;
    }

    public int getSupply() {
        return this.supply;
    }

    public void setMaxSupply(int maxSupply) {
        this.maxSupply = maxSupply;
    }

    public int getMaxSupply() {
        return this.maxSupply;
    }
}