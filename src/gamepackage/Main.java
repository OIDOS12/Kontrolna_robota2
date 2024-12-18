package gamepackage;

public class Main {
    public static void main(String[] args) {
        CharacterFactory warriorFactory = new WarriorFactory();
        CharacterFactory mageFactory = new MageFactory();
        CharacterFactory archerFactory = new ArcherFactory();

        Character warrior = warriorFactory.createCharacter("WarriorPlayer");
        Character mage = mageFactory.createCharacter("Chaklyn");
        Character archer = archerFactory.createCharacter("Lychnuk");

        Arena arena = new BattleArena();
        GameConsole console = new GameConsole();
        ((BattleArena) arena).addObserver(console);

        arena.registerCharacter(warrior);
        arena.registerCharacter(mage);
        arena.registerCharacter(archer);

        warrior.setPosition(10,10);
        mage.setPosition(5,5);
        archer.setPosition(15,15);
        warrior.attack(mage);

    }
}