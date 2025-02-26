package homeWorkWithAbstructClass;

public class ServiceStation {
    public static void main(String[] args) {
        Bicycle b = new Bicycle("Ural", 2);
        Car c = new Car("Lada",4);
        Truck t = new Truck("Muck", 12);

        b.show();
        c.show();
        t.show();
    }
}
