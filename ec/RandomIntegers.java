package ec;
import java.util.ArrayList;
import java.util.Random;
public class RandomIntegers implements SortingAlgorithms{
	 
	ArrayList<Integer> list10 = new ArrayList<Integer>();
	ArrayList<Integer> list100 = new ArrayList<Integer>();
	ArrayList<Integer> list1k = new ArrayList<Integer>();
	ArrayList<Integer> list10k = new ArrayList<Integer>();
	ArrayList<Integer> list100k = new ArrayList<Integer>();
	
	public void setIntegers() {
		
	}
	public static ArrayList<Integer> randomizeList10(ArrayList<Integer> listOf10) {
		Random r = new Random();
		for(int i = 0 ; i < 10 ; i++) {
			listOf10.add((int) (r.nextInt(9) + 1));
		}
		return listOf10;
	}
	public static ArrayList<Integer> randomizeList100(ArrayList<Integer> listOf100) {
		Random r = new Random();
		for(int i = 0 ; i < 100 ; i++) {
			listOf100.add((int) (r.nextInt(99 - 10) + 10));
		}
		return listOf100;
	}
	public static ArrayList<Integer> randomizeList1k(ArrayList<Integer> listOf1k) {
		Random r = new Random();
		for(int i = 0 ; i < 1000 ; i++) {
			listOf1k.add((int) (r.nextInt(1000) + 1));
		}
		return listOf1k;
	}
	public static ArrayList<Integer> randomizeList10k(ArrayList<Integer> listOf10k) {
		Random r = new Random();
		for(int i = 0 ; i < 10000 ; i++) {
			listOf10k.add((int) (r.nextInt(10000) + 1));
		}
		return listOf10k;
	}
	public static ArrayList<Integer> randomizeList100k(ArrayList<Integer> listOf100k) {
		Random r = new Random();
		for(int i = 0 ; i < 100000 ; i++) {
			listOf100k.add((int) (r.nextInt(100000) + 1));
		}
		return listOf100k;
	}
	public static int[] countAndRadix10(int[] list) {
		list = new int[10];
	    for (int i = 0 ; i < 10 ; i++){
	        int n = (int)(Math.random() * 9 + 1);
	        list[i] = n;
	    }
	    return list;
	}
	public static int[] countAndRadix100(int[] list) {
		list = new int[100];
	    for (int i = 0 ; i < 100 ; i++){
	        int n = (int)(Math.random() * 99 + 1);
	        list[i] = n;
	    }
	    return list;
	}
	@Override
	public void sortingAlgorithms() {
		
	}
}
