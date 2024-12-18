package gamepackage.Mediator;

import gamepackage.Factory.Character;
import gamepackage.Observer.ArenaObserver;

import java.util.ArrayList;
import java.util.List;

public class BattleArena implements Arena {
    private List<Character> characters = new ArrayList<>();
    private List<ArenaObserver> observers = new ArrayList<>();

    @Override
    public void registerCharacter(Character character) {
        characters.add(character);
        notifyObservers(character);
    }

    @Override
    public void addObserver(ArenaObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(ArenaObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(Character character) {
        for (ArenaObserver observer : observers) {
            observer.characterAdded(character);
        }
    }

    public List<Character> getCharacters(){
        return this.characters;
    }
}