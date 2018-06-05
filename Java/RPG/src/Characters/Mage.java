package Characters;

public class Mage extends Hero {
    private final String type="Mage";


    protected  void modifyStrenght(){
        setStrenght(getStrenght()+1);
    }
    protected  void modifyDefence(){
        setDefence(getDefence()+1);
    }
    protected  void modifyinteligentce(){
        setInteligence(getInteligence()+1.2);
    }
    protected  void modifyAccurancy(){
        setAccuracy(getAccuracy()+1.05);
    }
    protected  void modifyDexterity(){
        setDexterity(getDexterity()+1.02);
    }
    protected  void modifySAttackSpeed(){
        setAttackSpeed(getAttackSpeed()+1);
    }






    Mage(String name){
        this.setName(name);
    }
    public void PrintOutHero() {
        System.out.println("Hero Class: "+this.type);
        super.PrintOutHero();
    }

}
