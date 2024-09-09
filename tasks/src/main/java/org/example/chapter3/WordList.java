package org.example.chapter3;

import java.util.Collection;
import java.util.Collections;
import java.util.TreeSet;

public class WordList {
    public static void compare() {
        var set = new TreeSet<String>();
        var words = new String[]{"s", "s", "d"};
        Collections.addAll(set, words);
    }
}
