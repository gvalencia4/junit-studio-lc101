package test;

import main.BonusBinarySearch;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BonusBinarySearchTest {

    int[] list;

    @Before
    public void setTestList() {
        list = new int[]{10, 20, 30, 50, 60, 80, 110, 130, 140, 170};
    }

    @Test
    public void findFirstElement() {
        assertEquals(BonusBinarySearch.binarySearch(list, 10), 0);
    }

    @Test
    public void findLastElement() {
        assertEquals(BonusBinarySearch.binarySearch(list, 170), 9);
    }

    @Test
    public void findNoElement() {
        assertEquals(BonusBinarySearch.binarySearch(list, 171), 9);
    }

    @Test
    public void findMiddleElement() {
        assertEquals(BonusBinarySearch.binarySearch(list, 60), 4);
    }
}
