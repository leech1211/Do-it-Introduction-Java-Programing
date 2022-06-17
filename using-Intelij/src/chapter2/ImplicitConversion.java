package chapter2;

public class ImplicitConversion {
    public static void main(String[] args)
    {
        byte bnum = 10;
        int inum = bnum;

        System.out.println(bnum);
        System.out.println(inum);

        int inum2 = 20;
        float fnum = inum2;

        System.out.println(inum2);
        System.out.println(fnum);

        double dnum;
        dnum = fnum + inum;
        System.out.println(dnum);
    }
}
