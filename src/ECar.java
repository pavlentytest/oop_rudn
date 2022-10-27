public class ECar extends Car {
    private int batteryCapacity;
    public int color;

    public ECar(String n, int p, int batteryCapacity, int color) {
        super(n, p);
        this.batteryCapacity = batteryCapacity;
        this.color = color;
    }

    public int getBatteryCapacity() {
        return this.batteryCapacity;
    }

    public void setBatteryCapacity(int bc) {
        if(bc > 5000000) {
            System.out.println("Bad capacity!");
        } else {
            this.batteryCapacity = bc;
        }
    }

    @Override
    public void doBeep() {
        System.out.println("Ecar beep!!!");
    }

    @Override
    public String toString() {
        return "ECar{" +
                "batteryCapacity=" + batteryCapacity +
                ", color=" + color +
                ", name='" + name + '\'' +
                ", power=" + power +
                '}';
    }
}
