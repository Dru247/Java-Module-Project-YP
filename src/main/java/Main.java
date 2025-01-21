import java.util.Scanner;


public class Main {
    private static final int countCars = 3;
    private static final int minSpeed = 1;
    private static final int maxSpeed = 250;

    public static void main(String[] args) {
        Race race = new Race();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < countCars; i++) {
            int count = i + 1;
            System.out.println("Введите название машины №" + count);
            String name = scanner.next();

            while (true) {
                System.out.println("Введите скорость машины №" + count);
                if (scanner.hasNextInt()) {
                    int speed = scanner.nextInt();
                    if (speed < minSpeed | speed > maxSpeed) {
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
    System.out.println("Самая быстрая машина: " + race.getLeader());
    }
}