package szkola;

public enum DEGREE {
    DOCTOR("Dr. ") ,
    HABILITOWANY("Hab. "),
    INZYNIER("inz. "),
    MAGISTER("mgr. ");
    private final String value;

    private DEGREE(final String value){
        this.value=value;
    }

    public String getValue() {
        return value;
    }
}
