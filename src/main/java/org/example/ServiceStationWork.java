package org.example;

public class ServiceStationWork {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        Bicycle bicycle1 = new Bicycle();
        bicycle.modelName = "Кама";
        bicycle1.modelName = "Сура";
        bicycle.wheelsCount = 2;
        bicycle1.wheelsCount = 2;

        Car car = new Car();
        Car car1 = new Car();
        car.modelName = "bmb 09";
        car1.modelName = "BMW x6";
        car.wheelsCount = 4;
        car1.wheelsCount = 4;

        Truck truck = new Truck();
        Truck truck1 = new Truck();
        truck.modelName = "Камаз";
        truck1.modelName = "URAL";
        truck.wheelsCount = 6;
        truck1.wheelsCount = 8;

        ServiceStation station = new ServiceStation();
        System.out.println("Service Station work!");
        System.out.println(" ");
        station.check(bicycle,null,null);
        station.check(bicycle1,null,null);
        station.check(null,car,null);
        station.check(null,car1,null);
        station.check(null,null,truck);
        station.check(null,null,truck1);
        System.out.println("Service Station closed!");
    }
}