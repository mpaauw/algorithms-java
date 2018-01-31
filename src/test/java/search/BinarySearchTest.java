package search;

import org.junit.Assert;
import org.junit.Test;
import util.ItemIndex;
import util.TestAssetEngine;

/**
 * Contains unit tests for methods contained within the BinarySearch class.
 */
public class BinarySearchTest {

    private BinarySearch search;
    private TestAssetEngine engine;

    public BinarySearchTest() {
        this.search = new BinarySearch();
        this.engine = new TestAssetEngine();
    }

    @Test
    public void binarySearchValuePresentTest() {
        int[] arr = this.engine.generateOrderedIntegerArray();
        ItemIndex itemIndex = this.engine.chooseRandomIntegerIndexFromArray(arr);
        int expected = itemIndex.index;
        int actual = this.search.binarySearch(arr, itemIndex.value);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void binarySearchValueNotPresentTest() {
        int[] arr = this.engine.generateOrderedIntegerArray();
        int value = this.engine.generateRandomIntegerNotInArray(arr);
        int expected = -1;
        int actual = this.search.binarySearch(arr, value);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void binarySearchSingleValueArrayTest() {
        int[] arr = {5};
        int value = 5;
        int expected = 0;
        int actual = this.search.binarySearch(arr, value);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void binarySearchEmptyArrayTest() {
        int[] arr = {};
        int value = this.engine.generateRandomIntegerNotInArray(arr);
        int expected = -1;
        int actual = this.search.binarySearch(arr, value);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void binarySearchRecursiveValuePresentTest() {
        int[] arr = this.engine.generateOrderedIntegerArray();
        ItemIndex itemIndex = this.engine.chooseRandomIntegerIndexFromArray(arr);
        int expected = itemIndex.index;
        int actual = this.search.binarySearchRecursive(arr, itemIndex.value, 0, arr.length - 1);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void binarySearchRecursiveValueNotPresentTest() {
        int[] arr = this.engine.generateOrderedIntegerArray();
        int value = this.engine.generateRandomIntegerNotInArray(arr);
        int expected = -1;
        int actual = this.search.binarySearchRecursive(arr, value, 0, arr.length - 1);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void binarySearchRecursiveSingleValueArrayTest() {
        int[] arr = {5};
        int value = 5;
        int expected = 0;
        int actual = this.search.binarySearchRecursive(arr, value, 0, arr.length - 1);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void binarySearchRecursiveEmptyArrayTest() {
        int[] arr = {};
        int value = this.engine.generateRandomIntegerNotInArray(arr);
        int expected = -1;
        int actual = this.search.binarySearchRecursive(arr, value, 0, arr.length - 1);
        Assert.assertEquals(expected, actual);
    }
}
