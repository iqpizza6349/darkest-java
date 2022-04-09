package com.tistory.workshop6349.needless;

import java.util.regex.Pattern;

public class NumberChecker {

    private static final Pattern NUMBERAL = Pattern.compile(
            "^[0-9]+$"
    );

    public static boolean isNumberal(String s) {
        return NUMBERAL.matcher(s).matches();
    }
}
