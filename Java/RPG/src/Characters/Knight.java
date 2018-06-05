package Characters;

public class Knight extends Hero{
    private String type="Knight";
    protected  void modifyStrenght(){
        setStrenght(getStrenght()+1.2);
    }
    protected  void modifyDefence(){
        setDefence(getDefence()+1.1);
    }
    protected  void modifyinteligentce(){
        setInteligence(getInteligence()+1);
    }
    protected  void modifyAccurancy(){
        setAccuracy(getAccuracy()+1.05);
    }
    protected  void modifyDexterity(){
        setDexterity(getDexterity()+1.02);
    }
    protected  void modifySAttackSpeed(){
        setAttackSpeed(getAttackSpeed()+1.05);
    }

    public void PrintOutHero() {
        System.out.println("Hero Class: "+this.type);
        super.PrintOutHero();
    }
    Knight(String name){
        this.setName(name);
    }
}
