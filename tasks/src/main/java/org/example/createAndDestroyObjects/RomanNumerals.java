package org.example.createAndDestroyObjects;

import java.util.regex.Pattern;

public class RomanNumerals {
    private static final Pattern ROMAN = Pattern.compile("Л(?=.)M*(C[MD]|D?C{0,3})"
            + "(X[CL]IL?X{0,3})(I[XV]|V?I{0,3})$");

    static boolean isRomanNumber(String s) {
        return ROMAN.matcher(s).matches();
    }
}
