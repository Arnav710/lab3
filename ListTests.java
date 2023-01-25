import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class ListTests {
    @Test
    public void filter() {
        List<String> input = new ArrayList<String>() {
        };
        input.add("Hello");
        input.add("this");
        input.add("is");
        input.add("a");
        input.add("List");
        StringChecker sc = new ListExamples();
        List<String> result = ListExamples.filter(input, sc);
        List<String> expected = new ArrayList<String>();
        expected.add("Hello");
        expected.add("List");

        assertArrayEquals(expected.toArray(), result.toArray());
    }

    @Test
    public void testMergeLists() {
        List<String> lst1 = new ArrayList<String>(Arrays.asList("11", "21", "31"));
        List<String> lst2 = new ArrayList<String>(Arrays.asList("01", "10", "15", "40"));

        List<String> expected = new ArrayList<String>(Arrays.asList("01", "10", "11", "15", "21", "31", "40"));
        List<String> result = ListExamples.merge(lst1, lst2);

        assertArrayEquals(expected.toArray(), result.toArray());
    }
}
