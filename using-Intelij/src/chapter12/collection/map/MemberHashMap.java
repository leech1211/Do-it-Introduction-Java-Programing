package chapter12.collection.map;

import chapter12.collection.Member;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {
    private HashMap<Integer, Member> hashMap;

    public MemberHashMap() {
        hashMap = new HashMap<Integer,Member>();
    }

    public void addMember(Member m) {
        hashMap.put(m.getMemberId(),m);
    }

    public boolean removeMember(int id) {
        if (hashMap.containsKey(id)) {    //만약 매개변수로 받은 아이디를 키로 하는 회원이 있다면
            hashMap.remove(id);
            return true;
        }
        System.out.println(id + "가 존재하지 않습니다.");
        return false;
    }

    public void showAllMember() {
        Iterator<Integer> ir = hashMap.keySet().iterator();
        while(ir.hasNext()){    //다음 key가 있다면
            int key = ir.next();
            Member member = hashMap.get(key);
            System.out.println(member);

        }
        System.out.println();
    }
}
