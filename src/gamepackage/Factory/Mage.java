package gamepackage.Factory;

public class Mage implements gamepackage.Factory.Character {
    private String name;
    private int health = 100;
    private int attackPower = 40;
    private int x;
    private int y;

    public Mage(String name) {
        this.name = name;
    }
    // Реалізація методів інтерфейсу Character
    @Override
    public String getName() {return name;}
    @Override
    public int getHealth() {return health;}
    @Override
    public int getAttackPower() {return attackPower;}
    @Override
    public int getX() {return x;}
    @Override
    public int getY() {return y;}
    @Override
    public void setPosition(int x, int y){this.x = x; this.y = y;}
    @Override
    public void attack(Character target){
        System.out.println(this.getName() + " атакує " + target.getName());
        target.receiveDamage(this.getAttackPower());
    }
    @Override
    public void receiveDamage(int damage){
        this.health -= damage;
        System.out.println(this.getName() + " отримав " + damage + " урону. Залишилось " + this.health + " здоров'я.");
    }
}
