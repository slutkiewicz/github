package szkola;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Lecturer extends Person {
    private ACADEMICTITLE academicTitle;
    private ArrayList<DEGREE> degree=new ArrayList<>();

    public String toString() {
        return
                "Lecturer \n"+
                        readTitle(academicTitle)+" "+
                        this.readDegree(this.degree) +
                        super.toString()+
                        '\n';
    }

    public Lecturer(String name, String surname, String yearOfBirth, Gender gender,DEGREE...  degree) {
        super(name, surname, yearOfBirth, gender);
        boolean b= Collections.addAll(this.degree,degree);

    }
    public Lecturer(String name, String surname, String yearOfBirth, Gender gender, ACADEMICTITLE title,DEGREE... degree) {
        super(name, surname, yearOfBirth, gender);
        this.academicTitle = title;
        boolean b= Collections.addAll(this.degree,degree);
    }

    public ACADEMICTITLE getAcademicTitle() {
        return academicTitle;
    }

    public void setAcademicTitle(ACADEMICTITLE academicTitle) {
        this.academicTitle = academicTitle;
    }

    public ArrayList<DEGREE> getDegree() {
        return degree;
    }

    public void setDegree(ArrayList<DEGREE> degree) {
        this.degree = degree;
    }
    public String readDegree(ArrayList<DEGREE> degree){
        String str="";
        for (DEGREE it: degree)
            str+=it.getValue();
        return str;
    }
    public String readTitle(ACADEMICTITLE title){
        String str="";
        if(title!=null)
            str=title.getValue();
        return str;
    }
}
