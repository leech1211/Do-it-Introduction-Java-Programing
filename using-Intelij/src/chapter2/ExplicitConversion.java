package chapter2;

public class ExplicitConversion {
    public static void main(String[] args)
    {
        double dnum1 = 1.2;
        float fnum2 = 0.9F;
        int inum3 = (int)dnum1 + (int)fnum2;
        int inum4 = (int)(dnum1 + fnum2);
        System.out.println(inum3);
        System.out.println(inum4);
    }
}
