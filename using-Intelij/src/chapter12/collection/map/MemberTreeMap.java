package chapter12.collection.map;

import chapter12.collection.Member;

import java.util.Iterator;
import java.util.TreeMap;

public class MemberTreeMap {
    private TreeMap<Integer, Member> treeMap;

    public MemberTreeMap() {
        treeMap = new TreeMap<Integer,Member>();
    }

    public void addMember(Member m) {
        treeMap.put(m.getMemberId(),m);
    }

    public boolean removeMember(int id) {
        if(treeMap.containsKey(id)) {
            treeMap.remove(id);
            return true;
        }
        System.out.println(id + "가 없습니다");
        return false;
    }

    public void showAllMember() {
        Iterator<Integer> ir = treeMap.keySet().iterator();
        while(ir.hasNext()) {
            int key = ir.next();
            Member m = treeMap.get(key);
            System.out.println(m);
        }
        System.out.println();
    }
}
