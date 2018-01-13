package test.sort;

import org.junit.Assert;
import org.junit.Test;
import sort.QuickSort;
import util.TestAssetEngine;

import java.util.Arrays;

/**
 * Contains unit tests for methods contained within the QuickSort class.
 */
public class QuickSortTest {

    private QuickSort sort;
    private TestAssetEngine engine;

    public QuickSortTest() {
        this.sort = new QuickSort();
        this.engine = new TestAssetEngine(new TestAssetEngine.TestAssetEngineBuilder().upperBoundSize(1500));
    }

    @Test
    public void quickSortFullTest() {
        int[] arr = this.engine.generateUnorderedIntegerArray();
        int[] expected = new int[arr.length];
        System.arraycopy(arr, 0, expected, 0, arr.length);
        Arrays.sort(expected);
        this.sort.quickSortRecursive(arr, 0, arr.length - 1);
        int[] actual = arr;
        Assert.assertArrayEquals(expected, actual);
    }

}
