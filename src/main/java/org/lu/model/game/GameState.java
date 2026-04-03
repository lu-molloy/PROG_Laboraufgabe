package org.lu.model.game;

import org.lu.model.entity.DungeonMaster;
import org.lu.model.entity.Player;
import org.lu.model.level.Level;
import org.lu.model.map.DungeonMap;

/**
 * Enthaelt den globalen Zustand: aktuelles Level, Spieler,
 * Dungeon-Master, Karte, Runde
 */
public class GameState
{
    private Player player;
    private DungeonMaster dungeonMaster;
    private DungeonMap dungeonMap;
    private Level currentLevel;
    private int currentLevelNumber;
    private boolean gameOver;
    private boolean playerWon;

    public GameState (Player player, DungeonMaster dungeonMaster, DungeonMap dungeonMap, Level currentLevel, int currentLevelNumber, boolean gameOver, boolean playerWon)
    {
        this.player = player;
        this.dungeonMaster = dungeonMaster;
        this.dungeonMap = dungeonMap;
        this.currentLevel = currentLevel;
        this.currentLevelNumber = currentLevelNumber;
        this.gameOver = gameOver;
        this.playerWon = playerWon;
    }

    public void nextLevel (Level newLevel, DungeonMap newDungeonMap)
    {

    }

    public boolean isGameOver ()
    {

    }

    // Getter uns Setter

    public Player getPlayer ()
    {
        return player;
    }

    public void setPlayer (Player player)
    {
        this.player = player;
    }

    public DungeonMaster getDungeonMaster ()
    {
        return dungeonMaster;
    }

    public void setDungeonMaster (DungeonMaster dungeonMaster)
    {
        this.dungeonMaster = dungeonMaster;
    }

    public DungeonMap getDungeonMap ()
    {
        return dungeonMap;
    }

    public void setDungeonMap (DungeonMap dungeonMap)
    {
        this.dungeonMap = dungeonMap;
    }

    public Level getCurrentLevel ()
    {
        return currentLevel;
    }

    public void setCurrentLevel (Level currentLevel)
    {
        this.currentLevel = currentLevel;
    }

    public int getCurrentLevelNumber ()
    {
        return currentLevelNumber;
    }

    public void setCurrentLevelNumber (int currentLevelNumber)
    {
        this.currentLevelNumber = currentLevelNumber;
    }

    public void setGameOver (boolean gameOver)
    {
        this.gameOver = gameOver;
    }

    public boolean isPlayerWon ()
    {
        return playerWon;
    }

    public void setPlayerWon (boolean playerWon)
    {
        this.playerWon = playerWon;
    }
}
