package model.player;

import model.map.Map;
import model.game.Game;
import model.selectable.building.Building;

import java.util.ArrayList;

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

    public void createBuilding(String buildingName, ArrayList<Building> list, Map map) {
        if(!list.isEmpty()) {
            for(Building build : list) {
                if(buildingName.equals(build.getName())) {
                    try {
                        Building newBuilding = build.getClass().newInstance();
                        map.addBuilding(newBuilding);
                        newBuilding.activateBuildingEffect(newBuilding, this);
                    } catch (InstantiationException e) {
                        e.printStackTrace();
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        else {
            System.out.println("List is empty; no buildings to compare to...");
        }
    }

    public void removeBuilding(Building building, Map map) {
        map.removeBuilding(building);
        building.deactivateBuildingEffect(building, this);
    }

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