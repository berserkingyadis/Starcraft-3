package model.selectable.building;

import model.player.Player;
import model.selectable.unit.Unit;

public interface UnitConstructorBuilding {
    void initializeUnitList();
    void createUnit(String string);
}
