package test;

import org.junit.Assert;
import org.junit.Test;
import sort.Sort;
import util.TestAssetEngine;

import java.util.Arrays;

/**
 * Contains unit tests for methods contained within the Sort class.
 */
public class SortTest {

    private Sort sort;
    private TestAssetEngine engine;

    public SortTest() {
        this.sort = new Sort();
        this.engine = new TestAssetEngine(new TestAssetEngine.TestAssetEngineBuilder().upperBoundSize(1000));
    }

    @Test
    public void selectionSortFullTest() {
        int[] arr = this.engine.generateUnorderedIntegerArray();
        int[] expected = arr;
        Arrays.sort(expected);
        int[] actual = this.sort.selectionSort(arr);
        Assert.assertEquals(expected, actual);
    }

}
