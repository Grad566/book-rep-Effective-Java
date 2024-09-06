package org.example.createAndDestroyObjects;

import java.io.ObjectStreamException;
import java.io.Serial;
import java.io.Serializable;

public class Elvis2 implements Serializable {
    private static final Elvis2 INSTANCE = new Elvis2();
    private Elvis2(){};

    public static Elvis2 getInstance() {
        return INSTANCE;
    }

    @Serial
    private Object readResolve() throws ObjectStreamException {
        return INSTANCE;
    }
}
