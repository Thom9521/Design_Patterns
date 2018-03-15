package Execises.Factory;

public class InfantryUnit {

    private int range;
    private int armor;
    private int hits;
    private int damage;

    public InfantryUnit(){}

    public InfantryUnit(int range, int armor, int hits, int damage) {
        this.range = range;
        this.armor = armor;
        this.hits = hits;
        this.damage = damage;

    }

    public void takeDamage(int damage){
        int reduction = (int) (Math.random()*armor);
        if (damage > reduction){
            hits = hits - (damage - reduction);
        }
    }

    public void attack(InfantryUnit unit){
        int attackDamage = (int) (Math.random()*damage)+1;
        unit.takeDamage(attackDamage);
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
