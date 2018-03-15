package Execises.FactoryAndAbstractFactory;

public class Main {
    public static void main(String[] args) {

        Archer archer1 = new Archer(30, 5, 100, 15);
        CrossbowMan crossbowMan1 = new CrossbowMan(25, 2, 100, 17);
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
            System.out.println("\n"+archer1.getName() + " blev nakket af " + crossbowMan1.getName() + "! \n" +
            crossbowMan1.getName() + " har vundet dødskampen med " + crossbowMan1.getHp() + " hp tilbage.");
        }
        if (!crossbowMan1.alive()){
            System.out.println("\n"+crossbowMan1.getName() + " blev nakket af " + archer1.getName() + "! \n" +
            archer1.getName() + " har vundet dødskampen med " + archer1.getHp() + " hp tilabge.");
        }

        //Racer
        InfantryFactory humanFactory = new FactoryFactory().createInfantryFactory(1); //Human race
        InfantryFactory orcFactory = new FactoryFactory().createInfantryFactory(2); //Orc race

        InfantryUnit archer2 = humanFactory.createUnit(1); //1 = archer
        archer2.setName("Torben");
        InfantryUnit warrior = orcFactory.createUnit(1); // 1 = warrior
        warrior.setName("Thrall");

        while(archer2.alive() && warrior.alive()) {
            warrior.attack(archer2);
            archer2.attack(warrior);
        }

        if (!archer2.alive()){
            System.out.println("\n"+archer2.getName() + " blev nakket af " + warrior.getName() + "! \n" +
                    warrior.getName() + " har vundet dødskampen med " + warrior.getHp() + " hp tilbage.");
        }
        if (!warrior.alive()){
            System.out.println("\n"+warrior.getName() + " blev nakket af " + archer2.getName() + "! \n" +
                    archer2.getName() + " har vundet dødskampen med " + archer2.getHp() + " hp tilabge.");
        }
    }
}
