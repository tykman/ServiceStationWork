package homeWorkWithAbstructClass;

public class Car extends Transport {

    Car(String s, int i) {
        super(s,i);
    }

    @Override
    void show() {
        super.show();
        super.checkEngine();
    }
}
