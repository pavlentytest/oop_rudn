public class Main {
    public static void main(String[] args) {

        int a = 0;
        System.out.println(a); // null

        Car bmw = new Car();
        System.out.println(bmw.name + " " + bmw.power);

        Car opel = new Car("Opel", 100);



        ECar tesla = new ECar("Tesla", 100,500,939);
        System.out.println(tesla.name + " " + tesla.power);
        tesla.setBatteryCapacity(500);
        System.out.println(tesla.getBatteryCapacity());
        tesla.doBeep(); // Ecar beep!!!
        System.out.println(tesla);


        // Примеры полиморфизма - перегрузка Overload
        //                        переопределение Override
    }
}