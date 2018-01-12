package test;

import org.junit.Test;
import org.junit.Assert;
import search.Search;
import util.ItemIndex;
import util.TestAssetEngine;

/**
 * Contains unit tests for methods contained within the Search class.
 */
public class SearchTest {

    private Search search;
    private TestAssetEngine engine;

    public SearchTest() {
        this.search = new Search();
        this.engine = new TestAssetEngine();
    }

    @Test
    public void linearSearchValuePresentTest() {
        int[] arr = this.engine.generateUnorderedIntegerArray();
        ItemIndex itemIndex = this.engine.chooseRandomIntegerIndexFromArray(arr);
        int expected = itemIndex.index;
        int actual = this.search.linearSearch(arr, itemIndex.value);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void linearSearchValueNotPresentTest() {
        int[] arr = this.engine.generateUnorderedIntegerArray();
        int value = this.engine.generateRandomIntegerNotInArray(arr);
        int expected = -1;
        int actual = this.search.linearSearch(arr, value);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void linearSearchSingleValueArrayTest() {
        int[] arr = {6};
        int value = 6;
        int expected = 0;
        int actual = this.search.linearSearch(arr, value);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void linearSearchEmptyArrayTest() {
        int[] arr = {};
        int value = this.engine.generateRandomIntegerNotInArray(arr);
        int expected = -1;
        int actual = this.search.linearSearch(arr, value);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void linearSearchRecursiveValuePresentTest() {
        int[] arr = this.engine.generateUnorderedIntegerArray();
        ItemIndex itemIndex = this.engine.chooseRandomIntegerIndexFromArray(arr);
        int expected = itemIndex.index;
        int actual = this.search.linearSearchRecursive(arr, itemIndex.value, 0);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void linearSearchRecursiveValueNotPresentTest() {
        int[] arr = this.engine.generateUnorderedIntegerArray();
        int value = this.engine.generateRandomIntegerNotInArray(arr);
        int expected = -1;
        int actual = this.search.linearSearchRecursive(arr, value, 0);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void linearSearchRecursiveSingleValueArrayTest() {
        int[] arr = {6};
        int value = 6;
        int expected = 0;
        int actual = this.search.linearSearchRecursive(arr, value, 0);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void linearSearchRecursiveEmptyArrayTest() {
        int[] arr = {};
        int value = this.engine.generateRandomIntegerNotInArray(arr);
        int expected = -1;
        int actual = this.search.linearSearchRecursive(arr, value, 0);
        Assert.assertEquals(expected, actual);
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
