package model.selectable.building.protoss;

import model.player.Player;
import model.selectable.building.Building;

public class Pylon extends ProtossBuilding implements model.selectable.building.BuildingInterface {

	public Pylon() {
        super("Pylon", 200, 18, 100, 0, 2, 2, 200, true, 10);
        this.setBuildable(true);
	}

    public void activateBuildingEffect(Building building, Player player) {
	    System.out.println("Increasing supply cap!");
	    player.setMaxSupply(player.getMaxSupply() + 8);
    }
}