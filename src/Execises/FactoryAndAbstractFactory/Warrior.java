package Execises.FactoryAndAbstractFactory;

public class Warrior extends InfantryUnit {

    public Warrior() {
    }

    public Warrior(int range, int armor, int hp, int damage) {
        super(range, armor, hp, damage);
    }
}