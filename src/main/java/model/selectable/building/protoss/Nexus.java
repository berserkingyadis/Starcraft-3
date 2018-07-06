package model.selectable.building.protoss;

import model.map.Map;
import model.player.Player;
import model.selectable.unit.protoss.*;
import model.selectable.building.Building;
import model.selectable.building.BuildingInterface;
import model.selectable.building.UnitConstructorBuilding;
import model.selectable.unit.Unit;

import java.util.ArrayList;

public class Nexus extends ProtossBuilding implements BuildingInterface, UnitConstructorBuilding {

    private ArrayList<Unit> units = new ArrayList<Unit>();
    private static Map map; //TODO rethink this, even though a nexus has a map and a player it is attributed to, it can be made better
    private static Player player;

    public Nexus() {
        super("Nexus", 400, 120, 100, 0, 2, 2, 200, true, 10); // TODO fix the values
        this.setBuildable(true);
    }

    public void initializeUnitList() {
        Unit probe = new Probe();
        units.add(probe);
    }

    public void createUnit(String string) {
        switch (string) {
            case "Probe" : createProbe(player);
        }
    }

    public void createProbe(Player player) {
        if(player.getMinerals() >= 50) {
            player.createUnit("Probe", units, map);
        }
        else {
            System.out.println("not enough minerals...");
        }
    }

    public void activateBuildingEffect(Building building, Player player) {
        player.setHasNexus(true);
        System.out.println("Nexus created! You may build workers...");
    }

    public void deactivateBuildingEffect(Building building, Player player) {
        int counter = 0;
        for(Building build : player.getPlayerBuildings()) {
            if(build.getName().equals(building.getName())) {
                counter++;
            }
        }
        if(counter == 1) {
            player.setHasNexus(false);
            System.out.println("The player does not have any Nexi anymore.");
        }
        System.out.println("Nexus destroyed! The workers!!...");
    }
}
