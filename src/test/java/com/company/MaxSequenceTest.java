package com.company;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.List;

public class MaxSequenceTest {
    @Test
    public void maxValueShouldMaxIndex() {
        List<Integer> duplicate = new ArrayList<>();
        duplicate.add(1);
        duplicate.add(2);
        duplicate.add(-3);
        Assertions.assertEquals(1, MaxSequence.maxValue(duplicate));
    }

    @Test
    public void maxValueShouldZero() {
        List<Integer> duplicate = new ArrayList<>();
        Assertions.assertEquals(0, MaxSequence.maxValue(duplicate));
    }

    @Test
    public void maxValueShouldNullException() {
        Assertions.assertThrows(NullPointerException.class, () -> MaxSequence.maxValue(null));
    }

    @Test
    public void secondMaxValueShouldMaxIndex() {
        List<Integer> duplicate = new ArrayList<>();
        duplicate.add(1);
        duplicate.add(2);
        duplicate.add(-3);
        Assertions.assertEquals(0, MaxSequence.secondMaxValue(duplicate, 2));
    }

    @Test
    public void secondMaxValueShouldZero() {
        List<Integer> duplicate = new ArrayList<>();
        Assertions.assertEquals(0, MaxSequence.secondMaxValue(duplicate, 0));
    }

    @Test
    public void secondMaxValueShouldNullException() {
        Assertions.assertThrows(NullPointerException.class, () -> MaxSequence.secondMaxValue(null, 0));
    }


}
