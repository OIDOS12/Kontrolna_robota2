package gamepackage.Factory;

public class ArcherFactory extends CharacterFactory {
    @Override
    public Character createCharacter(String name) {
        return new Archer(name);
    }
}
