package Workers;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class PhysicalWorker extends Worker implements ISalary {

    final String workerType="Physical worker";
    private double hoursWorked;
    private double overHours;
    private double hourlyRate;
    private String directCordinator;
    private ArrayList<String>additionalSkills=new ArrayList<>();
    PhysicalWorker(String name,String surname,String year,String cordinator,double hourlyRate,double hoursWorked,double overHours,String...additionalSkills){
        this.setName(name);
        this.setSurname(surname);
        this.setYearOfBirth(year);
        this.directCordinator=cordinator;
        this.hourlyRate=hourlyRate;
        this.hoursWorked=hoursWorked;
        this.overHours=overHours;
        for(String it: additionalSkills)    //adding additional skills
            this.addAdditionalSkills(it);
    }

    public double payMe(){
        double pension;
    pension=this.hourlyRate*this.hoursWorked
            +1.5*this.hoursWorked*this.overHours;
    return pension;

    }
    public void printMe(){
        System.out.println("------------------------------------------------------------");
        System.out.println("Worker Type: "+workerType+"\t|");
    super.printMe();
        System.out.println("Direct Cordinator: "+this.getDirectCordinator()+"\t|"+
                "Additional skills: "+ readAddidionalSkills(this.additionalSkills)+"\t|"+
                "Hour Rate: "+this.getHourlyRate()+"\t|"+
                "Hours worked: "+this.getHoursWorked()+"\t|"+
                "Overtime hours: "+this.getOverHours()+"\t|"+
                "To pay: "+this.payMe()+"\t|\n");
    }
    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getOverHours() {
        return overHours;
    }

    public void setOverHours(double overHours) {
        this.overHours = overHours;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }


    public String getDirectCordinator() {
        return directCordinator;
    }

    public void setDirectCordinator(String directCordinator) {
        this.directCordinator = directCordinator;
    }

    public ArrayList<String> getAdditionalSkills() {
        return additionalSkills;
    }

    public void setAdditionalSkills(ArrayList<String> additionalSkills) {
        this.additionalSkills = additionalSkills;
    }
    public String readAddidionalSkills(ArrayList<String> additionalSkills){
        String str= String.join(", ",additionalSkills);
        return str;

    }
    public void addAdditionalSkills(String s){
        this.additionalSkills.add(s);
    }

}
