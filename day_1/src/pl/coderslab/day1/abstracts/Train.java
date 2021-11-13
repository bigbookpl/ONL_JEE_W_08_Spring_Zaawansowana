package pl.coderslab.day1.abstracts;

public class Train extends Vehicle {

    private int trackWidth;

    public Train(Integer maxSpeed, String model, int trackWidth) {
        super(maxSpeed, model);
        this.trackWidth = trackWidth;
    }

    @Override
    String getSound() {
        return "odgłos pociągu";
    }
}
