package chapter12.generics;

public class GenericPrinterTest {
    public static void main(String[] args) {
        GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
        //Powder형으로 GenerinPrinter 생성

        powderPrinter.setMeterial(new Powder());
        Powder powder = powderPrinter.getMeterial();
        System.out.println(powderPrinter);

        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();

        plasticPrinter.setMeterial(new Plastic());
        Plastic plastic = plasticPrinter.getMeterial();
        System.out.println(plasticPrinter);
    }
}
