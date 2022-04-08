package com.tistory.workshop6349.serialization;

import java.io.*;
import java.util.Base64;

public class SerializationExam {

    public static void main(String[] args) {
        Member member = new Member("iqpizza", "iqpizza6349@gmail.com");

        byte[] serializedMember = new byte[0];

        try (ByteArrayOutputStream stream = new ByteArrayOutputStream()) {
            try (ObjectOutputStream outputStream = new ObjectOutputStream(stream)) {
                outputStream.writeObject(member);
                // 직렬화된 member 객체
                serializedMember = stream.toByteArray();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Base64로 인코딩된 문자열
        String base64Member = Base64.getEncoder().encodeToString(serializedMember);

        // Base64로 디코딩된 문자열
        byte[] deserializedMember = Base64.getDecoder().decode(base64Member);

        try (ByteArrayInputStream arrayInputStream = new ByteArrayInputStream(deserializedMember)) {
            try (ObjectInputStream inputStream = new ObjectInputStream(arrayInputStream)) {
                Object objectMember = inputStream.readObject();
                // member 객체로 역직렬화
                Member readMember = (Member) objectMember;
                System.out.println(readMember);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
