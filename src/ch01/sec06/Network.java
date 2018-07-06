package ch01.sec06;

import java.util.ArrayList;

public class Network {
    public class Member {
        private String name;
        private ArrayList<Member> friends;

        public Member(String name) {
            this.name = name;
            friends = new ArrayList<>();
        }

        public void deactivate() {
            unenroll(this);
        }

    }

    public Member enroll(String name) {
        Member newMember = new Member(name);
        members.add(newMember);
        return newMember;
    }

    public void unenroll(Member member) {

    }

    private ArrayList<Member> members = new ArrayList<>();
}
