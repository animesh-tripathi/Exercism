public class GameMaster {

    public String describe(Character character){
        return String.format("You're a level %s %s with %s hit points.",character.getLevel()
                             ,character.getCharacterClass(),character.getHitPoints());
    }
    public String describe(Destination destination){
        return String.format("You've arrived at %s, which has %s inhabitants.",destination.getName()
                             ,destination.getInhabitants());
    }
    public String describe(TravelMethod tm){
            return tm==TravelMethod.WALKING? "You're traveling to your destination by walking."
                : "You're traveling to your destination on horseback.";
    }
    public String describe(Character character,Destination destination,TravelMethod tm){
        return this.describe(character)+" "+this.describe(tm)+" "+this.describe(destination);
    }
    public String describe(Character character,Destination destination){
        return this.describe(character,destination,TravelMethod.WALKING);
    }
}
