package ec;

import java.util.ArrayList;

public class SelectionSort<T extends Comparable<T>> implements SortingAlgorithms {
	private ArrayList<T> blist = null
	public SelectionSort() {
		ArrayList<T> b = new ArrayList<T>();
		blist = b;
		sortingAlgorithms();
	}
	private long comparisons = 0;
	private long swaps = 0;
	private long runtime = 0;
	static long start;
	static long end; 
	public ArrayList<T> selectionSort(ArrayList<T> list) {
		long comparisons = 0;
		long swaps = 1;
		int n;
		start = System.currentTimeMillis();
		for(int i = 0 ; i < list.size() - 1 ; i++) {
			n = i;
			for(int j = i + 1 ; j < list.size() ; j++) {
				comparisons++;
				if(list.get(j).compareTo(list.get(n)) < 0) {
					n = j;
				}
			}
			swaps++;
			if(n != i) {
				T move = list.get(i);
				list.set(i, list.get(n));
				list.set(n, move);
		}
		}
		this.comparisons = comparisons;
		this.swaps = swaps;
		end = System.currentTimeMillis();
		long runtimes = end - start;
		this.runtime = runtimes;
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
		System.out.print("Comparisons: " + this.comparisons);
		
	}
	public void swap() {
		System.out.print("Swaps: " + this.swaps);
	}
	public void runtime() {
		System.out.print("Runtime: "  + runtime + " ms");
	}
	@Override
	public void sortingAlgorithms() {
		this.blist = selectionSort(this.blist);
		
	}
}
