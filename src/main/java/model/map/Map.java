package model.map;

import model.selectable.building.*;
import model.selectable.unit.*;
import java.util.ArrayList;

public class Map {

    private ArrayList<Building> buildings = new ArrayList<Building>();
    private ArrayList<Unit> units = new ArrayList<Unit>();

    public Map() {
    }

    public void addBuilding(Building building) {
        buildings.add(building);
    }

    public void removeBuilding(Building building) {
        buildings.remove(building);
    }

    public void addUnit(Unit unit) {
        units.add(unit);
    }

    public void removeUnit(Unit unit) {
        units.remove(unit);
    }

    public Building getBuildingByIndex(int index) {
        return buildings.get(index);
    }

    public Unit getUnitByIndex(int index) {
        return units.get(index);
    }

    public void printUnits() {
        System.out.println("Units on the map: " + units);
    }

    public void printBuildings() {
        System.out.println("Buildings on the map: " + buildings);
    }
}