package com.tistory.workshop6349.serialization;

import java.io.Serializable;

public class Member implements Serializable {

    private final String name;
    private final String email;

    public Member(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Member{name='" + name + "', email='" + email + "'}";
    }
}
