package gamepackage.Observer;

import gamepackage.Factory.Character;

public class GameConsole implements ArenaObserver {
    @Override
    public void characterAdded(Character character) {
        System.out.println("Новий персонаж на арені: " + character.getName());
    }
}
