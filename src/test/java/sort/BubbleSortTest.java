package sort;

import org.junit.Assert;
import org.junit.Test;
import util.TestAssetEngine;

import java.util.Arrays;

/**
 * Contains unit tests for methods contained within the BubbleSort class.
 */
public class BubbleSortTest {

    private BubbleSort sort;
    private TestAssetEngine engine;

    public BubbleSortTest() {
        this.sort = new BubbleSort();
        this.engine = new TestAssetEngine(new TestAssetEngine.TestAssetEngineBuilder().upperBoundSize(1500));
    }

    @Test
    public void bubbleSortFullTest() {
        int[] arr = this.engine.generateUnorderedIntegerArray();
        int[] expected = new int[arr.length];
        System.arraycopy(arr, 0, expected, 0, arr.length);
        Arrays.sort(expected);
        int[] actual = this.sort.bulbaSort(arr);
        Assert.assertArrayEquals(expected, actual);
    }
}
