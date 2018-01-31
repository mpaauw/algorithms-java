package sort;

import org.junit.Assert;
import org.junit.Test;
import sort.SelectionSort;
import util.TestAssetEngine;

import java.util.Arrays;

/**
 * Contains unit tests for methods contained within the SelectionSort class.
 */
public class SelectionSortTest {

    private SelectionSort sort;
    private TestAssetEngine engine;

    public SelectionSortTest() {
        this.sort = new SelectionSort();
        this.engine = new TestAssetEngine(new TestAssetEngine.TestAssetEngineBuilder().upperBoundSize(1500));
    }

    @Test
    public void selectionSortFullTest() {
        int[] arr = this.engine.generateUnorderedIntegerArray();
        int[] expected = new int[arr.length];
        System.arraycopy(arr, 0, expected, 0, arr.length);
        Arrays.sort(expected);
        int[] actual = this.sort.selectionSort(arr);
        Assert.assertArrayEquals(expected, actual);
    }
}
