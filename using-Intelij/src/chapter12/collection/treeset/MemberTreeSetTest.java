package chapter12.collection.treeset;

import chapter12.collection.Member;

public class MemberTreeSetTest {
    public static void main(String[] args) {
        MemberTreeSet memberTreeSet = new MemberTreeSet();

        Member memberPark = new Member(1001,"박");
        memberTreeSet.addMember(memberPark);

        Member memberLee = new Member(1002,"이");
        memberTreeSet.addMember(memberLee);

        Member memberKim = new Member(1003,"김");
        memberTreeSet.addMember(memberKim);

        Member memberChoi = new Member(1004,"최");
        memberTreeSet.addMember(memberChoi);

        memberTreeSet.showAllMember();
        Member memberJung = new Member(1001,"정");   //아이디 중복회원
        memberTreeSet.addMember(memberJung);
        memberTreeSet.showAllMember();
    }
}
