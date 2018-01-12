package test.sort;

import org.junit.Assert;
import org.junit.Test;
import sort.InsertionSort;
import sort.MergeSort;
import util.TestAssetEngine;

import java.util.Arrays;

/**
 * Contains unit tests for methods contained within the MergeSort class.
 */
public class MergeSortTest {

    private MergeSort sort;
    private TestAssetEngine engine;

    public MergeSortTest() {
        this.sort = new MergeSort();
        this.engine = new TestAssetEngine(new TestAssetEngine.TestAssetEngineBuilder().upperBoundSize(1500));
    }

    @Test
    public void mergeSortRecursiveFullTest() {
        int[] arr = this.engine.generateUnorderedIntegerArray();
        int[] expected = new int[arr.length];
        System.arraycopy(arr, 0, expected, 0, arr.length);
        Arrays.sort(expected);
        this.sort.mergeSortRecursive(arr, 0, arr.length - 1);
        int[] actual = arr;
        Assert.assertArrayEquals(expected, actual);
    }
}
