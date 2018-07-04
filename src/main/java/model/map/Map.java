package model.map;

import model.selectable.building.*;
import java.util.ArrayList;

public class Map {

    private static ArrayList<Building> buildings = new ArrayList<Building>();

    public Map() {

    }

    public static void addBuilding(Building building) {
        buildings.add(building);
    }

    public void removeBuilding(Building building) {
        for(Building build : buildings) {
            if (build == building) {
                buildings.remove(build);
            }
        }
    }

    public void printBuildings() {
        System.out.println("Buildings on the map: " + buildings);
    }
}