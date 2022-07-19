package chapter9.step1;

import chapter6.cooperation.Bus;

public class CarTest {
    public static void main(String[] args) {
        bus bus = new bus();
        autoCar autoCar = new autoCar();

        bus.run();
        autoCar.run();

        bus.refuel();
        autoCar.refuel();

        bus.takePassenger();
        autoCar.load();

        bus.stop();
        autoCar.stop();


    }
}
