package szkola;

public class Student extends Person {
    private final String personType="Student";
    private int indexNum;

    public Student(String name, String surname, String yearOfBirth, Gender gender,int indexNum) {
        super(name,surname,yearOfBirth,gender);
        this.indexNum = indexNum;
    }

    @Override
    public String toString() {
        return
                "Student\n"+
                super.toString()+
                "indexNum=" + indexNum +
                '\n';
    }

    public int getIndexNum() {
        return indexNum;
    }

    public void setIndexNum(int indexNum) {
        this.indexNum = indexNum;
    }
}
