package ec;
import java.util.ArrayList;
public class BubbleSort<T extends Comparable<T>> implements SortingAlgorithms {
	private ArrayList<T> blist = null /*new ArrayList<Integer>()*/;
	private long comparisons = 0;
	private long swaps = 0;
	private long runtime = 0;
	long start;
	long end;
	public BubbleSort() {
		ArrayList<T> b =  new ArrayList<T>();
		blist = b;
	
		sortingAlgorithms();
	}
	public ArrayList<T> bubbleSort(ArrayList<T> list1) {
		long comp = 0;
		long swap = 0;
		start = System.currentTimeMillis();
		for(int i = 1 ; i <= list1.size() - 1 ; i++) {
			for(int j = 0 ; j <= list1.size() - 2 ; j++) {
				comp++;
				if(list1.get(j).compareTo(list1.get(j + 1)) > 0) {
					swap++;
					T current;
					current = list1.get(j);
					list1.set(j, list1.get(j + 1));
					list1.set(j + 1, current);
				}	
			}
		}
		this.comparisons = comp;
		this.swaps = swap;
		end = System.currentTimeMillis();
		long runtimes = end - start;
		this.runtime = runtimes;
		return list1;
	}
	public void sortingAlgorithms() {
		bubbleSort(blist);
	}
	public ArrayList<T> print(ArrayList<T> bubble) {
		ArrayList<T> bs = new ArrayList<T>();
		for(int i = 0 ; i < bubble.size() ; i++) {
			bs.add(bubble.get(i));
		}
		return bs;
	}
	public void compare() {
		//System.out.println();
		System.out.print("Comparisons: " + comparisons + "\t\t");
		
	}
	public void swap() {
		System.out.print("Swaps: " + swaps);
	}
	public void runtime() {
		System.out.print("Runtime: "  + runtime + " ms");
	}
	public long getComparisons() {
		return this.comparisons;
	}
	public long getSwaps() {
		return this.swaps;
	}
	public void setList(ArrayList<T> list) {
		this.blist = list;
	}
	public void setComparisons(long comparisons) {
		this.comparisons = comparisons;
	}
	public void setSwaps(long swaps) {
		this.swaps = swaps;
	}
	public ArrayList<T> getList() {
		return blist;
	}
}
