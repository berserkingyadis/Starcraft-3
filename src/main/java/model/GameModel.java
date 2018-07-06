package model;

import model.game.Game;
import model.map.Map;
import model.player.Player;

public class GameModel {

    private Player player;
    private Game game;
    private Map map;

    public GameModel() {
        player = new Player(0, 0, 0, 0, "Protoss");
        map = new Map();
        game = new Game();
    }

    public Player getPlayer() {
        return this.player;
    }

    public Game getGame() {
        return this.game;
    }

    public Map getMap() {
        return this.map;
    }
}
