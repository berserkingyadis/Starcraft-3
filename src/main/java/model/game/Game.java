package model.game;

import model.selectable.building.*;
import model.selectable.unit.*;
import model.selectable.building.protoss.*;
import model.map.Map;
import model.player.Player;
import java.util.ArrayList;

public class Game {

    private ArrayList<Building> allBuildings = new ArrayList<Building>();
    private ArrayList<Unit> units = new ArrayList<Unit>();

    public void run() {
        Map map = new Map();
        Player player = new Player(0, 0, 0, 0);
        initializeBuildings();
        player.createBuilding("Pylon", allBuildings, map);
        player.createBuilding("Pylon", allBuildings, map);
        player.createBuilding("Nexus", allBuildings, map);
        player.removeBuilding(map.getBuildingByIndex(1), map);
        player.removeBuilding(map.getBuildingByIndex(1), map);
        System.out.println(player.getMaxSupply());
        System.out.println(map.getBuildingByIndex(0).getBuildable());
        map.printBuildings();
    }

    public void initializeBuildings() {
        Building pylon = new Pylon();
        allBuildings.add(pylon);
        Building nexus = new Nexus();
        allBuildings.add(nexus);
    }

    public ArrayList<Building> getAllBuildings() {
        return allBuildings;
    }
}
