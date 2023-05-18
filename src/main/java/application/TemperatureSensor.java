package application;
import java.util.Random;

public class TemperatureSensor implements Sensor {
    private boolean isOn;
    private Random random;

    public TemperatureSensor() {
        this.isOn = false;
        this.random = new Random();
    }

    @Override
    public boolean isOn() {
        return this.isOn;
    }

    @Override
    public void setOn() {
        this.isOn = true;
    }

    @Override
    public void setOff() {
        this.isOn = false;
    }

    @Override
    public int read() {
        if (!this.isOn) {
            throw new IllegalStateException("Sensor is off");
        }
        return random.nextInt(61) - 30;//generates a random number between -30 and 30
    }

    public static void main(String[] args) {
        TemperatureSensor sensor = new TemperatureSensor();

        System.out.println(sensor.isOn());//prints false

        try {
            System.out.println(sensor.read());//throws IllegalStateException
        } catch (IllegalStateException ex) {
            System.out.println(ex.getMessage());//prints "Sensor is off"
        }

        sensor.setOn();
        System.out.println(sensor.isOn());//prints true

        // now you can read the sensor
        System.out.println(sensor.read());//prints the random number
    }
}

