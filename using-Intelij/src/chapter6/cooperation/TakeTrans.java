package chapter6.cooperation;

public class TakeTrans {
    public static void main(String[] args) {
        Student James = new Student("James",5000);
        Student Tomas = new Student("Tomas",10000);

        Bus bus100 = new Bus(100);
        James.takeBus(bus100);
        James.showInfo();
        bus100.showInfo();

        Subway subwayGreen = new Subway("2호선");
        Tomas.takeSubway(subwayGreen);
        Tomas.showInfo();
        subwayGreen.showInfo();
    }
}
