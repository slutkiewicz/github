package szkola;

public class Main {
    public static void main(String[] args){
        Student andrzej=new Student("Andrzej","Laskowski","1995",Gender.MALE,12);
        Scholarshiper maciej=new Scholarshiper("Maciej","Laskowski","1994",Gender.MALE,10,300);
        Lecturer wlodzimierz=new Lecturer("Wlodzimierz","Laskowski","1965",Gender.MALE,DEGREE.DOCTOR);
        Lecturer jakub=new Lecturer("Jakub","Laskowski","1955",Gender.MALE,ACADEMICTITLE.PROFESOR,DEGREE.HABILITOWANY,DEGREE.DOCTOR,DEGREE.INZYNIER);
        System.out.println(andrzej.toString());
        System.out.println(maciej.toString());
       System.out.println(wlodzimierz.toString());
        System.out.println(jakub.toString());
    }
}
