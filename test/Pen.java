public class Pen {
    public enum Color {
        RED("red"), GREEN("green"), BLUE("blue");
        private final String color;
        Color(String color) { this.color = color; }
        @Override public String toString() { return color; }
    }

    private Color currentColor;
    private Color pendingColor;
    private boolean isCapOn;

    // Default constructor
    public Pen() {
        this(Color.RED);
    }

    // Constructor with color
    public Pen(Color color) {
        this.currentColor = color;
        this.pendingColor = color;
        this.isCapOn = true;
    }

    public void capOn() {
        isCapOn = true;
    }

    public void capOff() {
        isCapOn = false;
        // Apply pending color when cap is removed
        currentColor = pendingColor;
    }

    public void changeColor(Color newColor) {
        pendingColor = newColor;
    }

    public String draw() {
        return isCapOn ? "" : "Drawing " + currentColor.toString();
    }
}
