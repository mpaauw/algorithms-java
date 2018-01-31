package search;

import org.junit.Assert;
import org.junit.Test;
import util.ItemIndex;
import util.TestAssetEngine;

/**
 * Contains unit tests for methods contained within the LinearSearch class.
 */
public class LinearSearchTest {

    private LinearSearch search;
    private TestAssetEngine engine;

    public LinearSearchTest() {
        this.search = new LinearSearch();
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
}
