package model.selectable.upgrades;

import model.player.Player;

public interface UpgradeInterface {
    public void increaseUpgrade(String upgrade, Player player);
    public void decreaseUpgrade(String upgrade, Player player);
}
