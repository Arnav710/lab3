import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
  @Test
  public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[] { 3 }, input1);
  }

  @Test
  public void testReversed() {
    int[] input1 = {};
    assertArrayEquals(new int[] {}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed2() {
    int[] input2 = { 1, 2, 3, 4, 5 };
    assertArrayEquals(new int[] { 5, 4, 3, 2, 1 }, ArrayExamples.reversed(input2));
  }

  @Test
  public void testReverseInPlace2() {
    int[] input2 = { 1, 2, 3, 4 };
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[] { 4, 3, 2, 1 }, input2);
  }

  @Test
  public void averageWithoutLowest1() {
    double[] input1 = { 1, 1, 1, 2, 3, 4, 4 };
    double ans1 = ArrayExamples.averageWithoutLowest(input1);
    assertEquals(15.0 / 6, ans1, 0.0000000000001);
  }

  @Test
  public void averageWithoutLowest2() {
    double[] input1 = { 1, 1, 1, 2, 3, 4, 4 };
    double ans1 = ArrayExamples.averageWithoutLowest(input1);
    assertEquals(15.0 / 6, ans1, 0.0000000000001);
  }

  @Test
  public void averageWithoutLowest3() {
    int[] input3 = { 1, 2, 3, 4 };
    ArrayExamples.reverseInPlace(input3);
    assertArrayEquals(new int[] { 4, 3, 2, 1 }, input3);
  }
}
