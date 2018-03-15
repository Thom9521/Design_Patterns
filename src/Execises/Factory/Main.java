package Execises.Factory;

public class Main {
    public static void main(String[] args) {

        Archer archer1 = new Archer(30, 5, 100, 15);
        CrossbowMan crossbowMan1 = new CrossbowMan(25, 2, 100, 15);
        Musketeer musketeer1 = new Musketeer(5, 0, 100, 30);
        RockHauler rockHauler1 = new RockHauler(5, 0, 100, 50);
        SpearThrower spearThrower1 = new SpearThrower(20, 0, 100, 15);

        archer1.setName("Zelda");
        crossbowMan1.setName("Twitch");

        while(archer1.alive() && crossbowMan1.alive()) {
            crossbowMan1.attack(archer1);
            archer1.attack(crossbowMan1);
        }

        if (!archer1.alive()){
            System.out.println(archer1.getName() + " blev nakket af " + crossbowMan1.getName() + "! \n" +
            crossbowMan1.getName() + " har " + crossbowMan1.getHp() + " hp tilbage.");
        }
        if (!crossbowMan1.alive()){
            System.out.println(crossbowMan1.getName() + " blev nakket af " + archer1.getName() + " ! \n" +
            archer1.getName() + " har " + archer1.getHp() + " hp tilabge.");
        }


    }
}
