package chapter12.collection.arraylist;

import chapter12.collection.Member;

public class MemberArrayListTest {
    public static void main(String[] args) {
        MemberArraylist memberArraylist = new MemberArraylist();

        Member memberLee = new Member(1001,"이");
        memberArraylist.addMember(memberLee);

        Member memberSon = new Member(1001,"손");
        memberArraylist.addMember(memberSon);

        Member memberPark = new Member(1003,"박");
        memberArraylist.addMember(memberPark);

        Member memberHong = new Member(1004,"홍");
        memberArraylist.addMember(memberHong);

        memberArraylist.showAllMember();

        memberArraylist.removeMember(memberHong.getMemberId());
        System.out.println();
        memberArraylist.showAllMember();
    }
}
