package org.example.chapter4;

import java.util.Map;
import java.util.Objects;

public abstract class AbstractMapEntry<K, V> implements Map.Entry<K, V> {
    @Override
    public K getKey() {
        return null;
    }

    @Override
    public V getValue() {
        return null;
    }

    @Override
    public V setValue(V value) {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return  true;
        }

        if (!(o instanceof Map.Entry)) {
            return false;
        }
        var e = (Map.Entry) o;
        return Objects.equals(e.getKey(), getKey()) && Objects.equals(e.getValue(), getValue());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getKey())^Objects.hashCode(getValue());
    }

    @Override
    public String toString() {
        return getKey() + "=" + getValue();
    }
}
