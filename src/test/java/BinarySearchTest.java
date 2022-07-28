// The purpose of this code segment is to provide test code for the search() method in BinarySearch.

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class BinarySearchTest {

// This tests to see if an existing element can be found

@Test
public void SearchForExistingElement() {

    int[] testArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
    BinarySearch bin = new BinarySearch();
    int foundIndex = bin.search(testArray, 3);
    assertEquals(2, foundIndex);

}

// This tests searching for an element that does not exist.

@Test
public void SearchForNonExistentElement() {
    int[] testArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
    BinarySearch bin = new BinarySearch();
    int foundIndex = bin.search(testArray, 11);
    assertEquals(-1, foundIndex);

}

}
}
