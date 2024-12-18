package gamepackage;

import gamepackage.Factory.*;
import gamepackage.Factory.Character;
import gamepackage.Mediator.Arena;
import gamepackage.Mediator.BattleArena;
import gamepackage.Observer.GameConsole;

public class Main {
    public static void main(String[] args) {
        CharacterFactory warriorFactory = new WarriorFactory();
        CharacterFactory mageFactory = new MageFactory();
        CharacterFactory archerFactory = new ArcherFactory();

        gamepackage.Factory.Character warrior = warriorFactory.createCharacter("Mechnuk");
        gamepackage.Factory.Character mage = mageFactory.createCharacter("Chaklyn");
        Character archer = archerFactory.createCharacter("Lychnuk");

        Arena arena = new BattleArena();
        GameConsole console = new GameConsole();
        arena.addObserver(console);

        arena.registerCharacter(warrior);
        arena.registerCharacter(mage);
        arena.registerCharacter(archer);

        warrior.setPosition(10,10);
        mage.setPosition(5,5);
        archer.setPosition(15,15);
        warrior.attack(mage);

    }
}

