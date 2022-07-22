package chapter12.collection.arraylist;

import chapter12.collection.Member;

import java.util.ArrayList;

public class MemberArraylist {
    private ArrayList<Member> arrayList; //필드 선언

    public MemberArraylist() {
        arrayList = new ArrayList<Member>(); //생성자를 통해 Member형으로 선언한 Arraylist 생성
    }

    public void addMember(Member m) {
        arrayList.add(m);
    }

    public boolean removeMember(int memberId) {
        for(int i=0;i<arrayList.size();i++) {
            Member member = arrayList.get(i);
            int tempId = member.getMemberId();
            if(tempId == memberId) {
                arrayList.remove(i);
                return true;
            }
        }
        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;
    }

    public void showAllMember() {
        for(Member m : arrayList) {
            System.out.println(m);
        }
    }
}
