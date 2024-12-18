package gamepackage;

public class WarriorFactory extends CharacterFactory {
    @Override
    public Character createCharacter(String name) {
        return new Warrior(name);
    }
}
