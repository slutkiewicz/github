package Characters;

public abstract class Hero implements ICanBeHero {
    private String name;



    private double strenght;
    private double defence;
    private double inteligence;
    private double accuracy;
    private double dexterity;
    private double attackSpeed;
    private int availableStatsPoints;

    public void setAvailableStatsPoints(int availableStatsPoints) {
        this.availableStatsPoints = availableStatsPoints;
    }

    public void levelUp(){
        this.availableStatsPoints+=10;
    }
    protected abstract void modifyStrenght();
    protected abstract void modifyDefence();
    protected abstract void modifyinteligentce();
    protected abstract void modifyAccurancy();
    protected abstract void modifyDexterity();
    protected abstract void modifySAttackSpeed();
    public void setStatStr(){
        if(getAvailableStatsPoints()>0){
            this.modifyStrenght();
            setAvailableStatsPoints(getAvailableStatsPoints()-1);
        }
        else System.out.println("You are out of points");
    }
    public void setStatDef(){
        if(getAvailableStatsPoints()>0){
            this.modifyDefence();
            setAvailableStatsPoints(getAvailableStatsPoints()-1);
        }
        else System.out.println("You are out of points");
    }
    public void setStatInt(){
        if(getAvailableStatsPoints()>0){
            this.modifyinteligentce();
            setAvailableStatsPoints(getAvailableStatsPoints()-1);
        }
        else System.out.println("You are out of points");
    }
    public void setStatAcc(){
        if(getAvailableStatsPoints()>0){
            this.modifyAccurancy();
            setAvailableStatsPoints(getAvailableStatsPoints()-1);
        }
        else System.out.println("You are out of points");
    }
    public void setStatDex(){
        if(getAvailableStatsPoints()>0){
            this.modifyDexterity();
            setAvailableStatsPoints(getAvailableStatsPoints()-1);
        }
        else System.out.println("You are out of points");
    }
    public void setStatSatt(){
        if(getAvailableStatsPoints()>0){
            this.modifySAttackSpeed();
            setAvailableStatsPoints(getAvailableStatsPoints()-1);
        }
        else System.out.println("You are out of points");
    }






    @Override
    public void PrintOutHero() {
        System.out.println("---------------------------------------");
        System.out.println(this.getName()+"\t|"
                + "str: "+Math.round(this.getStrenght())+"\t|"
                + "def: "+Math.round(this.getDefence())+"\t|"
                + "int: "+Math.round(this.getInteligence())+"\t|"
                + "acu: "+Math.round(this.getAccuracy())+"\t|"
                + "dex: "+Math.round(this.getDexterity())+"\t|"
                + "atks: "+Math.round(this.getAttackSpeed())+"\t|"
                + "LeftStatPoints: "+this.getAvailableStatsPoints()+"\t|");
        System.out.println("---------------------------------------");
    }
    public int getAvailableStatsPoints() {
        return availableStatsPoints;
    }
    public double getStrenght() {
        return strenght;
    }

    public void setStrenght(double strenght) {
        this.strenght = strenght;
    }

    public double getDefence() {
        return defence;
    }

    public void setDefence(double defence) {
        this.defence = defence;
    }

    public double getInteligence() {
        return inteligence;
    }

    public void setInteligence(double inteligence) {
        this.inteligence = inteligence;
    }

    public double getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(double accuracy) {
        this.accuracy = accuracy;
    }

    public double getDexterity() {
        return dexterity;
    }

    public void setDexterity(double dexterity) {
        this.dexterity = dexterity;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }

    public void setAttackSpeed(double attackSpeed) {
        this.attackSpeed = attackSpeed;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
