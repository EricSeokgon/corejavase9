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
    }

    private ArrayList<Member> members = new ArrayList<>();
}
