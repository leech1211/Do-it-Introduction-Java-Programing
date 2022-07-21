package chapter11.string;

public class StringBuilderTest {
    public static void main(String[] args) {
        String javaStr = new String("Java");
        System.out.println("javaStr의 문자열 주소: " + System.identityHashCode(javaStr));

        StringBuilder buffer = new StringBuilder(javaStr);
        System.out.println("연산전 buffer의 메모리 주소: " + System.identityHashCode(buffer));

        buffer.append(" and");
        buffer.append(" android");
        buffer.append(" programming");
        System.out.println("연산 후 buffer 메모리 주소:" + System.identityHashCode(buffer));

        javaStr = buffer.toString();
        System.out.println(javaStr);
        System.out.println("연결된 javaStr의 문자열 주소: " + System.identityHashCode(javaStr));
    }
}
