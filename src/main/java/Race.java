public class Race {
    String car_name = "";
    int distance = 0;

    void checkLeader(Car new_car) {
        int day_distance = new_car.speed * 24;
        if (day_distance > this.distance) {
            this.car_name = new_car.name;
            this.distance = day_distance;
        }
    }
}
