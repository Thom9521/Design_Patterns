package Execises.Factory;

public class InfantryUnit {

    private String name;
    private int range;
    private int armor;
    private int hp;
    private int damage;

    public InfantryUnit(){}

    public InfantryUnit(int range, int armor, int hp, int damage) {
        this.range = range;
        this.armor = armor;
        this.hp = hp;
        this.damage = damage;

    }

    public void takeDamage(int damage){
        int reduction = (int) (Math.random()*armor);
        if (damage > reduction){
            hp = hp - (damage - reduction);
            System.out.println();
        }
    }

    public void attack(InfantryUnit unit){
        int attackDamage = (int) (Math.random()*damage)+1;
        unit.takeDamage(attackDamage);
        System.out.println(unit.name + " tog " + attackDamage +
                " damage ind af fjenden. Liv tilbage: " + unit.hp);

    }

    public boolean alive(){
        boolean alive = true;
        if (hp < 0) {
            alive = false;
        }
        return alive;
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

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
