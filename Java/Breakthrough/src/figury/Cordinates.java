package figury;

public class Cordinates {
   private int x;
    private int y;

    public Cordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public boolean checkIfSame(Cordinates toCheck){
        if((this.x==toCheck.getX()) &&
                (this.y==toCheck.getY()))
            return true;
        else
            return false;
    }
}
