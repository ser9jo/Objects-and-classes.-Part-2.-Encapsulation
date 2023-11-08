import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        /*Elevator elevator =  new Elevator(-3,26);
        while (true) {
            System.out.println("Введите номер этажа: ");
            int floor = new Scanner(System.in).nextInt();
            elevator.move(floor);
        }
    } */

        Dimensions dimensions = new Dimensions(5, 10, 3);
        СargoInformation cargo = new СargoInformation(dimensions, 12, "ул.Речная, д.4",
                true, "12345", true);
        System.out.println(cargo);
    }
}