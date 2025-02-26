package homeWorkWithAbstructClass;

public class Bicycle extends Transport {

    Bicycle(String s, int i) {
        super(s, i);
    }

    @Override
    void show() {
        super.show();
        super.updateTyre();
    }
}
