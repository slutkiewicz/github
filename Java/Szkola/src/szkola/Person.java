package szkola;

public abstract class Person {
    private String name;
    private String surname;
    private String yearOfBirth;
    private Gender gender;

    public Person(String name, String surname, String yearOfBirth, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return
                  " "+name + "\t|" +
                 surname + "\t|" +
                ", Year Of Birth: '" + yearOfBirth + "\t|" +
                ", Gender: " + gender
                ;
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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
