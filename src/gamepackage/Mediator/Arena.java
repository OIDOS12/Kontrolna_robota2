package gamepackage.Mediator;

import gamepackage.Factory.Character;
import gamepackage.Observer.ArenaObserver;

import java.util.List;

public interface Arena {
    void registerCharacter(gamepackage.Factory.Character character);
    void addObserver(ArenaObserver observer);
    void removeObserver(ArenaObserver observer);
    void notifyObservers(gamepackage.Factory.Character character);
    List<Character> getCharacters();
}
