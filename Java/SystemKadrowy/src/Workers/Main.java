package Workers;

public class Main {
    public static void main(String[] args){
        PhysicalWorker bartek = new PhysicalWorker("Bartek","Zawisza","1990",
                "Wojciech Zakopany",15.50,20,15.5,
                "Ept papers","Heftruck papers","Good English");

        OfficeWorker waldek = new OfficeWorker("Maciej","Kowalski","1985",
                2250.5,5,"Andrzej Kozakiewicz",
                "555666889",255);

        Manager mirek = new Manager("Jakub","Guzik","1992",
                5005.3,10,1000,"669853685",
                "444666852",5,"Sales");

        BoardMember szef = new BoardMember("Jarek","Zbytenko","1996",
                10500,"Ania Koscielna",15);

        Apprentice kazik = new Apprentice("Mariusz","Zagrobelny","1966",
                "Kazimierz Wielki",true);

        bartek.printMe();
        waldek.printMe();
        mirek.printMe();
        szef.printMe();
        kazik.printMe();

    }
}
