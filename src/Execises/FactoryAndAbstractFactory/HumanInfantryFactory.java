package Execises.FactoryAndAbstractFactory;

public class HumanInfantryFactory extends InfantryFactory {

    public InfantryUnit createUnit(int techLevel){
        InfantryUnit character;
        switch (techLevel){
            case 1:
                character = new Archer(30, 10, 100 , 30);
                character.setRace("Human");
                break;

            case 2:
                character = new CrossbowMan();
                character.setRace("Human");
                break;

            case 3:
                character = new Musketeer();
                character.setRace("Human");
                break;

            case 4:
                character = new RockHauler();
                character.setRace("Human");
                break;

            case 5:
                character = new SpearThrower();
                character.setRace("Human");
                break;

                default:
                    character = null;
                    break;
        }
        return character;
    }
}
