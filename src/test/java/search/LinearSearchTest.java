package search;

import org.junit.Assert;
import org.junit.Ignore;
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
        Integer expected = itemIndex.index;
        Integer actual = this.search.linearSearch(arr, itemIndex.value);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void linearSearchValueNotPresentTest() {
        int[] arr = this.engine.generateUnorderedIntegerArray();
        int value = this.engine.generateRandomIntegerNotInArray(arr);
        Integer expected = null;
        Integer actual = this.search.linearSearch(arr, value);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void linearSearchSingleValueArrayTest() {
        int[] arr = {6};
        int value = 6;
        Integer expected = 0;
        Integer actual = this.search.linearSearch(arr, value);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void linearSearchEmptyArrayTest() {
        int[] arr = {};
        int value = this.engine.generateRandomIntegerNotInArray(arr);
        Integer expected = null;
        Integer actual = this.search.linearSearch(arr, value);
        Assert.assertEquals(expected, actual);
    }

    // TODO: fix test
    @Test
    @Ignore
    public void linearSearchRecursiveValuePresentTest() {
        int[] arr = this.engine.generateUnorderedIntegerArray();
        ItemIndex itemIndex = this.engine.chooseRandomIntegerIndexFromArray(arr);
        Integer expected = itemIndex.index;
        Integer actual = this.search.linearSearchRecursive(arr, itemIndex.value);
        Assert.assertEquals(expected, actual);
    }

    //TODO: make test run with smaller input, since it's running a recursive linear search (yikes!)
    @Test
    @Ignore
    public void linearSearchRecursiveValueNotPresentTest() {
        int[] arr = this.engine.generateUnorderedIntegerArray();
        int value = this.engine.generateRandomIntegerNotInArray(arr);
        Integer expected = null;
        Integer actual = this.search.linearSearchRecursive(arr, value);
        Assert.assertEquals(expected, actual);
    }

    // TODO: fix test
    @Test
    @Ignore
    public void linearSearchRecursiveSingleValueArrayTest() {
        int[] arr = {6};
        int value = 6;
        Integer expected = 0;
        Integer actual = this.search.linearSearchRecursive(arr, value);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void linearSearchRecursiveEmptyArrayTest() {
        int[] arr = {};
        int value = this.engine.generateRandomIntegerNotInArray(arr);
        Integer expected = null;
        Integer actual = this.search.linearSearchRecursive(arr, value);
        Assert.assertEquals(expected, actual);
    }
}
