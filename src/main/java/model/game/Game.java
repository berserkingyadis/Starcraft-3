package model.game;

import model.map.Map;
import model.player.Player;

public class Game {

    public void run() {
        Map map = new Map();
        Player player = new Player(0, 0, 0, 0, "Protoss");
        player.initializeBuildings();
        player.createBuilding("Nexus", player.getAllBuildings(), map);
        player.createBuilding("Nexus", player.getAllBuildings(), map);
        player.createBuilding("Nexus", player.getAllBuildings(), map);
        player.removeBuilding(map.getBuildingByIndex(1), map);
        player.removeBuilding(map.getBuildingByIndex(1), map);
        //player.removeBuilding(map.getBuildingByIndex(0), map);
        map.printBuildings();
        map.printUnits();
    }
}
