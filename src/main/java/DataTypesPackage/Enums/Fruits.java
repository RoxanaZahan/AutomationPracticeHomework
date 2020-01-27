package DataTypesPackage.Enums;

public enum Fruits {
    APPLE ("RED", "GREEN"),
    ORANGE ("ORANGE", "RED"),
    GRAPE ("RED", "WHITE"),
    MELON ("GREEN", "YELLOW"),
    PLUM ("BLUE", "WHITE");

    private String type1;
    private String type2;
    public String getType1() {
        return this.type1;
    }
    public String getType2() {
        return this.type2;
    }

    Fruits(String type1, String type2) {
        this.type1 = type1;
        this.type2 = type2;
    }
}
