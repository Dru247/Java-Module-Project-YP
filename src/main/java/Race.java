public class Race {
    private String carName = "";
    private int distance = 0;

    void checkLeader(Car newCar) {
        int dayDistance = newCar.speed * 24;
        if (dayDistance > this.distance) {
            this.carName = newCar.name;
            this.distance = dayDistance;
        }
    }

    public String getLeader() {
        return this.carName;
    }
}
