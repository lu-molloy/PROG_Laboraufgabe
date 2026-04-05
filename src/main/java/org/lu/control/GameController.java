package org.lu.control;

import org.lu.model.entity.Player;
import org.lu.model.game.GameState;
import org.lu.util.Direction;
import org.lu.util.InputUtil;
import org.lu.view.ConsoleView;

/**
 * Hauptsteuerung: Spielstart, Levelwechsel,
 * Sieg/Niederlage
 */
public class GameController
{
    private GameState gameState;
    private ConsoleView view;

    public GameController (GameState gameState, ConsoleView view)
    {
        this.gameState = gameState;
        this.view = view;
    }

    public void startGameLoop ()
    {
        view.printMap(gameState);
        view.printPlayerPosition(gameState.getPlayer());

        String input = InputUtil.readLine();

        switch (input)
        {
            case "q":
                gameState.setGameOver(true);
                break;

            case "w":
                movePlayer(Direction.NORTH);
                break;

            case "s":
                movePlayer(Direction.SOUTH);
                break;

            case "a":
                movePlayer(Direction.WEST);
                break;

            case "d":
                movePlayer(Direction.EAST);
                break;

            default:
                view.printInvalidMove();
                break;
            }

            view.printGoodbye();
    }

    private void movePlayer (Direction dir)
    {
        Player p = gameState.getPlayer();
        p.move(dir, gameState.getDungeonMap());
    }
}
