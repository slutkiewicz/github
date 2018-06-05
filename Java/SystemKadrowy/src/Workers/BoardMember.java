package Workers;

public class BoardMember extends Worker  implements ISalary {
    final String workerType="Board member";
    private double meetingbonus=400;
    private double salary;


    public BoardMember(String name,String surname,String year,double salary, String assistant, int numberOfMeetings) {
        this.setName(name);
        this.setSurname(surname);
        this.setYearOfBirth(year);
        this.salary = salary;
        this.assistant = assistant;
        this.numberOfMeetings = numberOfMeetings;
    }

    private String assistant;

    private int numberOfMeetings;

    public double payMe(){
        double salary;
        salary=this.salary+this.meetingbonus*this.numberOfMeetings;
        return salary;
    }
    public void printMe(){
        System.out.println("------------------------------------------------------------");
        System.out.println("Worker Type: "+workerType+"\t|");
        super.printMe();
        System.out.println("Assistance: "+this.getAssistant()+"\t|"+
                "Salary: "+this.getSalary()+"\t|"+
                "How many Board meetings: "+this.getNumberOfMeetings()+"\t|"+
                "To pay: "+this.payMe()+"\t|\n");

    }public String getWorkerType() {
        return workerType;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAssistant() {
        return assistant;
    }

    public void setAssistant(String assistant) {
        this.assistant = assistant;
    }

    public int getNumberOfMeetings() {
        return numberOfMeetings;
    }

    public void setNumberOfMeetings(int numberOfMeetings) {
        this.numberOfMeetings = numberOfMeetings;
    }
}

