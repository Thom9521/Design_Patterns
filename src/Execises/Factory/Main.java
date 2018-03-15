package Execises.Factory;

public class Main {
    public static void main(String[] args) {

        Archer archer1 = new Archer(30, 100, 100, 10);
        CrossbowMan crossbowMan1 = new CrossbowMan(25, 100, 100, 20);
        Musketeer musketeer1 = new Musketeer(5, 100, 100, 30);
        RockHauler rockHauler1 = new RockHauler(5, 50, 100, 50);
        SpearThrower spearThrower1 = new SpearThrower(20, 100, 100, 15);

        archer1.attack(crossbowMan1);

    }
}
