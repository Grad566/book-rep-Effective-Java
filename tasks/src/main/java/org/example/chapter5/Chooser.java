package org.example.chapter5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Chooser<T> {
    private final List<T> choiceList;

    public Chooser(Collection<? extends T> choices) {
        choiceList = new ArrayList<>(choices);
    }
    public T choice() {
        var rnd = ThreadLocalRandom.current();
        return choiceList.get(rnd.nextInt(choiceList.size()));
    }
}
