package chapter12.collection.map;

import chapter12.collection.Member;

public class MemberHashMapTest {
    public static void main(String[] args) {
        MemberHashMap memberHashMap = new MemberHashMap();

        Member memberLee = new Member(1001,"이");
        memberHashMap.addMember(memberLee);

        Member memberPark = new Member(1002,"박");
        memberHashMap.addMember(memberPark);

        Member memberKim = new Member(1003,"김");
        memberHashMap.addMember(memberKim);

        Member memberChil = new Member(1004,"칠");
        memberHashMap.addMember(memberChil);

        memberHashMap.showAllMember();

        memberHashMap.removeMember(1004);
        memberHashMap.showAllMember();
    }
}
