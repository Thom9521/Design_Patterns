package Execises.Factory;

public class Main {
    public static void main(String[] args) {

        Archer archer1 = new Archer(30, 0, 100, 10);
        CrossbowMan crossbowMan1 = new CrossbowMan(25, 0, 100, 20);
        Musketeer musketeer1 = new Musketeer(5, 0, 100, 30);
        RockHauler rockHauler1 = new RockHauler(5, 0, 100, 50);
        SpearThrower spearThrower1 = new SpearThrower(20, 0, 100, 15);

        archer1.setName("Acher1");
        crossbowMan1.setName("Crossbowman1");

        archer1.attack(crossbowMan1);
        crossbowMan1.takeDamage(20);


    }
}
