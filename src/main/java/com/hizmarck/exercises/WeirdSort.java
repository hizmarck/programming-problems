package com.hizmarck.exercises;

import java.util.Arrays;

public class WeirdSort {

    public static void main(String[] args) {
        var numbers = new int[]{1, 2, 3, 4 , 5 ,6};
        var weirdSort = new WeirdSort();

        var ordered = weirdSort.sortedNoTConsecutive(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(ordered));
    }

    /**
     * Return a new array sorted in a way when no 2 consecutive integers
     * have consecutive values.
     * @param numbersToSort sequence of numbers
     * @return ordered array
     */
    public int[] sortedNoTConsecutive(int[] numbersToSort) {

        int size = numbersToSort.length;
        int[] numbers = Arrays.copyOf(numbersToSort, size);

        // the head = i (index)
        // (1) if a[i] is equal to (a[i-1]+1)
        // (2) swap both
        // (3) if the new a[i]+1 is equal to a[i+1]
        // (4) add to the head + 1
        // repeat the algorithm
        int head = size - 1;

        while (head > 0) {
            int ai = numbers[head];
            int aBefore = numbers[head - 1] + 1;
            if (aBefore == ai) { // (1)
                // (2)
                numbers[head] = numbers[head -1];
                numbers[head - 1] = ai;
                // validate bounds
                if (head < size - 1) {
                    // (3)
                    ai = numbers[head] + 1;
                    int aNext = numbers[head +1];
                    if (ai == aNext) { // (4)
                        head++;
                        continue;
                    }
                }
            }

            head--;
        }

        return numbers;

    }
}
