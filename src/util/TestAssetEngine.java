package util;

import java.util.Arrays;
import java.util.Random;

/**
 * Contains tools used to automate the creation of test assets.
 */
public class TestAssetEngine {

    private Random rand = new Random();
    private final int UPPER_BOUND = Integer.MAX_VALUE;

    public TestAssetEngine() {}

    /**
     * Generates a random signed integer.
     * @return the generated integer.
     */
    public int generateRandomInteger() {
        return generateSign() ? this.rand.nextInt(UPPER_BOUND) : -1 * this.rand.nextInt(UPPER_BOUND);
    }

    /**
     * Generates an array of randomly-generated unordered integers.
     * @return the generated array.
     */
    public int[] generateUnorderedIntegerArray() {
        int arraySize = this.rand.nextInt(UPPER_BOUND);
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
        int arraySize = this.rand.nextInt(UPPER_BOUND);
        int[] orderedArr = new int[arraySize];
        for(int i = 0; i < orderedArr.length; i++) {
            orderedArr[i] = generateRandomInteger();
        }
        Arrays.sort(orderedArr);
        return orderedArr;
    }

    /**
     * Randomly generates a true or false value.
     * @return the generated boolean.
     */
    public boolean generateSign() {
        return this.rand.nextInt(2) == 0 ? true : false;
    }
}
