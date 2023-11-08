import java.awt.*;

public class СargoInformation {
    private final Dimensions dimensions;
    private final double weight;
    public final String address;
    private final boolean flip;
    private final String number;
    private final boolean fragile;

    public СargoInformation(Dimensions dimensions, double weight, String address,
                            boolean flip, String number, boolean fragile) {
        this.dimensions = dimensions;
        this.weight = weight;
        this.address = address;
        this.flip = flip;
        this.number = number;
        this.fragile = fragile;
    }

    public  СargoInformation setDimension(Dimensions dimensions) {
        return new СargoInformation(dimensions, weight, address, flip, number, fragile);
    }

    public СargoInformation setWeight(double weight) {
        return new СargoInformation(dimensions, weight, address, flip, number, fragile);
    }
    public СargoInformation setAddress(String address) {
        return new СargoInformation(dimensions, weight, address, flip, number, fragile);
    }
    public СargoInformation setFlip(boolean flip) {
        return new СargoInformation(dimensions, weight, address, flip, number, fragile);
    }
    public СargoInformation setNumber(String number) {
        return new СargoInformation(dimensions, weight, address, flip, number, fragile);
    }
    public СargoInformation setFragile(boolean fragile) {
        return new СargoInformation(dimensions, weight, address, flip, number, fragile);
    }
    public double getWeight() {
        return weight;
    }
    public String getAddress() {
        return address;
    }
    public boolean isFlip() {
        return flip;
    }
    public String getNumber() {
        return number;
    }
    public boolean isFragile() {
        return fragile;
    }
    public String toString() {
        String alarm = isFragile() || !isFlip() ?
                "Хрупкое. Не переворачивать!" :
                "Нет";
        return "Габариты: " + "\n" + dimensions + "\n" +
                "Вес: " + weight + "кг." + "\n" +
                "Адрес доставки: " + address + "\n" +
                "Регистрационный номер: " + number +"\n" +
                "Предупреждение: " + alarm;
    }
}
