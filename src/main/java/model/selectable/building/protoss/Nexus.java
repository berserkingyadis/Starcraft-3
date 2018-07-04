package model.selectable.building.protoss;

public class Nexus extends ProtossBuilding{

    public Nexus() {
        super("Nexus", 400, 120, 100, 0, 2, 2, 200, true, 10); // TODO fix the values
        this.setBuildable(true);
    }
}
