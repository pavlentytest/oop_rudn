public class Car {
    // private, protected, public, модификатор по умолчанию

    protected String name;
    public int power;

    public static final int TTT = 1234;

    public Car(String n, int p) {
        name = n;
        power = p;
    }

    public Car() {

    }

    public void doBeep() {
        System.out.println("Beep!!!");
    }




    /*
    Car() {
        name = "";
        power = 0;
    }
     */
}

