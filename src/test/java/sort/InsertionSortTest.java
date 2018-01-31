package sort;

import org.junit.Assert;
import org.junit.Test;
import sort.InsertionSort;
import util.TestAssetEngine;

import java.util.Arrays;

/**
 * Contains unit tests for methods contained within the InsertionSort class.
 */
public class InsertionSortTest {

    private InsertionSort sort;
    private TestAssetEngine engine;

    public InsertionSortTest() {
        this.sort = new InsertionSort();
        this.engine = new TestAssetEngine(new TestAssetEngine.TestAssetEngineBuilder().upperBoundSize(1500));
    }

    @Test
    public void insertionSortFullTest() {
        int[] arr = this.engine.generateUnorderedIntegerArray();
        int[] expected = new int[arr.length];
        System.arraycopy(arr, 0, expected, 0, arr.length);
        Arrays.sort(expected);
        int[] actual = this.sort.insertionSort(arr);
        Assert.assertArrayEquals(expected, actual);
    }
}
