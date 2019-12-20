package ec;

import java.util.ArrayList;

public class MergeSort<T extends Comparable<T>> implements SortingAlgorithms{
	 ArrayList<T> merge = new ArrayList<T>();
	public MergeSort() {
		sortingAlgorithms();
	}
	private static  long comparisons = 0;
	private static  long swaps = 0;
	private static  long runtime = 0;
	static long start;
	static long end;
	public ArrayList<T> mergeSort1(ArrayList<T> list3) {
		ArrayList<T> left = new ArrayList<T>();
		ArrayList<T> right = new ArrayList<T>();
		if(list3.size() > 1) {
			int half = (list3.size() - 1) / 2;
			for(int i = 0 ; i <= half ; i++) {
				left.add(list3.get(i));
			}
			for(int j = half + 1; j <= list3.size() - 1; j++) {
				right.add(list3.get(j));
			}
			left = mergeSort1(left);
			right = mergeSort1(right);
		}
		return mergeSort2(left, right, list3);
	}
	public ArrayList<T> mergeSort2(ArrayList<T> left, ArrayList<T> right, ArrayList<T> list3) {
		int a = 0, b = 0, c = 0;
		long comparisons = 0;
		long swaps = 0;
		while((a < left.size()) && (b < right.size())) {
			comparisons++;
			if(left.get(a).compareTo(right.get(b)) < 0) {
				list3.set(c, left.get(a));
				a++;
			}
			else {
				list3.set(c, right.get(b));
				b++;
			}
			c++;
		}
		while(a < left.size()) {
			list3.set(c, left.get(a));
			a++;
			c++;
		}
		while(b < right.size()) {
			list3.set(c, right.get(b));
			b++;
			c++;
		}
		MergeSort.comparisons = comparisons;
		MergeSort.swaps = swaps;
		return list3;		
	}
	public ArrayList<T> mergeSort3(ArrayList<T> mergeList) {
		start = System.currentTimeMillis();
		mergeSort1(mergeList);
		end = System.currentTimeMillis();
		runtime = end - start;
		return mergeList;
	}
	public ArrayList<T> print(ArrayList<T> bubble) {
		ArrayList<T> bs = new ArrayList<T>();
		for(int i = 0 ; i < bubble.size() ; i++) {
			bs.add(bubble.get(i));
		}
		return bs;
	}
	public static void runtime() {
		System.out.print("Runtime: "  + runtime + " ms");
	}
	@Override
	public void sortingAlgorithms() {
		mergeSort1(merge);
		
	}
	public static void compare() {
		System.out.print("Comparisons: " + comparisons);
		
	}
	public static void swap() {
		System.out.print("Swaps: " + swaps);
	}
	public static void euntime() {
		System.out.print("Runtime: "  + (runtime * 2) + " ms");
	}
}