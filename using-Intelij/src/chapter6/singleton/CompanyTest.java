package chapter6.singleton;

public class CompanyTest {
    public static void main(String[] args) {
        Company my1 = Company.getInstance();
        Company my2 = Company.getInstance();
        System.out.println(my1 == my2);
    }
}
