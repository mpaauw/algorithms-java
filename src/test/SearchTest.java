package test;

import org.junit.Test;
import org.junit.Assert;
import search.Search;
import util.ItemIndex;
import util.TestAssetEngine;

/**
 * Contains unit tests for methods contains within the Search class.
 */
public class SearchTest {

    private TestAssetEngine engine;

    public SearchTest() {
        this.engine = new TestAssetEngine();
    }

    @Test
    public void linearSearchValuePresentTest() {
        Search search = new Search();
        int[] arr = this.engine.generateUnorderedIntegerArray();
        ItemIndex itemIndex = this.engine.chooseRandomIntegerIndexFromArray(arr);
        int expected = itemIndex.index;
        int actual = search.linearSearch(arr, itemIndex.value);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void linearSearchValueNotPresentTest() {
        Search search = new Search();
        int[] arr = this.engine.generateUnorderedIntegerArray();
        int value = this.engine.generateRandomIntegerNotInArray(arr);
        int expected = -1;
        int actual = search.linearSearch(arr, value);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void linearSearchSingleValueTest() {
        Search search = new Search();
        int[] arr = {6};
        int value = 6;
        int expected = 0;
        int actual = search.linearSearch(arr, value);
        Assert.assertEquals(expected, actual);
    }

    @Test public void linearSearchEmptyArrayTest() {
        Search search = new Search();
        int[] arr = {};
        int value = this.engine.generateRandomIntegerNotInArray(arr);
        int expected = -1;
        int actual = search.linearSearch(arr, value);
        Assert.assertEquals(expected, actual);
    }
}
