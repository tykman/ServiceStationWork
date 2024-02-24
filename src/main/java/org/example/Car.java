package org.example;

public class Car extends ServiceStation {
    public String modelName;
    public int wheelsCount;

    public void updateTyre() {
        System.out.println("Меняем колесо");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
