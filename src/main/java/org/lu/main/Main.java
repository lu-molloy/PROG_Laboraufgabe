package org.lu.main;

import org.lu.control.GameController;
import org.lu.model.deck.Deck;
import org.lu.model.entity.DungeonMaster;
import org.lu.model.entity.Player;
import org.lu.model.game.GameState;
import org.lu.model.items.Artifact;
import org.lu.model.items.Weapon;
import org.lu.model.level.Level;
import org.lu.model.level.Room;
import org.lu.model.level.RoomType;
import org.lu.model.map.DungeonMap;
import org.lu.model.monster.Monster;
import org.lu.view.ConsoleView;

import java.util.ArrayList;
import java.util.List;

public class Main
{
    static void main (String[] args)
    {
        // einfache Map
        DungeonMap map = new DungeonMap(10, 7);

        // Player
        Deck playerDeck = new Deck();
        Weapon noWeapon = new Weapon("Fists", 0, 1, "No weapon");
        List<Artifact> noArtifacts = new ArrayList<Artifact>();

        Player player = new Player(
                "Hero", 20, 20, 5, 2, 1, 2, 2,
                noWeapon, noArtifacts,
                1, 3, 3, playerDeck, 0
        );

        // DungeonMaster (noch ohne Logik)
        Deck dmDeck = new Deck();
        DungeonMaster dm = new DungeonMaster("DM", 20, 20, 5, 2, 1, 5, 5, noWeapon, noArtifacts, 3, 3, dmDeck);

        // Level, Raum und Monster
        Level level1 = new Level(1);
        Room startRoom = new Room("1", RoomType.COMBAT);
        Monster m = new Monster(
                "Goblin",
                10,     // hp
                10,     // maxHp
                3,      // attack
                1,      // defense
                1,      // movement
                4,      // x
                3,      // y
                noWeapon,
                noArtifacts,
                1,      // level
                false   // boss
        );
        startRoom.addMonster(m);
        level1.addRoom(startRoom);

        GameState gameState = new GameState(player, dm, map, level1);
        ConsoleView view = new ConsoleView();
        GameController controller = new GameController(gameState, view);

        controller.startGameLoop();


    }
}
