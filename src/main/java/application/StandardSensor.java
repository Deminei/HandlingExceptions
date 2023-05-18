package application;

public class StandardSensor implements Sensor {
    private int reading;
//constructor that take on integer as parameter
    public StandardSensor(int reading) {
        this.reading = reading;
    }

    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void setOn() {
        // no effect
    }

    @Override
    public void setOff() {
        // no effect
    }

    @Override
    public int read() {//read returns the number given to constructor
        return this.reading;
    }
    public static void main(String[] args) {
        StandardSensor ten = new StandardSensor(10);
        StandardSensor minusFive = new StandardSensor(-5);

        System.out.println(ten.read());
        System.out.println(minusFive.read());

        System.out.println(ten.isOn());
        ten.setOff();
        System.out.println(ten.isOn());
    }

}

