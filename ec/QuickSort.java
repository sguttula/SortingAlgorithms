package ec;

import java.util.ArrayList;

public class QuickSort<T extends Comparable<T>> implements SortingAlgorithms{
	ArrayList<T> list = new ArrayList<T>();
	static long compareQuick = 0;
	static long swapsQuick = 0;
	static long runtime;
	static long start;
	static long end;
	public QuickSort() {
		
	}
	public int quickSort1(ArrayList<T> quick, int i, int j) {
		T turn = quick.get(j);
		int bottom = i - 1;
		for(int top = i ; top <= j - 1 ; top++) {
			compareQuick++;
			if(quick.get(top).compareTo(turn) <= 0) {
				bottom = bottom + 1;
				swapsQuick++;
				T q = quick.get(bottom);
				quick.set(bottom, quick.get(top));
				quick.set(top, q);
				
			}
			
		}
		swapsQuick++;
		T p = quick.get(bottom + 1);
		quick.set(bottom + 1, quick.get(j));
		quick.set(j, p);
		return bottom + 1;
	}
	public ArrayList<T> quickSort2(ArrayList<T> list2) {
		return quickSort3(list2, 0, list2.size() - 1);
	} 
	public ArrayList<T> quickSort3(ArrayList<T> quick, int i, int j) {
		if(i < j) {
			int sort = quickSort1(quick, i, j);
			quickSort3(quick, i, sort - 1);
			quickSort3(quick, sort + 1, j);
		}
		
		return quick;
	}
	@Override
	public void sortingAlgorithms() {
		quickSort2(list);		
	}
	public void euntime() {
		System.out.print("Runtime: "  + (runtime * 2) + " ms");
	}
	public ArrayList<T> quickSort4(ArrayList<T> quickList) {
		start = System.currentTimeMillis();
		quickSort2(quickList);
		end = System.currentTimeMillis();
		runtime = end - start;
		return quickList;
	}
	public ArrayList<T> print(ArrayList<T> bubble) {
		ArrayList<T> bs = new ArrayList<T>();
		for(int i = 0 ; i < bubble.size() ; i++) {
			bs.add(bubble.get(i));
		}
		return bs;
	}
	public static void compare() {
		System.out.print("Comparisons: " + compareQuick);
		
	}
	public static void swap() {
		System.out.print("Swaps: " + swapsQuick);
	}
	public void runtime() {
		System.out.print("Runtime: "  + runtime + " ms");
	}
}
