package figury;

public abstract class Pawn extends GamePiece {
    private int xRange=1;
    private int yRange=1;


    public Pawn() {

    }
    public Pawn(int id, Cordinates myCordinates) {
        super(id, myCordinates);
    }

    public int getxRange() {
        return xRange;
    }

    public int getyRange() {
        return yRange;
    }
}
