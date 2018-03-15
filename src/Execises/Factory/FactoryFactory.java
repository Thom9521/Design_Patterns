package Execises.Factory;

public class FactoryFactory {

    public InfantryFactory createInfantryFactory(int race){
    InfantryFactory factory;
    switch (race){
        case 1:
            factory = new HumanInfantryFactory();
            break;

        case 2:
            factory = new OrcInfantryFactory();
            break;

            default:
                factory = null;
                break;
    }
    return factory;
    }
}
