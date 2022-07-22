package chapter12.collection.hashset;

import chapter12.collection.Member;


import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {
    private HashSet<Member> hashSet;

    public MemberHashSet() {
        hashSet = new HashSet<Member>();
    }

    public void addMember(Member m) {
        hashSet.add(m);
    }

    public boolean removeMember(int Id) {
        Iterator<Member> ir = hashSet.iterator();

        while (ir.hasNext()) {
            Member member = ir.next();      //회원을 하나씩 가져와서
            int tempId = member.getMemberId();      //아이디 비교
            if(tempId == Id) {      //아이디가 맞으면
                hashSet.remove(member);     //삭제
                return true;
            }
        }
        System.out.println(Id + "가 존재하지 않습니다");
        return false;
    }

    public void showAllMember() {
        for(Member m :  hashSet) {
            System.out.println(m);
        }
        System.out.println();
    }
}
