public enum Color {
    RED("red"),
    BLUE("blue"),
    GREEN("green"),
    WHITE("white"),
    BLACK("black");

    private final String color;

    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return this.color;
    }
}
