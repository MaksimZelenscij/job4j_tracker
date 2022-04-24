package ru.job4j.poly;

public class Transportation {
    public static void main(String[] args) {
        Vehicle superJet = new Airplane();
        Vehicle boeing = new Airplane();
        Vehicle sapsan = new Train();
        Vehicle devjatka = new Train();
        Vehicle schoolBus = new Bus();
        Vehicle workBus = new Bus();

        Vehicle[] vehicle = new Vehicle[] {superJet, boeing, sapsan, devjatka, schoolBus, workBus};
        for (Vehicle a : vehicle) {
            a.move();
        }
    }
}
