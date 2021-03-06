package ru.job4j.poly;

public class Bus implements Transport, Vehicle {
    @Override
    public void drive() {
        System.out.println("Here goes!");
    }

    @Override
    public void passengers(int number) {
        System.out.println(number + " passengers on board.");
    }

    @Override
    public double refuel(int amount) {
        return 5.57 * amount;
    }

    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " двигается по скоростным трассам");
    }
}
