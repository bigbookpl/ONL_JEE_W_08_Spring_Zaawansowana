package pl.coderslab.day1.abstracts;

public abstract class Vehicle {

    protected String model;
    private Integer maxSpeed;

    abstract String getSound();

    public Vehicle(Integer maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

     @Override
    public String toString() {
        return "Class : "+this.getClass().getName()+", model: "+this.model+", speed: "+this.maxSpeed+", sound: "+this.getSound();
    }
}

