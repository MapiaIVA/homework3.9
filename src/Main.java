import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите номер квартиры: ");
        int apartmentNumber = scanner.nextInt();
        System.out.print("Введите количество квартир на этаже: ");
        int apartmentsPerFloor = scanner.nextInt();
        System.out.print("Введите количество этажей: ");
        int numberOfFloors = scanner.nextInt();

//  количество квартир в одном подъезде
        int apartmentsPerEntrance = apartmentsPerFloor * numberOfFloors;

//  номер подъезда
        int entranceNumber = (apartmentNumber - 1) / apartmentsPerEntrance + 1;

        System.out.println("Номер подъезда: " + entranceNumber);
    }
}