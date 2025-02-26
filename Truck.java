package homeWorkWithAbstructClass;

public class Truck extends Transport {

    Truck(String s, int i) {
        super(s, i);
    }

    @Override
    void show() {
        super.show();
        super.checkEngine();
        super.checkTrailer();
    }
}
