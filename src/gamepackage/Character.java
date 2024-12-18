package gamepackage;

public interface Character {
    String getName();
    int getHealth();
    int getAttackPower();
    int getX();
    int getY();
    void setPosition(int x, int y);
    void attack(Character target);
    void receiveDamage(int damage);
}
