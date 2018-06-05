package figury;

public class WhitePawn extends Pawn {
    public boolean kill(Cordinates toKill){

        if(toKill.getY()==(this.getMyCordinates().getY()+this.getyRange())){
            if((toKill.getX()==(this.getMyCordinates().getX()+this.getxRange())) ||
                    (toKill.getX()==(this.getMyCordinates().getX()-this.getxRange()))){
                return true;
            }
        }
        return false;
    }
    public boolean move(Cordinates toMove){

        if(toMove.getY()==(this.getMyCordinates().getY()+this.getyRange())){
            if((toMove.getX()==(this.getMyCordinates().getX()+this.getxRange())) ||
                    (toMove.getX()==(this.getMyCordinates().getX()-this.getxRange()))||
                    (toMove.getX()==(this.getMyCordinates().getX()))){
                return true;
            }
        }

        return false;
    }
}
