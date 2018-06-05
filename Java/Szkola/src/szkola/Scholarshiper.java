package szkola;

public class Scholarshiper extends Student {
    private double scholarShip;

    public Scholarshiper(String name, String surname, String yearOfBirth, Gender gender, int indexNum, double scholarShip) {
        super(name, surname, yearOfBirth, gender, indexNum);
        this.scholarShip = scholarShip;
    }
    public String toString() {

        return
                        super.toString()+
                        "Scholarship=" + scholarShip +
                        '\n';
    }
    public double getScholarShip() {
        return scholarShip;
    }

    public void setScholarShip(double scholarShip) {
        this.scholarShip = scholarShip;
    }
}
