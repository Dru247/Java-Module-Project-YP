import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        int count_cars = 3;
        int min_speed = 1;
        int max_speed = 250;
        Race race = new Race();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < count_cars; i++) {
            int count = i + 1;
            System.out.println("Введите название машины №" + count);
            String name = scanner.next();

            while (true) {
                System.out.println("Введите скорость машины №" + count);
                if (scanner.hasNextInt()) {
                    int speed = scanner.nextInt();
                    if (speed < min_speed | speed > max_speed) {
                        System.out.println("Неправильная скорость");
                    } else {
                        race.checkLeader(new Car(name, speed));
                        break;
                    }
                } else {
                    System.out.println("Неправильная скорость");
                    scanner.next();
                }
            }
        }
        scanner.close();
    System.out.println("Самая быстрая машина: " + race.car_name);
    }
}