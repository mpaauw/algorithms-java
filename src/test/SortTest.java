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

    @Test
    public void insertionSortFullTest() {
        int[] arr = this.engine.generateUnorderedIntegerArray();
        int[] expected = new int[arr.length];
        System.arraycopy(arr, 0, expected, 0, arr.length);
        Arrays.sort(expected);
        int[] actual = this.sort.insertionSort(arr);
        Assert.assertArrayEquals(expected, actual);
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
