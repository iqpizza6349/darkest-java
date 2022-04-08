package com.tistory.workshop6349.autocloseable;

public class Main {

    public static void main(String[] args) {
        try (Member member = new Member("김유저", 10)) {
            member.action();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
