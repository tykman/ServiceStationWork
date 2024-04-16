package org.example;

public class Bicycle  {
    String modelName;
    int wheelsCount;

    public Bicycle() {}

    public void updateTyre() {
        System.out.println("Меняем колесо");
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }
}
