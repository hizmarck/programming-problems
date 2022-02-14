package com.hizmarck.exercises;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WeirdSortTest {

    private static final WeirdSort weirdSort = new WeirdSort();

    private static final int[] TINY_ARRAY = new int[]{1,2};
    private static final String TINY_ARRAY_EXPECTED = "[2, 1]";


    private static final int[] CONSECUTIVE_ARRAY = new int[]{1,2,3,4,5,6};
    private static final List<String> CONSECUTIVE_ARRAY_EXPECTED = List.of("[1, 3, 2, 4, 6, 5]", "[2, 1, 4, 3, 6, 5]");

    private static final int[] DUPLICATE_NUMBERS_ARRAY = new int[]{1,1,2,2,3,3};
    private static final List<String> DUPLICATE_NUMBERS_ARRAY_EXPECTED = List.of("[1, 1, 3, 3, 2, 2]", "[2, 1, 1, 3, 3, 2]");

    @Test
    void tinyArrayShouldBeSorted() {
        var expected = Arrays.toString(weirdSort.sortedNoTConsecutive(TINY_ARRAY));
        assertEquals(TINY_ARRAY_EXPECTED, expected);
    }

    @Test
    void consecutiveArrayShouldBeSorted() {
        var expected = Arrays.toString(weirdSort.sortedNoTConsecutive(CONSECUTIVE_ARRAY));
        assertTrue(CONSECUTIVE_ARRAY_EXPECTED.contains(expected));
    }

    @Test
    void duplicateArrayNumberShouldBeSorted() {
        var expected = Arrays.toString(weirdSort.sortedNoTConsecutive(DUPLICATE_NUMBERS_ARRAY));
        assertTrue(DUPLICATE_NUMBERS_ARRAY_EXPECTED.contains(expected));
    }
}
