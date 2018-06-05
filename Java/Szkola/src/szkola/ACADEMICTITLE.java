package szkola;

public enum ACADEMICTITLE {
    PROFESOR("Prof.");
    private final String value;
    private ACADEMICTITLE(final String value){
        this.value=value;
    }

    public String getValue() {
        return value;
    }
}
