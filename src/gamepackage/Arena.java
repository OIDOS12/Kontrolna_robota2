package gamepackage;

import java.util.List;

public interface Arena {
    void registerCharacter(Character character);
    void sendMessage(Character sender, Character receiver, String message);
    void addObserver(ArenaObserver observer);
    void removeObserver(ArenaObserver observer);
    void notifyObservers(Character character);
    List<Character> getCharacters();
}
