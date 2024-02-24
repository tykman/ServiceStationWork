package org.example;

public class Truck extends ServiceStation {
    public String modelName;
    public int wheelsCount;

    public void updateTyre() {
        System.out.println("Меняем колесо");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
