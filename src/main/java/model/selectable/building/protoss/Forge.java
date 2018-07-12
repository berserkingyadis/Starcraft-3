package model.selectable.building.protoss;

import model.selectable.building.BuildingInterface;

public class Forge extends ProtossBuilding implements BuildingInterface {

    public Forge() {
        super("Forge", 400, 32, 150, 0, 3, 3, 400, false, 10, 1);
        this.setBuildable(false);
    }
}
