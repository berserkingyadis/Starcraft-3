package model.selectable.building.protoss;

import model.map.Map;
import model.player.Player;
import model.selectable.building.Building;
import model.selectable.building.BuildingInterface;
import model.selectable.building.UnitConstructorBuilding;
import model.selectable.unit.Unit;

import java.util.ArrayList;

public class Gateway extends ProtossBuilding {

    private ArrayList<Unit> units = new ArrayList<Unit>();

    public Gateway() {
        super("Gateway", 500, 46, 150, 0, 3, 3, 500, false, 5, 1);
        this.setBuildable(false);
    }

    /*public void initializeUnitList() {
        Unit zealot = new Zealot();
        units.add(zealot);
        Unit stalker = new Stalker();
        units.add(stalker);
        Unit sentry = new Sentry();
        units.add(sentry);
        Unit adept = new Adept();
        units.add(adept);
        Unit highTemplar = new HighTemplar();
        units.add(highTemplar);
        Unit darkTemplar = new DarkTemplar();
        units.add(darkTemplar);
    }

    public void createUnit(String name, Player player, Map map) {
        switch(name) {
            case "Zealot": createZealot();
                break;
            case "Stalker": createStalker();
                break;
            case "Sentry": createSentry();
                break;
            case "Adept": createAdept();
                break;
            case "High Templar": createHighTemplar();
                break;
            case "Dark Templar": createDarkTemplar();
                break;
            default:
                System.out.println("Could not find the unit to be created! This should never happen.");
        }
    }
*/
    public void activateBuildingEffect(Building building, Player player) {
        player.setHasGateway(true);
    }

    public void deactivateBuildingEffect(Building building, Player player) {
        int counter = 0;
        for(Building build : player.getPlayerBuildings()) {
            if(build.getName().equals(building.getName())) {
                counter++;
            }
        }
        if(counter == 1) {
            player.setHasGateway(false);
            System.out.println("The player does not have any Gateways anymore.");
        }
        System.out.println("Gateway destroyed!");
    }

    public void convertToWarpGate() {
        // TODO: implement this
    }
}
