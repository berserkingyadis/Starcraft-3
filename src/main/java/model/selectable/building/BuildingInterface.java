package model.selectable.building;

import model.player.Player;

public interface BuildingInterface {
    void activateBuildingEffect(Building building, Player player);
    void deactivateBuildingEffect(Building building, Player player);
}
