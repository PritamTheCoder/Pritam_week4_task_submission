// Game Character Classes
class GameCharacter{
    protected String name;
    public GameCharacter(String name){
        this.name = name;
    }
    public String attack() {
        return name + " attack with basic strength.";
    }
}

class Warrior extends GameCharacter{
    public Warrior(String name){
        super(name);
    }

    @Override
    public String attack(){
        return name + " swings a sword for 20 melee damage.";
    }
}

class Archer extends GameCharacter{
    protected int arrowCount;
    public Archer(String name, int arrowCount){
        super(name);
        this.arrowCount = arrowCount;
    }

    @Override 
    public String attack(){
        if (arrowCount > 0){
            arrowCount--;
        return name + " shoots an arrow. \n Arrows left : " + arrowCount;
    } else{
        return name + " has no arrow left.";
    }
}
}

class Mage extends GameCharacter{
    private int mana;
    public Mage(String name, int mana){
        super(name);
        this.mana = mana;
    }

    @Override
    public String attack(){
        if ( mana > 10){
            mana -= 10;
            return name + " casts a thunder bolt! \n Mana left: " + mana;
        }else {
            return name + " does not have enough mana!";
        }
    }
}

class GameCharacters {
    public static void main(String[] args){
        GameCharacter[] Characters = {
            new Warrior("Thorfin"),
            new Archer("Robin Hood", 4),
            new Mage("Harry Potter",25)
        };
            for(GameCharacter gc : Characters){
                System.out.println(gc.attack());
            }
    }
}