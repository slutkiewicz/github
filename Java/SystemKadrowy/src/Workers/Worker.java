package Workers;

public abstract class Worker {
    private String name;
    private String surname;
    private String yearOfBirth;

    public void printMe(){

        System.out.println("Imie: "+this.getName()+"\t|"+
                            "Nazwisko: "+this.getSurname()+"\t|"+
                                "Rok Urodzenia: "+this.getYearOfBirth()+"\t|\n");
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(String yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
}
