package ec;
import java.util.ArrayList;
public class InsertionSort<T extends Comparable<T>> implements SortingAlgorithms{
	 ArrayList<T> list = new ArrayList<T>();
	public InsertionSort() {
		sortingAlgorithms();
	}
	private long comparisons = 0;
	private long swaps = 0;
	static long runtime;
	static long start;
	static long end;
	public ArrayList<T> insertionSort(ArrayList<T> list) {
		long comparisons = 0;
		long swaps = 1;
		T now;
		start = System.currentTimeMillis();
		for(int i = 1 ; i <= list.size() - 1 ; i++) {
			now = list.get(i);
			int j;
			j = i;
			while(j > 0 && now.compareTo(list.get(j - 1)) < 0) {
				comparisons++;
				list.set(j, list.get(j - 1));
				j--;
				list.set(j, now);
			}
			swaps++;
		}
		this.comparisons = comparisons;
		this.swaps = swaps;
		end = System.currentTimeMillis();
		long runtimes = end - start;
		InsertionSort.runtime = runtimes;
		runtime = end - start;
		return list;
	}
	public ArrayList<T> print(ArrayList<T> bubble) {
		ArrayList<T> bs = new ArrayList<T>();
		for(int i = 0 ; i < bubble.size() ; i++) {
			bs.add(bubble.get(i));
		}
		return bs;
	}
	public void compare() {
		System.out.print("Comparisons: " + comparisons);
		
	}
	public void swap() {
		System.out.print("Swaps: " + swaps);
	}
	public void runtime() {
		System.out.print("Runtime: "  + runtime + " ms");
	}
	@Override
	public void sortingAlgorithms() {
		insertionSort(list);
		
	}
}
