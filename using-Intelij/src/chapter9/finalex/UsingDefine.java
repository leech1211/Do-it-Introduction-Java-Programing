package chapter9.finalex;

public class UsingDefine {
    public static void main(String[] args) {
        System.out.println(Define.GOOD_MORNING);    //static 으로 선언해 인스턴스 없이 사용 가능
        System.out.println("최솟값은 " + Define.MIN + "입니다.");
        System.out.println("최댓값은 " + Define.MAX + "입니다.");
        System.out.println("수학은 " + Define.MATH + "입니다.");
        System.out.println("영어는 " + Define.ENG + "입니다.");
    }
}
