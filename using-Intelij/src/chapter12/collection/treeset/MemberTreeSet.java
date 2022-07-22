package chapter12.collection.treeset;

import chapter12.collection.Member;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {
    private TreeSet<Member> treeSet;

    public MemberTreeSet() {
        treeSet = new TreeSet<Member>();
    }

    public void addMember(Member member) {
        treeSet.add(member);
    }

    public boolean removeMember(int id) {
        Iterator<Member> i = treeSet.iterator();
        while (i.hasNext()) {
            Member member = i.next();
            int tempId = member.getMemberId();
            if(tempId == id) {
                treeSet.remove(member);
                return true;
            }
        }
        System.out.println(id + "가 존재하지 않습니다");
        return false;
    }

    public void showAllMember(){
        for(Member m : treeSet) {
            System.out.println(m);
        }
        System.out.println();
    }

}
