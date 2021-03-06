package com.bunk3r.spanez.locators;

import android.support.annotation.IntRange;

/**
 * Part of SpanEZ
 * Created by joragu on 1/12/2017.
 */
public class TargetRange {
    public static TargetRange from(@IntRange(from = 0) int start, @IntRange(from = 0) int end) {
        if (end < start) {
            throw new IllegalArgumentException("The end of the range shouldn't be before the start");
        }

        return new TargetRange(start, end);
    }

    @IntRange(from = 0)
    private final int start;

    @IntRange(from = 0)
    private final int end;

    private TargetRange(@IntRange(from = 0) int start, @IntRange(from = 0) int end) {
        this.start = start;
        this.end = end;
    }

    @IntRange(from = 0)
    public int getStart() {
        return start;
    }

    @IntRange(from = 0)
    public int getEnd() {
        return end;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TargetRange)) return false;

        TargetRange that = (TargetRange) o;
        return  (start == that.start) && (end == that.end);

    }

    @Override
    public int hashCode() {
        int result = start;
        result = 31 * result + end;
        return result;
    }
}
