package model.map;

import model.selectable.building.*;
import model.selectable.unit.*;
import java.util.ArrayList;
import java.util.Observable;

public class Map extends Observable {

    private ArrayList<Building> buildings = new ArrayList<Building>();
    private ArrayList<Unit> units = new ArrayList<Unit>();

    public Map() {
    }

    public void addBuilding(Building building) {
        buildings.add(building);
        setChanged();
        notifyObservers();
    }

    public void removeBuilding(Building building) {
        buildings.remove(building);
        setChanged();
        notifyObservers();
    }

    public void addUnit(Unit unit) {
        units.add(unit);
        setChanged();
        notifyObservers();
    }

    public void removeUnit(Unit unit) {
        units.remove(unit);
        setChanged();
        notifyObservers();
    }

    public Building getBuildingByIndex(int index) {
        return buildings.get(index);
    }

    public Unit getUnitByIndex(int index) {
        return units.get(index);
    }

    public ArrayList<Building> getBuildings() {
        return this.buildings;
    }

    public ArrayList<Unit> getUnits() {
        return this.units;
    }

    /**
     * Should be in view. Controller presses button, and it displays the units in the console.
     */
    public void printUnits() {
        System.out.println("Units on the map: " + units);
    }

    /**
     * Should be in view. Controller presses button, and it displays the buildings in the console.
     */
    public void printBuildings() {
        System.out.println("Buildings on the map: " + buildings);
    }
}