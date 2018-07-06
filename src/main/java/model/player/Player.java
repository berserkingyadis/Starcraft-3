package model.player;

import model.map.Map;
import model.selectable.building.Building;
import model.selectable.building.protoss.Nexus;
import model.selectable.building.protoss.Pylon;
import model.selectable.unit.Unit;

import java.util.ArrayList;

public class Player {

    private ArrayList<Building> allBuildings = new ArrayList<Building>();
    private ArrayList<Unit> allUnits = new ArrayList<Unit>();

    private ArrayList<Building> playerBuildings = new ArrayList<Building>();
    private ArrayList<Unit> playerUnits = new ArrayList<Unit>();

    private int minerals = 0;
    private int gas = 0;
    private int supply = 0;
    private int maxSupply = 0;

    private String race = "";

    private boolean hasNexus = false;
    private boolean hasGateway = false;
    private boolean hasCyberneticsCore = false;
    private boolean hasRoboticsBay = false;
    private boolean hasRoboticsFacility = false;
    private boolean hasStargate = false;
    private boolean hasFleetBeacon = false;
    private boolean hasTwilightCouncil = false;
    private boolean hasTemplarArchives = false;
    private boolean hasDarkShrine = false;
    private boolean hasForge = false;

    public Player(int minerals, int gas, int supply, int maxSupply, String race) {
        this.minerals = minerals;
        this.gas = gas;
        this.supply = supply;
        this.maxSupply = maxSupply;
        this.race = race;
    }

    public void initializeBuildings() {
        Building pylon = new Pylon();
        allBuildings.add(pylon);
        Building nexus = new Nexus();
        allBuildings.add(nexus);
    }

    public void createUnit(String unitName, ArrayList<Unit> list, Map map) {
        if(!list.isEmpty()) {
            for(Unit u : list) {
                if(unitName.equals(u.getName())) {
                    try {
                        Unit newUnit = u.getClass().newInstance();
                        map.addUnit(newUnit);
                        // TODO unit.refreshStats();
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InstantiationException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public void createBuilding(String buildingName, ArrayList<Building> list, Map map) {
        if(!list.isEmpty()) {
            for(Building build : list) {
                if(buildingName.equals(build.getName())) {
                    try {
                        Building newBuilding = build.getClass().newInstance();
                        map.addBuilding(newBuilding);
                        playerBuildings.add(newBuilding);
                        newBuilding.activateBuildingEffect(newBuilding, this);
                    } catch (InstantiationException e) {
                        e.printStackTrace();
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        else {
            System.out.println("List is empty; no buildings to compare to...");
        }
    }

    public void removeBuilding(Building building, Map map) {
        map.removeBuilding(building);
        playerBuildings.remove(building);
        building.deactivateBuildingEffect(building, this);
    }

    public void setMinerals(int minerals) {
        this.minerals = minerals;
    }

    public int getMinerals() {
        return this.minerals;
    }

    public void setGas(int gas) {
        this.gas = gas;
    }

    public int getGas() {
        return this.gas;
    }

    public void setSupply(int supply) {
        this.supply = supply;
    }

    public int getSupply() {
        return this.supply;
    }

    public void setMaxSupply(int maxSupply) {
        this.maxSupply = maxSupply;
    }

    public int getMaxSupply() {
        return this.maxSupply;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getRace() {
        return this.race;
    }

    public void setHasNexus(boolean hasNexus) {
        this.hasNexus = hasNexus;
    }

    public boolean getHasNexus() {
        return this.hasNexus;
    }

    public void setHasGateway(boolean hasGateway) {
        this.hasGateway = hasGateway;
    }

    public boolean getHasGateway() {
        return this.hasGateway;
    }

    public void setHasCyberneticsCore(boolean hasCyberneticsCore) {
        this.hasCyberneticsCore = hasCyberneticsCore;
    }

    public boolean getHasCyberneticsCore() {
        return this.hasCyberneticsCore;
    }

    public void setHasRoboticsBay(boolean hasRoboticsBay) {
        this.hasRoboticsBay = hasRoboticsBay;
    }

    public boolean getHasRoboticsBay() {
        return this.hasRoboticsBay;
    }

    public void setHasRoboticsFacility(boolean hasRoboticsFacility) {
        this.hasRoboticsFacility = hasRoboticsFacility;
    }

    public boolean getHasRoboticsFacility() {
        return this.hasRoboticsFacility;
    }

    public void setHasStargate(boolean hasStargate) {
        this.hasStargate = hasStargate;
    }

    public boolean getHasStargate() {
        return this.hasStargate;
    }

    public void setHasFleetBeacon(boolean hasFleetBeacon) {
        this.hasFleetBeacon = hasFleetBeacon;
    }

    public boolean getHasFleetBeacon() {
        return this.hasFleetBeacon;
    }

    public void setHasTwilightCouncil(boolean hasTwilightCouncil) {
        this.hasTwilightCouncil = hasTwilightCouncil;
    }

    public boolean getHasTwilightCouncil() {
        return this.hasTwilightCouncil;
    }

    public void setHasTemplarArchives(boolean hasTemplarArchives) {
        this.hasTemplarArchives = hasTemplarArchives;
    }

    public boolean getHasTemplarArchives() {
        return this.hasTemplarArchives;
    }

    public void setHasDarkShrine(boolean hasDarkShrine) {
        this.hasDarkShrine = hasDarkShrine;
    }

    public boolean getHasDarkShrine() {
        return this.hasDarkShrine;
    }

    public void setHasForge(boolean hasForge) {
        this.hasForge = hasForge;
    }

    public boolean getHasForge() {
        return this.hasForge;
    }

    public ArrayList<Building> getAllBuildings() {
        return this.allBuildings;
    }

    public ArrayList<Building> getPlayerBuildings() {
        return this.playerBuildings;
    }

    public ArrayList<Unit> getPlayerUnits() {
        return this.playerUnits;
    }

}