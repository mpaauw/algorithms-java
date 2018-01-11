package util;

import java.util.Arrays;
import java.util.Random;

/**
 * Contains tools used to automate the creation of test assets.
 */
public class TestAssetEngine {

    private Random rand = new Random();
    private final int UPPER_BOUND_VALUE = Integer.MAX_VALUE;
    private final int UPPER_BOUND_SIZE = 1000000;

    public TestAssetEngine() {}

    /**
     * Generates a random signed integer.
     * @return the randomly generated integer.
     */
    public int generateRandomInteger() {
        return generateSign() ? this.rand.nextInt(UPPER_BOUND_VALUE) : -1 * this.rand.nextInt(UPPER_BOUND_VALUE);
    }

    /**
     * Generates a random signed integer given a specified upper bound.
     * @param bound the upper bound to use during integer generation.
     * @return the randomly generated integer.
     */
    public int generateRandomIntegerWithBound(int bound) {
        return generateSign() ? this.rand.nextInt(bound) : -1 * this.rand.nextInt(bound);
    }

    /**
     * Generates an array of randomly-generated unordered integers.
     * @return the generated array.
     */
    public int[] generateUnorderedIntegerArray() {
        int arraySize = this.rand.nextInt(UPPER_BOUND_SIZE);
        int[] unorderedArr = new int[arraySize];
        for(int i = 0; i < unorderedArr.length; i++) {
            unorderedArr[i] = generateRandomInteger();
        }
        return unorderedArr;
    }

    /**
     * Generates an array of randomly-generated ordered integers.
     * @return the generated array.
     */
    public int[] generateOrderedIntegerArray() {
        int arraySize = this.rand.nextInt(UPPER_BOUND_SIZE);
        int[] orderedArr = new int[arraySize];
        for(int i = 0; i < orderedArr.length; i++) {
            orderedArr[i] = generateRandomInteger();
        }
        Arrays.sort(orderedArr);
        return orderedArr;
    }

    /**
     * Randomly chooses an integer-index pair from a given array.
     * @param arr the array to choose from.
     * @return the randomly chosen ItemIndex value.
     */
    public ItemIndex chooseRandomIntegerIndexFromArray(int[] arr) {
        int index = this.rand.nextInt(arr.length);
        return new ItemIndex(arr[index], index);
    }

    /**
     * Randomly generates an integer that does not exist in a given array.
     * @param arr the array to use for reference.
     * @return the randomly generated integer.
     */
    public int generateRandomIntegerNotInArray(int[] arr) {
        int value = generateRandomIntegerWithBound(UPPER_BOUND_VALUE);
        while(Arrays.asList(arr).contains(value)) {
            value = generateRandomIntegerWithBound(UPPER_BOUND_VALUE);
        }
        return value;
    }

    /**
     * Randomly generates a true or false value.
     * @return the generated boolean.
     */
    public boolean generateSign() {
        return this.rand.nextInt(2) == 0 ? true : false;
    }
}
