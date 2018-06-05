package Characters;

public class Archer extends Hero{
    private String type="Archer";
    protected  void modifyStrenght(){
        setStrenght(getStrenght()+1.05);
    }
    protected  void modifyDefence(){
        setDefence(getDefence()+1.05);
    }
    protected  void modifyinteligentce(){
        setInteligence(getInteligence()+1);
    }
    protected  void modifyAccurancy(){
        setAccuracy(getAccuracy()+1.2);
    }
    protected  void modifyDexterity(){
        setDexterity(getDexterity()+1.1);
    }
    protected  void modifySAttackSpeed(){
        setAttackSpeed(getAttackSpeed()+1.05);
    }


    public void PrintOutHero() {
        System.out.println("Hero Class: "+this.type);
        super.PrintOutHero();
    }
    Archer(String name){
        this.setName(name);
    }
}
