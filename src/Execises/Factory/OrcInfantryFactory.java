package Execises.Factory;

public class OrcInfantryFactory extends InfantryFactory{

    public InfantryUnit createUnit(int techLevel){
        InfantryUnit character;
        switch (techLevel){
            case 1:
                character = new Warrior(5, 5, 100 ,50);
                character.setRace("Orc");
                break;

            case 2:
                character = new Warlock();
                character.setRace("Orc");
                break;

                default:
                    character = null;
                    break;
        }
        return character;
    }
}
