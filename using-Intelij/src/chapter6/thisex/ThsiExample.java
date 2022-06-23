package chapter6.thisex;

class BitrhDay
{
    int day;
    int month;
    int year;

    public void setYear(int y)
    {
        this.year = y;
    }

    public void printThis()
    {
        System.out.println(this);
    }
}
public class ThsiExample {
    public static void main(String[] args) {
        BitrhDay bDay = new BitrhDay();
        bDay.setYear(2000);
        System.out.println(bDay);
        bDay.printThis();
    }
}
