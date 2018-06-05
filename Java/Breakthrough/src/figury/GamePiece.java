package figury;

public abstract class GamePiece {
    private int id;
    private int player;

    private Cordinates myCordinates;
    public abstract boolean kill(Cordinates toKill);
    public abstract boolean move(Cordinates toMove);

    public int getId() {
        return id;
    }
    public GamePiece() {

    }

    public GamePiece(int id) {
    this.id=id;
    }

    public GamePiece(int id, Cordinates myCordinates) {
        this.id = id;
        this.myCordinates = myCordinates;
    }

    public Cordinates getMyCordinates() {
        return myCordinates;
    }

    public void setMyCordinates(Cordinates myCordinates) {
        this.myCordinates = myCordinates;
    }
}
