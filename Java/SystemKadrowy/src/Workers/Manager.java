package Workers;

public class Manager extends Worker  implements ISalary {
    final String workerType="Manager";
    private double salary;
    private double percentBonus;
    private double managerBonus;
    private String phoneNumber;
    private String cellPhoneNumber;
    private int officeRoom;
    private String Department;
    public double payMe(){
        double salary;
        salary=this.salary+(0.01*this.percentBonus)*this.salary+this.managerBonus;
        return salary;
    }
    public void printMe(){
        System.out.println("------------------------------------------------------------");
        System.out.println("Worker Type: "+workerType+"\t|");
        super.printMe();
        System.out.println("Department: "+this.getDepartment()+"\t|"+
                "Office room: "+ this.getOfficeRoom()+"\t|"+
                "Phone number: "+this.getPhoneNumber()+"\t|"+
                "Cell phone number: "+this.getCellPhoneNumber()+"\t|"+
                "Salary: "+this.getSalary()+"\t|"+
                "Bonus: "+this.getPercentBonus()+"%\t|"+
                "Manager bonus: "+this.getManagerBonus()+"\t|"+
                "To pay: "+this.payMe()+"\t|\n");

    }
    public Manager(String name,String surname,String year,double salary, double percentBonus, double managerBonus, String phoneNumber, String cellPhoneNumber, int officeRoom, String department) {
        this.setName(name);
        this.setSurname(surname);
        this.setYearOfBirth(year);
        this.salary = salary;
        this.percentBonus = percentBonus;
        this.managerBonus = managerBonus;
        this.phoneNumber = phoneNumber;
        this.cellPhoneNumber = cellPhoneNumber;
        this.officeRoom = officeRoom;
        Department = department;
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

    public double getPercentBonus() {
        return percentBonus;
    }

    public void setPercentBonus(double percentBonus) {
        this.percentBonus = percentBonus;
    }

    public double getManagerBonus() {
        return managerBonus;
    }

    public void setManagerBonus(double managerBonus) {
        this.managerBonus = managerBonus;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCellPhoneNumber() {
        return cellPhoneNumber;
    }

    public void setCellPhoneNumber(String cellPhoneNumber) {
        this.cellPhoneNumber = cellPhoneNumber;
    }

    public int getOfficeRoom() {
        return officeRoom;
    }

    public void setOfficeRoom(int officeRoom) {
        this.officeRoom = officeRoom;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }
}

