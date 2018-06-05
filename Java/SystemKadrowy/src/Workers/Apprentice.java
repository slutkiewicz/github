package Workers;

public class Apprentice extends Worker implements ISalary {
    final String workerType="Apprentice";
    final private double scolarship=600;
    private String guardian;


    public Apprentice(String name,String surname,String year,String guardian, boolean haveScolarship) {
        this.setName(name);
        this.setSurname(surname);
        this.setYearOfBirth(year);
        this.guardian = guardian;
        this.haveScolarship = haveScolarship;
    }

    private boolean haveScolarship;
    public double payMe(){
    if(haveScolarship)
        return scolarship;
    else
        return 0;
    }
    public void printMe(){
        System.out.println("------------------------------------------------------------");
        System.out.println("Worker Type: "+workerType+"\t|");
        super.printMe();
        System.out.println("Guardian: "+this.getGuardian()+"\t|"+
                "Scolarship: "+this.isHaveScolarship()+"\t|"+
                "To pay: "+this.payMe()+"\t|\n");

    }   public String getWorkerType() {
        return workerType;
    }

    public double getScolarship() {
        return scolarship;
    }

    public String getGuardian() {
        return guardian;
    }

    public void setGuardian(String guardian) {
        this.guardian = guardian;
    }

    public boolean isHaveScolarship() {
        return haveScolarship;
    }

    public void setHaveScolarship(boolean haveScolarship) {
        this.haveScolarship = haveScolarship;
    }
}



