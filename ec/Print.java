package ec;
import java.util.ArrayList;
public class Print {
	public static void printList10(ArrayList<Integer> list1) {
		int spacing = 1;
		for(int i = 0 ; i < 10 ; i++) {
			System.out.print(list1.get(i) + " ");
			if(spacing % 10 == 0) {
				//System.out.println();
			}
			spacing++;
		}
	}
	public static void printList100(ArrayList<Integer> list) {
		int spacing = 1;
		for(int i = 0 ; i < 100 ; i++) {
			System.out.print(list.get(i) + " ");
			if(spacing % 10 == 0) {
				System.out.println();
			}
			spacing++;
		}
	}
	public static void printList1k(ArrayList<Integer> list) {
		int spacing = 1;
		for(int i = 0 ; i < 1000 ; i++) {
			System.out.print(list.get(i) + " ");
			if(spacing % 100 == 0) {
				System.out.println();
			}
			spacing++;
		}
	}
	public static void printList10k(ArrayList<Integer> list) {
		int spacing = 1;
		for(int i = 0 ; i < 10000 ; i++) {
			System.out.print(list.get(i) + " ");
			if(spacing % 1000 == 0) {
				System.out.println();
			}
			spacing++;
		}
	}
	public static void printList100k(ArrayList<Integer> list) {
		int spacing = 1;
		for(int i = 0 ; i < 100000 ; i++) {
			System.out.print(list.get(i) + " ");
			if(spacing % 100 == 0) {
				System.out.println();
			}
			spacing++;
		}
	}
	public static void printCountRadix10(long[] list) {
		int spacing = 1;
		for(int i = 0 ; i < 10 ; i++) {
			System.out.print(list[i] + " ");
			if(spacing % 10 == 0) {
				System.out.println();
			}
			spacing++;
		}
	}
	public static void printCountRadix100(long[] list) {
		int spacing = 1;
		for(int i = 0 ; i < 100 ; i++) {
			System.out.print(list[i] + " ");
			if(spacing % 10 == 0) {
				System.out.println();
			}
			spacing++;
		}
	}
}