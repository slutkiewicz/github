package Workers;

public class OfficeWorker extends Worker  implements ISalary {
    final String workerType="Office worker";
    private double salary;
    private double bonus;
    private String directManager;
    private String phoneNumber;
    private int officeRoom;

    public OfficeWorker(String name,String surname,String year,double salary, double bonus, String directManager, String phoneNumber, int officeRoom) {
        this.setName(name);
        this.setSurname(surname);
        this.setYearOfBirth(year);
        this.salary = salary;
        this.bonus = bonus;
        this.directManager = directManager;
        this.phoneNumber = phoneNumber;
        this.officeRoom = officeRoom;
    }


    public double payMe(){
    double salary;
    salary=this.salary*(0.01*this.bonus)+this.salary;
        return salary;
    }
    public void printMe(){
        System.out.println("------------------------------------------------------------");
        System.out.println("Worker Type: "+workerType+"\t|");
        super.printMe();
        System.out.println("Direct Cordinator: "+this.getDirectManager()+"\t|"+
                "Office room: "+ this.getOfficeRoom()+"\t|"+
                "Phone number: "+this.getPhoneNumber()+"\t|"+
                "Salary: "+this.getSalary()+"\t|"+
                "Bonus: "+this.getBonus()+"%\t|"+
                "To pay: "+this.payMe()+"\t|\n");

    }
    public String getWorkerType() {
        return workerType;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String getDirectManager() {
        return directManager;
    }

    public void setDirectManager(String directManager) {
        this.directManager = directManager;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getOfficeRoom() {
        return officeRoom;
    }

    public void setOfficeRoom(int officeRoom) {
        this.officeRoom = officeRoom;
    }
}
