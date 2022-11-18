package itmo.java.basics.lesson2;

public enum Color {

    GREEN("Зеленый"),
    BLUE("Синий"),
    BLACK("Черный"),
    WHITE(""),
    RED(""),
    YELLOW("");

    private final String description;

    Color(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
