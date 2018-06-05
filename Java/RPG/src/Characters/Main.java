package Characters;

import javafx.scene.shape.Arc;

public class Main {
    public static void main(String[] args){

    Mage dumbledore = new Mage("Dumbledore");
    Knight roland = new Knight("Roland");
    Archer legolas = new Archer("Legolas");
    for(int i=0;i<100;i++){
        dumbledore.levelUp();
        roland.levelUp();
        legolas.levelUp();
        dumbledore.setStatStr();
        dumbledore.setStatDef();
        dumbledore.setStatInt();
        dumbledore.setStatAcc();
        dumbledore.setStatDex();
        dumbledore.setStatSatt();
        roland.setStatStr();
        roland.setStatDef();
        roland.setStatInt();
        roland.setStatAcc();
        roland.setStatDex();
        roland.setStatSatt();
        legolas.setStatStr();
        legolas.setStatDef();
        legolas.setStatInt();
        legolas.setStatAcc();
        legolas.setStatDex();
        legolas.setStatSatt();
    }
    dumbledore.PrintOutHero();
        roland.PrintOutHero();
        legolas.PrintOutHero();

    }
}
