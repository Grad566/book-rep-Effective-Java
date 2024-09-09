package org.example.chapter3;

public class HashTable implements Cloneable {
    private Entry[] buckets = new Entry[3];
    private static class Entry {
        final Object key;
        Object value;
        Entry next;
        Entry(Object key, Object value, Entry next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }

        Entry deepCopy() {
            return new Entry(key, value, next == null ? null : next.deepCopy());
        }
    }

    @Override
    public HashTable clone() throws CloneNotSupportedException {
        HashTable hashTable = (HashTable) super.clone();
        hashTable.buckets = new Entry[buckets.length];

        for (var i = 0; i < buckets.length; i++) {
            if (buckets[i] != null) {
                hashTable.buckets[i] = buckets[i].deepCopy();
            }
        }
        return hashTable;

    }
}
