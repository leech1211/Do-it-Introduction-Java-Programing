package chapter12.collection.hashset;

import chapter12.collection.Member;

public class MemberHashSetTest {
    public static void main(String[] args) {
        MemberHashSet memberHashSet = new MemberHashSet();

        Member memberLee = new Member(1001,"이");
        memberHashSet.addMember(memberLee);

        Member memberHan = new Member(1002,"한");
        memberHashSet.addMember(memberHan);

        Member memberSong = new Member(1003,"송");
        memberHashSet.addMember(memberSong);

        Member memberKim = new Member(1004,"김");
        memberHashSet.addMember(memberKim);

        memberHashSet.showAllMember();

        Member memberHong = new Member(1002,"홓");   //아이디 중복회원 추가
        memberHashSet.addMember(memberHong);
        memberHashSet.showAllMember();
    }
}
