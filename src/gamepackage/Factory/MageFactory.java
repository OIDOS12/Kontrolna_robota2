package gamepackage.Factory;

public class MageFactory extends CharacterFactory {
    @Override
    public Character createCharacter(String name) {
        return new Mage(name);
    }
}
