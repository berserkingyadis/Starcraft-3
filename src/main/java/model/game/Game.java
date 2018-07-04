package model.game;

import model.selectable.building.*;
import model.selectable.unit.*;
import model.selectable.building.protoss.*;
import model.map.Map;
import model.player.Player;
import java.util.ArrayList;

public class Game {

    private ArrayList<Building> buildings = new ArrayList<Building>();
    private ArrayList<Unit> units = new ArrayList<Unit>();

    public void run() {
        Map map = new Map();
        Player player = new Player(0, 0, 10, 100);
        initializeBuildings();
        player.createBuilding("Pylon");
        map.printBuildings();
    }

    public void initializeBuildings() {
        Building pylon = new Pylon();
        buildings.add(pylon);
        Building nexus = new Nexus();
        buildings.add(nexus);
    }

    public ArrayList<Building> getBuildings() {
        return buildings;
    }
}
