package com.tistory.workshop6349.autocloseable;

public class Member implements AutoCloseable {

    private final String name;
    private int age;

    public Member(String name) {
        this(name, 10);
    }

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void action() {
        System.out.println("움직임");
    }

    @Override
    public void close() throws Exception {
        System.out.println("인스턴스를 닫습니다.");
    }
}
