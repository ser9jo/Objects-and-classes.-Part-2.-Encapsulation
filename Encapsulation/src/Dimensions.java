public class Dimensions {
    private final double length;
    private final double width;
    private final double heigh;
    double volume;

    public Dimensions (double length, double width, double heigh) {
        this.length = length;
        this.width = width;
        this.heigh = heigh;
        volume = length * width * heigh;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeigh() {
        return heigh;
    }

    public double getVolume() {
        return volume;
    }
    public String toString() {
        return "Длинна: " + length + " см." + "\n" +
                "Ширина: " + width + " см." + "\n" +
                "Высота: " + heigh + " см." + "\n" +
                "Объем: " + volume + " см^2.";
    }
}
