package homeWorkWithAbstructClass;

public abstract class Transport {

    private String modelName;
    private int wheelCount;

    public void set(String m, int w) {
        this.modelName = m;
        this.wheelCount = w;
    }

    Transport(String modelName, int wheelCount) {
       set(modelName,wheelCount);
    }

    void show() {
        System.out.println();
        if (modelName != null) {
            System.out.println(" Обслуживаем:\nmodel - " + modelName +
                    "\nwheelCount - " + wheelCount + " шт.");
        }
    }

    void updateTyre() {
        System.out.println("Меняем покрышку - " + wheelCount + " шт.");
    }

    void checkEngine() {
        System.out.println("Проверяем двигатель - " + modelName);
    }

    void checkTrailer() {
        System.out.println("Проверяем трейлер - " + modelName);
    }
}
