package ec;
import static org.junit.Assert.*;
import java.util.ArrayList;
public class Test {

//	@org.junit.Test
//	public void test() {
//		fail("Not yet implemented");
//	}
	@org.junit.Test
	public void BubbleSortTest() {
		ArrayList<Integer> test = new ArrayList<Integer>();
		BubbleSort<Integer> bs = new BubbleSort<Integer>();
		assertEquals(test, bs.bubbleSort(test));
	}
	@org.junit.Test
	public void SelectionSortTest() {
		ArrayList<Integer> test = new ArrayList<Integer>();
		SelectionSort<Integer> bs = new SelectionSort<Integer>();
		assertEquals(test, bs.selectionSort(test));
	}
	@org.junit.Test
	public void InsertionSortTest() {
		ArrayList<Integer> test = new ArrayList<Integer>();
		InsertionSort<Integer> bs = new InsertionSort<Integer>();
		assertEquals(test, bs.insertionSort(test));
	}
	@org.junit.Test
	public void MergeSortTest() {
		ArrayList<Integer> test = new ArrayList<Integer>();
		MergeSort<Integer> bs = new MergeSort<Integer>();
		assertEquals(test, bs.mergeSort1(test));
	}
	@org.junit.Test
	public void CockTailSortTest() {
		ArrayList<Integer> test = new ArrayList<Integer>();
		CockTailSort<Integer> bs = new CockTailSort<Integer>();
		assertEquals(test, bs.cockTailSort(test));
	}
	@org.junit.Test
	public void GnomeSortTest() {
		ArrayList<Integer> test = new ArrayList<Integer>();
		GnomeSort<Integer> bs = new GnomeSort<Integer>();
		assertEquals(test, bs.gnomeSort(test));
	}
	@org.junit.Test
	public void RadixSortTest() {
		ArrayList<Integer> test = new ArrayList<Integer>();
		RadixSort<Integer> bs = new RadixSort<Integer>();
		assertEquals(test, bs.radixSort(test));
	}
}
