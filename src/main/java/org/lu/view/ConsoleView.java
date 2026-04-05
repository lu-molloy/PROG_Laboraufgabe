package org.lu.view;

import org.lu.model.entity.Player;
import org.lu.model.game.GameState;
import org.lu.model.map.DungeonMap;
import org.lu.model.map.Tile;
import org.lu.model.map.TileType;
import org.lu.model.monster.Monster;

/**
 * Fuer allgemeine Ausgaben.
 */
public class ConsoleView
{
    public void printWelcome ()
    {
        // todo: zu Konstanten machen
        System.out.println("≡≡≡ DUNGEON TOP (konsolenbasiert) ≡≡≡");
        System.out.println("Befehle: ");
        System.out.println("\t w = hoch");
        System.out.println("\t s = runter");
        System.out.println("\t a = links");
        System.out.println("\t d = rechts");
        System.out.println("\t q = beenden");
        System.out.println();
    }

    public void printMap (GameState gameState)
    {
        DungeonMap map = gameState.getDungeonMap();
        Player player = gameState.getPlayer();

        for (int y = 0; y < map.getHeight(); y++)
        {
            for (int x = 0; x < map.getWidth(); x++)
            {
                if (player.getX() == x && player.getY() == y)
                {
                    System.out.print('P');
                }
                else if (isMonsterAt(gameState, x, y))
                {
                    System.out.print('M');
                }
                else
                {
                    Tile tile = map.getTile(x, y);
                    if (tile.getType() == TileType.WALL)
                    {
                        System.out.print('#');
                    }
                    else
                    {
                        System.out.print('.');
                    }
                }
            }

            System.out.println();
        }
        System.out.println();
    }

    private boolean isMonsterAt (GameState gameState, int x, int y)
    {
        for (Monster m : gameState.getCurrentLevel().getStartRoom().getMonsters())
        {
            if (m.isAlive() && m.getX() == x && m.getY() == y)
            {
                return true;
            }
        }
        return false;
    }

    public void printPlayerPosition (Player player)
    {
        System.out.println("Player Position: (" + player.getX() + ", " + player.getY() + ")");
    }

    public void printGoodbye ()
    {
        System.out.println("Spiel beendet.");
    }

    public void printInvalidMove ()
    {
        System.out.println("Ungueltiger Zug!");
    }
}
