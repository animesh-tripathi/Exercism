class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

// TODO: define the Warrior class
class Warrior extends Fighter{
    @Override
    public String toString(){
        return "Fighter is a Warrior";
    }
    @Override
    boolean isVulnerable(){
        return false;
    }
    @Override
    int getDamagePoints(Fighter fighter) {
        if( fighter instanceof Warrior)
            return 6;
        else
            if(fighter.isVulnerable())
                return 10;
            else
                return 6;
    }
    
}

// TODO: define the Wizard class

class Wizard extends Fighter{
    boolean isPrepared=false;
    @Override
    public String toString(){
        return "Fighter is a Wizard";
    }
    boolean prepareSpell(){
        isPrepared=true;
        return true;
    }
    boolean isVulnerable(){
        return !isPrepared;
    }
    @Override
    int getDamagePoints(Fighter fighter){
        return isPrepared?12:3;
    }
}




















