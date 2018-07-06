package model.selectable.building.protoss;

import model.player.Player;
import model.selectable.building.Building;
import view.ConsoleView;

public class Pylon extends ProtossBuilding implements model.selectable.building.BuildingInterface {

	public Pylon() {
        super("Pylon", 200, 18, 100, 0, 2, 2, 200, true, 10);
        this.setBuildable(true);
	}

    public void activateBuildingEffect(Building building, Player player) {
	    // This print should be done when pressing a button. So the button is pressed and calls the function in view that
        // states "Increasing supply cap!".
	    ConsoleView.consoleDebug("Increasing supply cap!");
	    player.setMaxSupply(player.getMaxSupply() + 8);
    }

    public void deactivateBuildingEffect(Building building, Player player) {
        // This print should be done when pressing a button. So the button is pressed and calls the function in view that
        // states "Decreasing supply cap!".
	    ConsoleView.consoleDebug("Decreasing supply cap!");
	    player.setMaxSupply(player.getMaxSupply() - 8);
    }
}