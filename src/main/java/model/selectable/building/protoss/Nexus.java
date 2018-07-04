package model.selectable.building.protoss;

import model.player.Player;
import model.selectable.building.Building;
import model.selectable.building.BuildingInterface;

public class Nexus extends ProtossBuilding implements BuildingInterface {

    public Nexus() {
        super("Nexus", 400, 120, 100, 0, 2, 2, 200, true, 10); // TODO fix the values
        this.setBuildable(true);
    }

    public void activateBuildingEffect(Building building, Player player) {
        System.out.println("Nexus created! You may build workers...");
    }

    public void deactivateBuildingEffect(Building building, Player player) {
        System.out.println("Nexus destroyed! The workers!!...");
    }
}
