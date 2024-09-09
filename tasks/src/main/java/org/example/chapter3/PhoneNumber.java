package org.example.chapter3;

import java.util.Comparator;

public final class PhoneNumber implements Cloneable, Comparable {
    private final short areaCode, prefix, lineNum;
    private int hashCode;

    private static final Comparator<PhoneNumber> COMPARATOR =
            Comparator.comparingInt((PhoneNumber pn) -> pn.areaCode)
                    .thenComparing(pn -> pn.prefix)
                    .thenComparing(pn -> pn.lineNum);
    public PhoneNumber(int areaCode, int prefix, int lineNum) {
        this.areaCode = rangeCheck(areaCode, 999);
        this.prefix = rangeCheck(prefix, 999);
        this.lineNum = rangeCheck(lineNum, 9999);
    }

    private static short rangeCheck(int val, int max) {
        if (val < 0 || val > max) {
            throw new IllegalArgumentException();
        }
        return (short) val;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (!(o instanceof PhoneNumber)) {
            return false;
        }

        var pn = (PhoneNumber) o;
        return pn.lineNum == lineNum && pn.prefix == prefix && pn.areaCode == areaCode;
    }

    @Override
    public int hashCode() {
        var result = hashCode;
        if (result == 0) {
            result = 31 * result + Short.hashCode(areaCode);
            result = 31 * result + Short.hashCode(prefix);
            result = 31 * result + Short.hashCode(lineNum);
            hashCode = result;
        }
        return result;
    }

    @Override
    public String toString() {
        return String.format("%03d-%03d-%04d", areaCode, prefix, lineNum);
    }

    @Override
    public PhoneNumber clone() throws CloneNotSupportedException {
        return (PhoneNumber) super.clone();
    }

    @Override
    public int compareTo(Object o) {
        var pn = (PhoneNumber) o;
        return COMPARATOR.compare(this, pn);
    }
}
