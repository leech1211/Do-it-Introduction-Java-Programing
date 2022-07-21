package chapter11.object;

class Student{
    int studentID;
    String studentName;

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student) {        //instanceof 는 객체 타입을 확인하는 연산자
            Student std = (Student) obj;
            if(this.studentID == std.studentID)
                return true;
            else
                return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return studentID;
    }

    public Student(int i, String n){
        studentID = i;
        studentName = n;
    }

    public String toString(){
        return studentID + "," + studentName;
    }
}
public class EqualsTest {
    public static void main(String[] args) {
        Student studentLee = new Student(100,"이상원");
        Student studentLee2 = studentLee;
        Student studentSang = new Student(100,"이상원");

        if(studentLee == studentLee2)
        {
            System.out.println("studentLee와 studentLee2의 주소는 같습니다");
        }
        else
            System.out.println("studentLee와 studentLee2의 주소는 다릅니다");

        if(studentLee.equals(studentLee2))
            System.out.println("studentLee와 studentLee2의 동일합니다");
        else
            System.out.println("studentLee와 studentLee2의 동일하지않습니다");



        if(studentLee == studentSang)
            System.out.println("studentLee와 studentSang의 주소는 같습니다");
        else
            System.out.println("studentLee와 studentSang의 주소는 다릅니다");

        if(studentLee.equals(studentSang))
            System.out.println("studentLee와 studentSang의 동일합니다");
        else
            System.out.println("studentLee와 studentSang의 동일하지않습니다");


        System.out.println("studentLee의 hashCode :" + studentLee.hashCode());
        System.out.println("studentSang의 hashCode :" + studentSang.hashCode());

        System.out.println("studentLee의 실제주소값 :" + System.identityHashCode(studentLee));
        System.out.println("studentSang의 실제주소값 :" + System.identityHashCode(studentSang));
    }
}
