package test;

import org.junit.Test;
import org.junit.Assert;
import search.Search;

/**
 * Contains unit tests for methods contains within the Search class.
 */
public class SearchTest {

    @Test
    public void linearSearchValuePresentTest() {
        Search search = new Search();
        int[] arr = {6, 11, 50, 0, 5, 1000};
        int value = 5;
        int expected = 4;
        int actual = search.linearSearch(arr, value);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void linearSearchValueNotPresentTest() {
        Search search = new Search();
        int[] arr = {6, 11, 50, 0, 5, 1000};
        int value = 27;
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
        int value = 99;
        int expected = -1;
        int actual = search.linearSearch(arr, value);
        Assert.assertEquals(expected, actual);
    }
}
