package model.selectable.upgrades;

import model.player.Player;
import model.selectable.unit.Unit;

public class ProtossUpgrades implements UpgradeInterface {

    private int groundWeaponUpgrade = 0;
    private int groundArmorUpgrade = 0;
    private int flightWeaponUpgrade = 0;
    private int flightArmorUpgrade = 0;
    private int shieldUpgrade = 0;

    //TODO: EDGE CASES THROUGH CONTROLLER (ex: decrease upgrade below 0)

    public ProtossUpgrades(int groundWeaponUpgrade, int groundArmorUpgrade, int flightWeaponUpgrade, int flightArmorUpgrade, int shieldUpgrade) {
        this.groundWeaponUpgrade = groundWeaponUpgrade;
        this.groundArmorUpgrade = groundArmorUpgrade;
        this.flightWeaponUpgrade = flightWeaponUpgrade;
        this.flightArmorUpgrade = flightArmorUpgrade;
        this.shieldUpgrade = shieldUpgrade;
    }

    public void increaseUpgrade(String upgradeName, Player player) {
        for(Unit u : player.getAllUnits()) {
            if(u.getRace().equals("Protoss")) {
                switch (upgradeName) {
                    case "groundWeaponUpgrade":
                        if (!u.getFlying()) {
                            u.setGroundWeaponUpgrade(u.getGroundWeaponUpgrade() + 1);
                            if (u.getAttack() > 0) {
                                u.setAttack(u.getAttack() + 1);
                            }
                        }
                        break;
                    case "groundArmorUpgrade":
                        if (!u.getFlying()) {
                            u.setGroundArmorUpgrade(u.getGroundArmorUpgrade() + 1);
                            u.setArmor(u.getArmor() + 1);
                        }
                        break;
                    case "flightWeaponUpgrade":
                        if (u.getFlying()) {
                            u.setFlightWeaponUpgrade(u.getFlightWeaponUpgrade() + 1);
                            if (u.getAttack() > 0) {
                                u.setAttack(u.getAttack() + 1);
                            }
                        }
                        break;
                    case "flightArmorUpgrade":
                        if (u.getFlying()) {
                            u.setArmor(u.getArmor() + 1);
                            u.setFlightArmorUpgrade(u.getFlightArmorUpgrade() + 1);
                        }
                        break;
                }
            }
        }
    }

    public void decreaseUpgrade(String upgradeName, Player player) {
        for(Unit u : player.getAllUnits()) {
            if(u.getRace().equals("Protoss")) {
                switch (upgradeName) {
                    case "groundWeaponUpgrade":
                        if (!u.getFlying()) {
                            u.setGroundWeaponUpgrade(u.getGroundWeaponUpgrade() - 1);
                            if(u.getAttack() > 0) {
                                u.setAttack(u.getAttack() - 1);
                            }

                        }
                        break;
                    case "groundArmorUpgrade":
                        if (!u.getFlying()) {
                            u.setGroundArmorUpgrade(u.getGroundArmorUpgrade() - 1);
                            u.setArmor(u.getArmor() - 1);
                        }
                        break;
                    case "flightWeaponUpgrade":
                        if (u.getFlying()) {
                            u.setFlightWeaponUpgrade(u.getFlightWeaponUpgrade() - 1);
                            if(u.getAttack() > 0) {
                                u.setAttack(u.getAttack() - 1);
                            }
                        }
                        break;
                    case "flightArmorUpgrade":
                        if (u.getFlying()) {
                            u.setFlightArmorUpgrade(u.getFlightArmorUpgrade() - 1);
                            u.setArmor(u.getArmor() - 1);
                        }
                        break;
                }
            }
        }
    }

    public void setGroundWeaponUpgrade(int groundWeaponUpgrade) {
        this.groundWeaponUpgrade = groundWeaponUpgrade;
    }

    public int getGroundWeaponUpgrade() {
        return groundWeaponUpgrade;
    }

    public void setGroundArmorUpgrade(int groundArmorUpgrade) {
        this.groundArmorUpgrade = groundArmorUpgrade;
    }

    public int getGroundArmorUpgrade() {
        return groundArmorUpgrade;
    }

    public void setFlightWeaponUpgrade(int flightWeaponUpgrade) {
        this.flightWeaponUpgrade = flightWeaponUpgrade;
    }

    public int getFlightWeaponUpgrade() {
        return flightWeaponUpgrade;
    }

    public void setFlightArmorUpgrade(int flightArmorUpgrade) {
        this.flightArmorUpgrade = flightArmorUpgrade;
    }

    public int getFlightArmorUpgrade() {
        return flightArmorUpgrade;
    }

    public void setShieldUpgrade(int shieldUpgrade) {
        this.shieldUpgrade = shieldUpgrade;
    }

    public int getShieldUpgrade() {
        return shieldUpgrade;
    }
}
