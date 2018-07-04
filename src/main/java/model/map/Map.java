package model.map;

import model.selectable.building.*;
import java.util.ArrayList;

public class Map {

    private ArrayList<Building> buildings = new ArrayList<Building>();

    public Map() {
    }

    public void addBuilding(Building building) {
        buildings.add(building);
    }

    public void removeBuilding(Building building) {
        buildings.remove(building);
    }

    public Building getBuildingByIndex(int index) {
        return buildings.get(index);
    }

    public void printBuildings() {
        System.out.println("Buildings on the map: " + buildings);
    }
}