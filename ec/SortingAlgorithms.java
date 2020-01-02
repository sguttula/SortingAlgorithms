package ec;
public interface SortingAlgorithms{
	
	public void sortingAlgorithms();
	
}











































//	static ArrayList<Integer> randList;	
//		protected final SimpleStringProperty sorttype = new SimpleStringProperty();
//		protected final SimpleStringProperty size = new SimpleStringProperty();
//		protected static final SimpleStringProperty runtimer = new SimpleStringProperty();
//		protected static final SimpleStringProperty compar = new SimpleStringProperty();
//		protected static final SimpleStringProperty swas = new SimpleStringProperty();
//
//		ArrayList<Long> list10 = new ArrayList<Long>();
//		ArrayList<Long> list100 = new ArrayList<Long>();
//		ArrayList<Long> list1k = new ArrayList<Long>();
//		ArrayList<Long> list10k = new ArrayList<Long>();
//		ArrayList<Long> list100k = new ArrayList<Long>();
//		
//		public void organize() {
//			RandomIntegers q = new RandomIntegers();
//			list10 = q.list10;
//			list100 = q.list100;
//			list1k = q.list1k;
//			list10k = q.list10k;
//			list100k = q.list100k;
//		}
////		SortingAlgorithms(String alg, String siz, long run, long comp, long swap) {		
//
//		
//		public static <K> void printList(ArrayList<Integer> list) {
//			//int spacing = 1;
//			for(int i = 0 ; i < list.size() ; i++) {
//				System.out.print(list.get(i) + " ");
////				if(spacing % 10 == 0) {
////					System.out.println();
////				}
////				spacing++;
//			}
//		}
//	protected static void methodToTime() {}
//	public String getType() {
//		return sorttype.get();
//	}
//	public String getSize() {
//		return size.get();
//	}
//	public String getRuntimer() {
//		return runtimer.get();
//	}
//	public String getCompar() {
//		return compar.get();
//	}
//	public String getSwas() {
//		return swas.get();
//	}
//}
////swap(bubble[j], bubble[j + 1], bubble);
////		public static void swap(int i, int j, ArrayList<Integer> swapList) {
////			int current;
////			current = swapList.get(i);
////			swapList.set(i, swapList.get(j));
////			swapList.set(j, current);
////		}
////TableView






























/*
package ec;
import java.util.ArrayList;
public class Driver {
	static ArrayList<Integer> list1 = new ArrayList<Integer>();
	static ArrayList<Integer> list6 = new ArrayList<Integer>();
	static ArrayList<Integer> list11 = new ArrayList<Integer>();
	static ArrayList<Integer> list2 = new ArrayList<Integer>();
	static ArrayList<Integer> list3 = new ArrayList<Integer>();
	static ArrayList<Integer> list4 = new ArrayList<Integer>();
	static ArrayList<Integer> list5 = new ArrayList<Integer>();
	static ArrayList<Integer> list7 = new ArrayList<Integer>();
	static ArrayList<Integer> list8 = new ArrayList<Integer>();
	static ArrayList<Integer> list9 = new ArrayList<Integer>();
	static ArrayList<Integer> list0 = new ArrayList<Integer>();
	static ArrayList<Integer> list12 = new ArrayList<Integer>();
	static ArrayList<Integer> list13 = new ArrayList<Integer>();
	static ArrayList<Integer> list14 = new ArrayList<Integer>();
	static ArrayList<Integer> list15 = new ArrayList<Integer>();
	static ArrayList<Integer> list16 = new ArrayList<Integer>();
	static ArrayList<Integer> list17 = new ArrayList<Integer>();
	static ArrayList<Integer> list18 = new ArrayList<Integer>();
	static ArrayList<Integer> list19 = new ArrayList<Integer>();
	static ArrayList<Integer> list20 = new ArrayList<Integer>();
	static ArrayList<Integer> list21 = new ArrayList<Integer>();
	static ArrayList<Integer> list22 = new ArrayList<Integer>();
	static ArrayList<Integer> list23 = new ArrayList<Integer>();
	static ArrayList<Integer> list24 = new ArrayList<Integer>();
	static ArrayList<Integer> list25 = new ArrayList<Integer>();
	static ArrayList<Integer> list26 = new ArrayList<Integer>();
	static ArrayList<Integer> list27 = new ArrayList<Integer>();
	static ArrayList<Integer> list28 = new ArrayList<Integer>();
	static ArrayList<Integer> list29 = new ArrayList<Integer>();
	static ArrayList<Integer> list30 = new ArrayList<Integer>();
	static ArrayList<Integer> list31 = new ArrayList<Integer>();
	static ArrayList<Integer> list32 = new ArrayList<Integer>();
	static ArrayList<Integer> list33 = new ArrayList<Integer>();
	static ArrayList<Integer> list34 = new ArrayList<Integer>();
	static ArrayList<Integer> list35 = new ArrayList<Integer>();
	static ArrayList<Integer> list36 = new ArrayList<Integer>();
	static ArrayList<Integer> list37 = new ArrayList<Integer>();
	static ArrayList<Integer> list38 = new ArrayList<Integer>();
	static ArrayList<Integer> list39 = new ArrayList<Integer>();
	static ArrayList<Integer> list40 = new ArrayList<Integer>();
	static ArrayList<Integer> count = new ArrayList<Integer>();
	//static int[] count = new int[];
	public static void print10List() {		
		System.out.println("BUBBLE SORT:\t\t\t SELECTION SORT:\t\t  INSERTION SORT:\t\t   QUICK SORT:\t\t\t    MERGE SORT:\t\t\t"
				+ "     COCKTAIL SORT:\t\t      GNOME SORT:\t\t       RADIX SORT:\t\t\t\tCOUNTING SORT:\t\t\t\t");
		System.out.println();
		RandomIntegers.randomizeList10(list1);
		RandomIntegers.randomizeList10(list6);
		RandomIntegers.randomizeList10(list11);
		RandomIntegers.randomizeList10(list2);
		RandomIntegers.randomizeList10(list3);
		RandomIntegers.randomizeList10(list5);
		RandomIntegers.randomizeList10(list7);
		RandomIntegers.randomizeList10(list4);
		//RandomIntegers.randomizeList10(count);
		
		BubbleSort bs = new BubbleSort(list1);
		//bs.bubbleSort(list1);
		System.out.println("List of 10 random numbers:\t List of 10 random numbers:\t  List of 10 random numbers:\t   List of 10 random numbers:\t "
				+ "   List of 10 random numbers:\t     List of 10 random numbers:       List of 10 random numbers:     "
				+ "  List of 10 random numbers:\t\tList of 10 random numbers:\t ");
		BubbleSort.print(list1);
		System.out.printf("\t\t ");
		SelectionSort.print(list6);
		System.out.printf("\t\t  ");
		InsertionSort.print(list11);
		System.out.printf("\t\t   ");
		QuickSort.print(list2);
		System.out.printf("\t\t    ");
		MergeSort.print(list3);
		System.out.printf("\t     ");
		CockTailSort.print(list5);
		System.out.printf("             ");
		GnomeSort.print(list7);
		System.out.printf("\t       ");
		RadixSort.print(list4);
		System.out.printf("\t\t\t ");
		//Print.printList10(count);
		System.out.printf("\t\t\t ");
		System.out.println();
		System.out.println();
		BubbleSort.bubbleSort(list1);
		SelectionSort.selectionSort(list6);
		InsertionSort.insertionSort(list11);
		QuickSort.quickSort4(list2);
		MergeSort.mergeSort3(list3);
		CockTailSort.cockTailSort(list5);
		GnomeSort.gnomeSort(list7);
		RadixSort.radixSort(list4);
		
		System.out.println("Bubble sorted list:\t\t Selection sorted list:\t\t  Insertion Sorted list:\t   Quick Sorted list:\t\t"
				+ "    Merge Sorted list:\t\t     Cocktail Sorted list:\t      Gnome Sorted list:\t       Radix Sorted list:\t\t\t       Counting Sorted list:");
		BubbleSort.print(list1);
		System.out.printf("\t\t ");
		SelectionSort.print(list1);
		System.out.printf("\t\t  ");
		InsertionSort.print(list1);
		System.out.printf("\t\t   ");
		QuickSort.print(list1);
		System.out.printf("\t\t    ");
		MergeSort.print(list1);
		System.out.printf("\t     ");
		CockTailSort.print(list1);
		System.out.printf("\t      ");
		GnomeSort.print(list1);
		System.out.printf("\t       ");
		RadixSort.print(list1);
		System.out.printf("\t\t\t ");
		//Print.printList10(count);
		System.out.printf("\t\t\t ");
		System.out.println();
		System.out.println();
		BubbleSort.compare();
		System.out.printf("\t ");
		SelectionSort.compare();
		System.out.printf("\t\t  ");
		InsertionSort.compare();
		System.out.printf("\t\t   ");
		QuickSort.compare();
		System.out.printf("\t\t    ");
		MergeSort.compare();
		System.out.printf("\t\t     ");
		CockTailSort.compare();
		System.out.printf("\t      ");
		GnomeSort.compare();
		System.out.printf("\t       ");
		RadixSort.runtime();
		System.out.printf("\t  ");
		System.out.println();
		BubbleSort.swap();
		System.out.printf("\t\t\t ");
		SelectionSort.swap();
		System.out.printf("\t\t\t  ");
		InsertionSort.swap();
		System.out.printf("\t\t\t   ");
		QuickSort.swap();
		System.out.printf("\t\t\t    ");
		MergeSort.swap();
		//RadixSort.swap();
		System.out.printf("\t\t\t     ");
		CockTailSort.swap();
		System.out.printf("\t\t\t      ");
		GnomeSort.swap();
		System.out.printf("\t\t\t  ");
		System.out.println();
		BubbleSort.runtime();
		System.out.printf("\t\t\t ");
		SelectionSort.runtime();
		System.out.printf("\t\t\t  ");
		InsertionSort.runtime();
		System.out.printf("\t\t\t   ");
		QuickSort.runtime();
		System.out.printf("\t\t    ");
		MergeSort.runtime();
		System.out.printf("\t\t     ");
		CockTailSort.runtime();
		System.out.printf("\t\t      ");
		GnomeSort.runtime();
		System.out.printf("\t\t\t  ");
		System.out.println();
		System.out.println();
	}

		//		RandomIntegers.randomizeList10(list21);
		//		Print.printList10(list21);
		//		GnomeSort.gnomeSort(list21);
		//		Print.printList10(list21);
		//		System.out.println();

		//		RandomIntegers.randomizeList100(list20);
		//		Print.printList100(list20);
		//		GnomeSort.gnomeSort(list20);
		//		Print.printList100(list20);
		//		System.out.println();
public static void print100List() {
		RandomIntegers.randomizeList100(list8);
//		RandomIntegers.randomizeList100(list9);
//		RandomIntegers.randomizeList100(list0);
//		RandomIntegers.randomizeList100(list12);
//		RandomIntegers.randomizeList100(list13);
//		RandomIntegers.randomizeList100(list15);
//		RandomIntegers.randomizeList100(list16);
//		RandomIntegers.randomizeList100(list14);
		System.out.println("List of 100 random numbers:\t List of 100 random numbers:\t  List of 100 random numbers:\t "
				+ "  List of 100 random numbers:\t    List of 100 random numbers:\t     List of 100 random numbers:     "
				+ " List of 100 random numbers:      List of 100 random numbers:\t\t");
		ArrayList<Integer> bublistp1 = new ArrayList<Integer>(list8.subList(0, 10));
		String deleteString1 = bublistp1.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString1 + "\t ");
		ArrayList<Integer> selclistp1 = new ArrayList<Integer>(list8.subList(0, 10));
		String deleteString2 = selclistp1.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString2 + "\t  ");
		ArrayList<Integer> inslistp1 = new ArrayList<Integer>(list8.subList(0, 10));
		String deleteString3 = inslistp1.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString3 + "\t   ");
		//System.out.println();
		ArrayList<Integer> qlistp1 = new ArrayList<Integer>(list8.subList(0, 10));
		String deleteString16 = qlistp1.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString16 + "    ");
		ArrayList<Integer> merglistp1 = new ArrayList<Integer>(list8.subList(0, 10));
		String deleteString17 = merglistp1.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString17 + "    ");
		ArrayList<Integer> cocklistp1 = new ArrayList<Integer>(list8.subList(0, 10));
		String deleteString19 = cocklistp1.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString19 + "    ");
		ArrayList<Integer> gnomlistp1 = new ArrayList<Integer>(list8.subList(0, 10));
		String deleteString20 = gnomlistp1.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString20 + "    ");
		ArrayList<Integer> radlistp1 = new ArrayList<Integer>(list8.subList(0, 10));
		String deleteString18 = radlistp1.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString18 + "\t\t ");
		System.out.println();
		
		ArrayList<Integer> bublistp2 = new ArrayList<Integer>(list8.subList(10, 20));
		String deleteString4 = bublistp2.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString4 + "\t ");
		ArrayList<Integer> selclistp2 = new ArrayList<Integer>(list8.subList(10, 20));
		String deleteString5 = selclistp2.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString5 + "\t  ");
		ArrayList<Integer> inslistp2 = new ArrayList<Integer>(list8.subList(10, 20));
		String deleteString6 = inslistp2.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString6 + "\t   ");
		//System.out.println();
		ArrayList<Integer> qlistp2 = new ArrayList<Integer>(list8.subList(10, 20));
		String deleteString21 = qlistp2.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString21 + "    ");
		ArrayList<Integer> merglistp2 = new ArrayList<Integer>(list8.subList(10, 20));
		String deleteString22 = merglistp2.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString22 + "    ");
		ArrayList<Integer> cocklistp2 = new ArrayList<Integer>(list8.subList(10, 20));
		String deleteString24 = cocklistp2.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString24 + "    ");
		ArrayList<Integer> gnomlistp2 = new ArrayList<Integer>(list8.subList(10, 20));
		String deleteString25 = gnomlistp2.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString25 + "    ");
		ArrayList<Integer> radlistp2 = new ArrayList<Integer>(list8.subList(10, 20));
		String deleteString23 = radlistp2.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString23 + "\t\t ");
		System.out.println();
		
		ArrayList<Integer> bublistp3 = new ArrayList<Integer>(list8.subList(20, 30));
		String deleteString7 = bublistp3.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString7 + "\t ");
		ArrayList<Integer> selclistp3 = new ArrayList<Integer>(list8.subList(20, 30));
		String deleteString8 = selclistp3.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString8+ "\t  ");
		ArrayList<Integer> inslistp3 = new ArrayList<Integer>(list8.subList(20, 30));
		String deleteString9 = inslistp3.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString9 + "\t   ");
		//System.out.println();
		ArrayList<Integer> qlistp3 = new ArrayList<Integer>(list8.subList(20, 30));
		String deleteString26 = qlistp3.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString26 + "    ");
		ArrayList<Integer> merglistp3 = new ArrayList<Integer>(list8.subList(20, 30));
		String deleteString27 = merglistp3.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString27 + "    ");
		ArrayList<Integer> cocklistp3 = new ArrayList<Integer>(list8.subList(20, 30));
		String deleteString29 = cocklistp3.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString29 + "    ");
		ArrayList<Integer> gnomlistp3 = new ArrayList<Integer>(list8.subList(20, 30));
		String deleteString30 = gnomlistp3.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString30 + "    ");
		ArrayList<Integer> radlistp3 = new ArrayList<Integer>(list8.subList(20, 30));
		String deleteString28 = radlistp3.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString28 + "\t\t ");
		System.out.println();
		
		ArrayList<Integer> bublistp4 = new ArrayList<Integer>(list8.subList(30, 40));
		String deleteString10 = bublistp4.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString10 + "\t ");
		ArrayList<Integer> selclistp4 = new ArrayList<Integer>(list8.subList(30, 40));
		String deleteString11 = selclistp4.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString11 + "\t  ");
		ArrayList<Integer> inslistp4 = new ArrayList<Integer>(list8.subList(30, 40));
		String deleteString12 = inslistp4.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString12 + "\t   ");
		//System.out.println();
		ArrayList<Integer> qlistp4 = new ArrayList<Integer>(list8.subList(30, 40));
		String deleteString31 = qlistp4.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString31 + "    ");
		ArrayList<Integer> merglistp4 = new ArrayList<Integer>(list8.subList(30, 40));
		String deleteString32 = merglistp4.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString32 + "    ");
		ArrayList<Integer> cocklistp4 = new ArrayList<Integer>(list8.subList(30, 40));
		String deleteString34 = cocklistp4.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString34 + "    ");
		ArrayList<Integer> gnomlistp4 = new ArrayList<Integer>(list8.subList(30, 40));
		String deleteString35 = gnomlistp4.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString35 + "    ");
		ArrayList<Integer> radlistp4 = new ArrayList<Integer>(list8.subList(30, 40));
		String deleteString33 = radlistp4.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString33 + "\t\t ");
		System.out.println();
		
		ArrayList<Integer> bublistp5 = new ArrayList<Integer>(list8.subList(40, 50));
		String deleteString13 = bublistp5.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString13 + "\t ");
		ArrayList<Integer> selclistp5 = new ArrayList<Integer>(list8.subList(40, 50));
		String deleteString14 = selclistp5.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString14 + "\t  ");
		ArrayList<Integer> inslistp5 = new ArrayList<Integer>(list8.subList(40, 50));
		String deleteString15 = inslistp5.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString15 + "\t   ");
		//System.out.println();
		ArrayList<Integer> qlistp5 = new ArrayList<Integer>(list8.subList(40, 50));
		String deleteString36 = qlistp5.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString36 + "    ");
		ArrayList<Integer> merglistp5 = new ArrayList<Integer>(list8.subList(40, 50));
		String deleteString37 = merglistp5.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString37 + "    ");
		ArrayList<Integer> cocklistp5 = new ArrayList<Integer>(list8.subList(40, 50));
		String deleteString39 = cocklistp5.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString39 + "    ");
		ArrayList<Integer> gnomlistp5 = new ArrayList<Integer>(list8.subList(40, 50));
		String deleteString40 = gnomlistp5.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString40 + "    ");
		ArrayList<Integer> radlistp5 = new ArrayList<Integer>(list8.subList(40, 50));
		String deleteString38 = radlistp5.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString38 + "\t\t ");
		System.out.println();
		
		ArrayList<Integer> bublistp6 = new ArrayList<Integer>(list8.subList(50, 60));
		String deleteString41 = bublistp6.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString41 + "\t ");
		ArrayList<Integer> selclistp6 = new ArrayList<Integer>(list8.subList(50, 60));
		String deleteString42 = selclistp6.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString42 + "\t  ");
		ArrayList<Integer> inslistp6 = new ArrayList<Integer>(list8.subList(50, 60));
		String deleteString43 = inslistp6.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString43 + "\t   ");
		//System.out.println();
		ArrayList<Integer> qlistp6 = new ArrayList<Integer>(list8.subList(50, 60));
		String deleteString44 = qlistp6.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString44 + "    ");
		ArrayList<Integer> merglistp6 = new ArrayList<Integer>(list8.subList(50, 60));
		String deleteString45 = merglistp6.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString45 + "    ");
		ArrayList<Integer> cocklistp6 = new ArrayList<Integer>(list8.subList(50, 60));
		String deleteString47 = cocklistp6.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString47 + "    ");
		ArrayList<Integer> gnomlistp6 = new ArrayList<Integer>(list8.subList(50, 60));
		String deleteString48 = gnomlistp6.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString48 + "    ");
		ArrayList<Integer> radlistp6 = new ArrayList<Integer>(list8.subList(50, 60));
		String deleteString46 = radlistp6.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString46 + "\t\t ");
		System.out.println();
		
		ArrayList<Integer> bublistp7 = new ArrayList<Integer>(list8.subList(60, 70));
		String deleteString49 = bublistp7.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString49 + "\t ");
		ArrayList<Integer> selclistp7 = new ArrayList<Integer>(list8.subList(60, 70));
		String deleteString50 = selclistp7.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString50 + "\t  ");
		ArrayList<Integer> inslistp7 = new ArrayList<Integer>(list8.subList(60, 70));
		String deleteString51 = inslistp7.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString51 + "\t   ");
		//System.out.println();
		ArrayList<Integer> qlistp7 = new ArrayList<Integer>(list8.subList(60, 70));
		String deleteString52 = qlistp7.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString52 + "    ");
		ArrayList<Integer> merglistp7 = new ArrayList<Integer>(list8.subList(60, 70));
		String deleteString53 = merglistp7.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString53 + "    ");
		ArrayList<Integer> cocklistp7 = new ArrayList<Integer>(list8.subList(60, 70));
		String deleteString55 = cocklistp7.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString55 + "    ");
		ArrayList<Integer> gnomlistp7 = new ArrayList<Integer>(list8.subList(60, 70));
		String deleteString56 = gnomlistp7.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString56 + "    ");
		ArrayList<Integer> radlistp7 = new ArrayList<Integer>(list8.subList(60, 70));
		String deleteString54 = radlistp7.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString54 + "\t\t ");
		System.out.println();
		
		ArrayList<Integer> bublistp8 = new ArrayList<Integer>(list8.subList(70, 80));
		String deleteString57 = bublistp8.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString57 + "\t ");
		ArrayList<Integer> selclistp8 = new ArrayList<Integer>(list8.subList(70, 80));
		String deleteString58 = selclistp8.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString58 + "\t  ");
		ArrayList<Integer> inslistp8 = new ArrayList<Integer>(list8.subList(70, 80));
		String deleteString59 = inslistp8.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString59 + "\t   ");
		//System.out.println();
		ArrayList<Integer> qlistp8 = new ArrayList<Integer>(list8.subList(70, 80));
		String deleteString60 = qlistp8.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString60 + "    ");
		ArrayList<Integer> merglistp8 = new ArrayList<Integer>(list8.subList(70, 80));
		String deleteString61 = merglistp8.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString61 + "    ");
		ArrayList<Integer> cocklistp8 = new ArrayList<Integer>(list8.subList(70, 80));
		String deleteString63 = cocklistp8.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString63 + "    ");
		ArrayList<Integer> gnomlistp8 = new ArrayList<Integer>(list8.subList(70, 80));
		String deleteString64 = gnomlistp8.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString64 + "    ");
		ArrayList<Integer> radlistp8 = new ArrayList<Integer>(list8.subList(70, 80));
		String deleteString62 = radlistp8.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString62 + "\t\t ");
		System.out.println();
		
		ArrayList<Integer> bublistp9 = new ArrayList<Integer>(list8.subList(80, 90));
		String deleteString65 = bublistp9.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString65 + "\t ");
		ArrayList<Integer> selclistp9 = new ArrayList<Integer>(list8.subList(80, 90));
		String deleteString66 = selclistp9.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString66 + "\t  ");
		ArrayList<Integer> inslistp9 = new ArrayList<Integer>(list8.subList(80, 90));
		String deleteString67 = inslistp9.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString67 + "\t   ");
		//System.out.println();
		ArrayList<Integer> qlistp9 = new ArrayList<Integer>(list8.subList(80, 90));
		String deleteString68 = qlistp9.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString68 + "    ");
		ArrayList<Integer> merglistp9 = new ArrayList<Integer>(list8.subList(80, 90));
		String deleteString69 = merglistp9.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString69 + "    ");
		ArrayList<Integer> cocklistp9 = new ArrayList<Integer>(list8.subList(80, 90));
		String deleteString71 = cocklistp9.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString71 + "    ");
		ArrayList<Integer> gnomlistp9 = new ArrayList<Integer>(list8.subList(80, 90));
		String deleteString72 = gnomlistp9.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString72 + "    ");
		ArrayList<Integer> radlistp9 = new ArrayList<Integer>(list8.subList(80, 90));
		String deleteString70 = radlistp9.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString70 + "\t\t ");
		System.out.println();
		
		ArrayList<Integer> bublistp10 = new ArrayList<Integer>(list8.subList(90, 100));
		String deleteString73 = bublistp10.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString73 + "\t ");
		ArrayList<Integer> selclistp10 = new ArrayList<Integer>(list8.subList(90, 100));
		String deleteString74 = selclistp10.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString74 + "\t  ");
		ArrayList<Integer> inslistp10 = new ArrayList<Integer>(list8.subList(90, 100));
		String deleteString75 = inslistp10.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString75 + "\t   ");
		//System.out.println();
		ArrayList<Integer> qlistp10 = new ArrayList<Integer>(list8.subList(90, 100));
		String deleteString76 = qlistp10.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString76 + "    ");
		ArrayList<Integer> merglistp10 = new ArrayList<Integer>(list8.subList(90, 100));
		String deleteString77 = merglistp10.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString77 + "    ");
		ArrayList<Integer> cocklistp10 = new ArrayList<Integer>(list8.subList(90, 100));
		String deleteString79 = cocklistp10.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString79 + "    ");
		ArrayList<Integer> gnomlistp10 = new ArrayList<Integer>(list8.subList(90, 100));
		String deleteString80 = gnomlistp10.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString80 + "    ");
		ArrayList<Integer> radlistp10 = new ArrayList<Integer>(list8.subList(90, 100));
		String deleteString78 = radlistp10.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString78 + "\t\t ");
		System.out.println();
		
		System.out.println();
		BubbleSort.bubbleSort(list8);
		SelectionSort.selectionSort(list8);
		InsertionSort.insertionSort(list8);
		QuickSort.quickSort4(list8);
		MergeSort.mergeSort3(list8);
		CockTailSort.cockTailSort(list8);
		GnomeSort.gnomeSort(list8);
		RadixSort.radixSort(list8);
		System.out.println("Bubble sorted list:\t\t Selection sorted list:\t\t  Insertion Sorted list:\t   Quick Sorted list:\t\t    Merge Sorted list:\t\t     Cocktail Sorted list:\t      Gnome Sorted list:\t       Radix Sorted list:\t\t\t");
		
		printSortedResults();
		
}	
		//		RandomIntegers.randomizeList10(list21);
		//		System.out.println("List of 10 random numbers:");
		//		Print.printList10(list21);
		//		System.out.println();
		//		GnomeSort.gnomeSort(list21);
		//		System.out.println("Gnome sorted list:");
		//		Print.printList10(list21);
		//		System.out.printf("\t\t ");
		//		Print.printList100(list6);
		//		System.out.printf("\t\t  ");
		//		Print.printList100(list11);
		//		System.out.println();
		//		System.out.println("------------------------------------");
		//		RandomIntegers.randomizeList100(list2);
		//		System.out.println("List of 100 random numbers:");
		//		Print.printList100(list2);
		//		System.out.println();
		//		bs.bubbleSort(list2);
		//		System.out.println("Bubble sorted list:");
		//		Print.printList100(list2);
		//		BubbleSort.stats();
		//		//
		//		System.out.println("------------------------------------");
		//		RandomIntegers.randomizeList1k(list3);
		//		System.out.println("1000 Elements");
		//		bs.bubbleSort(list3);
		//		System.out.println("Bubble sorted 1000 list stats:");
		//		BubbleSort.stats();
		//		//
		//		System.out.println("------------------------------------");
		//		RandomIntegers.randomizeList10k(list4);
		//		System.out.println("10k Elements");
		//		bs.bubbleSort(list4); 
		//		System.out.println("Bubble sorted 10k list stats:");
		//		BubbleSort.stats();
		//
		//		System.out.println("------------------------------------");
		//		RandomIntegers.randomizeList100k(list100k);
		//		System.out.println("100k Elements");
		//		BubbleSort.bubbleSort(list100k);
		//		System.out.println("Bubble sorted 100k list stats: ");
		//		BubbleSort.compare();
		//		BubbleSort.swap();
		//		BubbleSort.runtime();
		//
		//		System.out.println("____________________________________");
		//		System.out.println("SELECTION SORT:");
		//		RandomIntegers.randomizeList10(list6);
		//		System.out.println("List of 10 random numbers:");
		//		Print.printList10(list6);
		//		System.out.println();
		//		SelectionSort.selectionSort(list6);
		//		System.out.println("Selection sorted list:");
		//		Print.printList10(list6);
		//		SelectionSort.stats();
		//
		//		System.out.println("------------------------------------");
		//		RandomIntegers.randomizeList100(list7);
		//		System.out.println("List of 100 random numbers:");
		//		Print.printList100(list7);
		//		System.out.println();
		//		SelectionSort.selectionSort(list7);
		//		System.out.println("Selection sorted list:");
		//		Print.printList100(list7);
		//		SelectionSort.stats();
		//
		//		System.out.println("------------------------------------");
		//		RandomIntegers.randomizeList1k(list5);
		//		System.out.println("1000 Elements:");
		//		SelectionSort.selectionSort(list5);
		//		System.out.println("Selection sorted 1000 list stats:");
		//		SelectionSort.stats();
		//
		//		System.out.println("------------------------------------");
		//		RandomIntegers.randomizeList10k(list8);
		//		System.out.println("10k Elements:");
		//		SelectionSort.selectionSort(list8);
		//		System.out.println("Selection sorted 10k list stats:");
		//		SelectionSort.stats();
		//
		//		System.out.println("------------------------------------");
		//		RandomIntegers.randomizeList100k(list8);
		//		System.out.println("100k Elements:");
		//		SelectionSort.selectionSort(list8);
		//		System.out.println("Selection sorted 100k list stats:");
		//		SelectionSort.stats();
		//		//		//
		//		System.out.println("____________________________________");
		//		System.out.println("INSERTION SORT:");
		//		RandomIntegers.randomizeList10(list11);
		//		System.out.println("List of 10 random numbers:");
		//		Print.printList10(list11);
		//		System.out.println();
		//		InsertionSort.insertionSort(list11);
		//		System.out.println("Insertion sorted list:");
		//		Print.printList10(list11);
		//		InsertionSort.stats();
		//
		//		System.out.println("------------------------------------");
		//		RandomIntegers.randomizeList100(list12);
		//		System.out.println("List of 100 random numbers:");
		//		Print.printList100(list12);
		//		System.out.println();
		//		InsertionSort.insertionSort(list12);
		//		System.out.println("Insertion sorted list:");
		//		Print.printList100(list12);
		//		InsertionSort.stats();
		//
		//		System.out.println("------------------------------------");
		//		RandomIntegers.randomizeList1k(list9);
		//		System.out.println("1000 Elements");
		//		InsertionSort.insertionSort(list9);
		//		System.out.println("Insertion sorted 1000 list stats:");
		//		InsertionSort.stats();
		//
		//		System.out.println("------------------------------------");
		//		RandomIntegers.randomizeList10k(list0);
		//		System.out.println("10k Elements");
		//		InsertionSort.insertionSort(list0);
		//		System.out.println("Insertion sorted 10k list stats:");
		//		InsertionSort.stats();
		//
		//		System.out.println("------------------------------------");
		//		RandomIntegers.randomizeList100k(list13);
		//		System.out.println("100k Elements");
		//		InsertionSort.insertionSort(list13);
		//		System.out.println("Insertion sorted 100k list stats:");
		//		InsertionSort.stats();
		//		//
		//		System.out.println();
		//		System.out.println("QUICK SORT:");
		//		RandomIntegers.randomizeList10(list16);
		//		System.out.println("List of 10 random numbers:");
		//		Print.printList10(list16);
		//		System.out.println();
		//		QuickSort.quickSort2(list16);
		//		System.out.println("Quick sorted list:");
		//		Print.printList10(list16);
		//		System.out.println();
		//
		//		System.out.println();
		//		RandomIntegers.randomizeList100(list21);
		//		System.out.println("List of 100 random numbers:");
		//		Print.printList100(list21);
		//		System.out.println();
		//		QuickSort.quickSort2(list21);
		//		System.out.println("Quick sorted list:");
		//		Print.printList100(list21);
		//		System.out.println();
		//
		//		System.out.println();
		//		RandomIntegers.randomizeList1k(list13);
		//		System.out.println("List of 1000 random numbers:");
		//		Print.printList1k(list13);
		//		System.out.println();
		//		QuickSort.quickSort2(list13);
		//		System.out.println("Quick sorted list:");
		//		Print.printList1k(list13);
		//		System.out.println();
		//
		//		System.out.println();
		//		RandomIntegers.randomizeList10k(list14);
		//		System.out.println("List of 10k random numbers:");
		//		Print.printList10k(list14);
		//		System.out.println();
		//		QuickSort.quickSort2(list14);
		//		System.out.println("Quick sorted list:");
		//		Print.printList10k(list14);
		//		System.out.println();
		//		//
		//		System.out.println();
		//		System.out.println("MERGE SORT:");
		//		RandomIntegers.randomizeList10(list17);
		//		System.out.println("List of 10 random numbers:");
		//		Print.printList10(list17);
		//		System.out.println();
		//		MergeSort.mergeSort1(list17);
		//		System.out.println("Merge sorted list:");
		//		Print.printList10(list17);
		//		System.out.println();
		//
		//		System.out.println();
		//		RandomIntegers.randomizeList100(list18);
		//		System.out.println("List of 100 random numbers:");
		//		Print.printList100(list18);
		//		System.out.println();
		//		MergeSort.mergeSort1(list18);
		//		System.out.println("Merge sorted list:");
		//		Print.printList100(list18);
		//		System.out.println();
		//
		//		System.out.println();
		//		RandomIntegers.randomizeList1k(list15);
		//		System.out.println("List of 1000 random numbers:");
		//		Print.printList1k(list15);
		//		System.out.println();
		//		MergeSort.mergeSort1(list15);
		//		System.out.println("Merge sorted list:");
		//		Print.printList1k(list15);
		//		System.out.println();
		//
		//		System.out.println();
		//		RandomIntegers.randomizeList10k(list10k);
		//		System.out.println("List of 10k random numbers:");
		//		Print.printList10k(list10k);
		//		System.out.println();
		//		MergeSort.mergeSort1(list10k);
		//		System.out.println("Merge sorted list:");
		//		Print.printList10k(list10k);
		//		System.out.println();
		//		//		
		//		System.out.println();
		//		System.out.println("COUNTING SORT:");
		//		RandomIntegers.countAndRadix10(list22);
		//		System.out.println("List of 10 random numbers:");
		//		Print.printCountRadix10(list22);
		//		System.out.println();
		//		CountingSort.countingSort(list22, list22.length);
		//		System.out.println("Counting sorted list:");
		//		Print.printCountRadix10(list22);
		//		System.out.println();
		//
		//		System.out.println();
		//		RandomIntegers.countAndRadix100(list23);
		//		System.out.println("List of 100 random numbers:");
		//		Print.printCountRadix100(list23);
		//		System.out.println();
		//		CountingSort.countingSort(list23, list23.length);
		//		System.out.println("Counting sorted list:");
		//		Print.printCountRadix100(list23);
		//		System.out.println();
		//		//		
		//		System.out.println();
		//		System.out.println("RADIX SORT:");
		//		RandomIntegers.randomizeList10(list24);
		//		System.out.println("List of 10 random numbers:");
		//		Print.printList10(list24);
		//		System.out.println();
		//		RadixSort.radixSort(list24);
		//		System.out.println("Radix sorted list:");
		//		Print.printList10(list24);
		//		System.out.println();
		//
		//		System.out.println();
		//		RandomIntegers.randomizeList100(list25);
		//		System.out.println("List of 100 random numbers:");
		//		Print.printList100(list25);
		//		System.out.println();
		//		RadixSort.radixSort(list25);
		//		System.out.println("Radix sorted list:");
		//		Print.printList100(list25);
		//		System.out.println();
		//
		//		System.out.println();
		//		RandomIntegers.randomizeList1k(list10);
		//		System.out.println("List of 1000 random numbers:");
		//		Print.printList1k(list10);
		//		System.out.println();
		//		RadixSort.radixSort(list10);
		//		System.out.println("Radix sorted list:");
		//		Print.printList1k(list10);
		//		System.out.println();
		//
		//		System.out.println();
		//		RandomIntegers.randomizeList10k(list100);
		//		System.out.println("List of 10k random numbers:");
		//		Print.printList10k(list100);
		//		System.out.println();
		//		RadixSort.radixSort(list100);
		//		System.out.println("Radix sorted list:");
		//		Print.printList10k(list100);
		//		System.out.println();
		//		//		
		//		System.out.println();
		//		System.out.println("COCKTAIL SORT:");
		//		RandomIntegers.randomizeList10(list19);
		//		System.out.println("List of 10 random numbers:");
		//		Print.printList10(list19);
		//		System.out.println();
		//		CockTailSort.cockTailSort(list19);
		//		System.out.println("Cocktail sorted list:");
		//		Print.printList10(list19);
		//		System.out.println();
		//
		//		System.out.println();
		//		RandomIntegers.randomizeList100(list20);
		//		System.out.println("List of 100 random numbers:");
		//		Print.printList100(list20);
		//		System.out.println();
		//		CockTailSort.cockTailSort(list20);
		//		System.out.println("Cocktail sorted list:");
		//		Print.printList100(list20);
		//		System.out.println();
		//
		//		System.out.println();
		//		RandomIntegers.randomizeList1k(list1k);
		//		System.out.println("List of 1000 random numbers:");
		//		Print.printList1k(list1k);
		//		System.out.println();
		//		CockTailSort.cockTailSort(list1k);
		//		System.out.println("Cocktail sorted list:");
		//		Print.printList1k(list1k);
		//		System.out.println();
		//
		//		System.out.println();
		//		RandomIntegers.randomizeList10k(list100k);
		//		System.out.println("List of 10k random numbers:");
		//		Print.printList10k(list100k);
		//		System.out.println();
		//		CockTailSort.cockTailSort(list100k);
		//		System.out.println("Cocktail sorted list:");
		//		Print.printList10k(list100k);
		//		System.out.println();
	
	public static void printSortedResults() {
		ArrayList<Integer> bublistp1 = new ArrayList<Integer>(list8.subList(0, 10));
		String deleteString1 = bublistp1.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString1 + "\t ");
		ArrayList<Integer> selclistp1 = new ArrayList<Integer>(list8.subList(0, 10));
		String deleteString2 = selclistp1.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString2 + "\t  ");
		ArrayList<Integer> inslistp1 = new ArrayList<Integer>(list8.subList(0, 10));
		String deleteString3 = inslistp1.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString3 + "\t   ");
		//System.out.println();
		ArrayList<Integer> qlistp1 = new ArrayList<Integer>(list8.subList(0, 10));
		String deleteString16 = qlistp1.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString16 + "    ");
		ArrayList<Integer> merglistp1 = new ArrayList<Integer>(list8.subList(0, 10));
		String deleteString17 = merglistp1.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString17 + "    ");
		ArrayList<Integer> cocklistp1 = new ArrayList<Integer>(list8.subList(0, 10));
		String deleteString19 = cocklistp1.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString19 + "    ");
		ArrayList<Integer> gnomlistp1 = new ArrayList<Integer>(list8.subList(0, 10));
		String deleteString20 = gnomlistp1.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString20 + "    ");
		ArrayList<Integer> radlistp1 = new ArrayList<Integer>(list8.subList(0, 10));
		String deleteString18 = radlistp1.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString18 + "\t\t ");
		System.out.println();
		
		ArrayList<Integer> bublistp2 = new ArrayList<Integer>(list8.subList(10, 20));
		String deleteString4 = bublistp2.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString4 + "\t ");
		ArrayList<Integer> selclistp2 = new ArrayList<Integer>(list8.subList(10, 20));
		String deleteString5 = selclistp2.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString5 + "\t  ");
		ArrayList<Integer> inslistp2 = new ArrayList<Integer>(list8.subList(10, 20));
		String deleteString6 = inslistp2.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString6 + "\t   ");
		//System.out.println();
		ArrayList<Integer> qlistp2 = new ArrayList<Integer>(list8.subList(10, 20));
		String deleteString21 = qlistp2.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString21 + "    ");
		ArrayList<Integer> merglistp2 = new ArrayList<Integer>(list8.subList(10, 20));
		String deleteString22 = merglistp2.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString22 + "    ");
		ArrayList<Integer> cocklistp2 = new ArrayList<Integer>(list8.subList(10, 20));
		String deleteString24 = cocklistp2.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString24 + "    ");
		ArrayList<Integer> gnomlistp2 = new ArrayList<Integer>(list8.subList(10, 20));
		String deleteString25 = gnomlistp2.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString25 + "    ");
		ArrayList<Integer> radlistp2 = new ArrayList<Integer>(list8.subList(10, 20));
		String deleteString23 = radlistp2.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString23 + "\t\t ");
		System.out.println();
		
		ArrayList<Integer> bublistp3 = new ArrayList<Integer>(list8.subList(20, 30));
		String deleteString7 = bublistp3.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString7 + "\t ");
		ArrayList<Integer> selclistp3 = new ArrayList<Integer>(list8.subList(20, 30));
		String deleteString8 = selclistp3.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString8+ "\t  ");
		ArrayList<Integer> inslistp3 = new ArrayList<Integer>(list8.subList(20, 30));
		String deleteString9 = inslistp3.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString9 + "\t   ");
		//System.out.println();
		ArrayList<Integer> qlistp3 = new ArrayList<Integer>(list8.subList(20, 30));
		String deleteString26 = qlistp3.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString26 + "    ");
		ArrayList<Integer> merglistp3 = new ArrayList<Integer>(list8.subList(20, 30));
		String deleteString27 = merglistp3.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString27 + "    ");
		ArrayList<Integer> cocklistp3 = new ArrayList<Integer>(list8.subList(20, 30));
		String deleteString29 = cocklistp3.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString29 + "    ");
		ArrayList<Integer> gnomlistp3 = new ArrayList<Integer>(list8.subList(20, 30));
		String deleteString30 = gnomlistp3.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString30 + "    ");
		ArrayList<Integer> radlistp3 = new ArrayList<Integer>(list8.subList(20, 30));
		String deleteString28 = radlistp3.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString28 + "\t\t ");
		System.out.println();
		
		ArrayList<Integer> bublistp4 = new ArrayList<Integer>(list8.subList(30, 40));
		String deleteString10 = bublistp4.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString10 + "\t ");
		ArrayList<Integer> selclistp4 = new ArrayList<Integer>(list8.subList(30, 40));
		String deleteString11 = selclistp4.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString11 + "\t  ");
		ArrayList<Integer> inslistp4 = new ArrayList<Integer>(list8.subList(30, 40));
		String deleteString12 = inslistp4.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString12 + "\t   ");
		//System.out.println();
		ArrayList<Integer> qlistp4 = new ArrayList<Integer>(list8.subList(30, 40));
		String deleteString31 = qlistp4.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString31 + "    ");
		ArrayList<Integer> merglistp4 = new ArrayList<Integer>(list8.subList(30, 40));
		String deleteString32 = merglistp4.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString32 + "    ");
		ArrayList<Integer> cocklistp4 = new ArrayList<Integer>(list8.subList(30, 40));
		String deleteString34 = cocklistp4.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString34 + "    ");
		ArrayList<Integer> gnomlistp4 = new ArrayList<Integer>(list8.subList(30, 40));
		String deleteString35 = gnomlistp4.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString35 + "    ");
		ArrayList<Integer> radlistp4 = new ArrayList<Integer>(list8.subList(30, 40));
		String deleteString33 = radlistp4.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString33 + "\t\t ");
		System.out.println();
		
		ArrayList<Integer> bublistp5 = new ArrayList<Integer>(list8.subList(40, 50));
		String deleteString13 = bublistp5.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString13 + "\t ");
		ArrayList<Integer> selclistp5 = new ArrayList<Integer>(list8.subList(40, 50));
		String deleteString14 = selclistp5.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString14 + "\t  ");
		ArrayList<Integer> inslistp5 = new ArrayList<Integer>(list8.subList(40, 50));
		String deleteString15 = inslistp5.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString15 + "\t   ");
		//System.out.println();
		ArrayList<Integer> qlistp5 = new ArrayList<Integer>(list8.subList(40, 50));
		String deleteString36 = qlistp5.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString36 + "    ");
		ArrayList<Integer> merglistp5 = new ArrayList<Integer>(list8.subList(40, 50));
		String deleteString37 = merglistp5.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString37 + "    ");
		ArrayList<Integer> cocklistp5 = new ArrayList<Integer>(list8.subList(40, 50));
		String deleteString39 = cocklistp5.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString39 + "    ");
		ArrayList<Integer> gnomlistp5 = new ArrayList<Integer>(list8.subList(40, 50));
		String deleteString40 = gnomlistp5.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString40 + "    ");
		ArrayList<Integer> radlistp5 = new ArrayList<Integer>(list8.subList(40, 50));
		String deleteString38 = radlistp5.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString38 + "\t\t ");
		System.out.println();
		
		ArrayList<Integer> bublistp6 = new ArrayList<Integer>(list8.subList(50, 60));
		String deleteString41 = bublistp6.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString41 + "\t ");
		ArrayList<Integer> selclistp6 = new ArrayList<Integer>(list8.subList(50, 60));
		String deleteString42 = selclistp6.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString42 + "\t  ");
		ArrayList<Integer> inslistp6 = new ArrayList<Integer>(list8.subList(50, 60));
		String deleteString43 = inslistp6.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString43 + "\t   ");
		//System.out.println();
		ArrayList<Integer> qlistp6 = new ArrayList<Integer>(list8.subList(50, 60));
		String deleteString44 = qlistp6.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString44 + "    ");
		ArrayList<Integer> merglistp6 = new ArrayList<Integer>(list8.subList(50, 60));
		String deleteString45 = merglistp6.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString45 + "    ");
		ArrayList<Integer> cocklistp6 = new ArrayList<Integer>(list8.subList(50, 60));
		String deleteString47 = cocklistp6.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString47 + "    ");
		ArrayList<Integer> gnomlistp6 = new ArrayList<Integer>(list8.subList(50, 60));
		String deleteString48 = gnomlistp6.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString48 + "    ");
		ArrayList<Integer> radlistp6 = new ArrayList<Integer>(list8.subList(50, 60));
		String deleteString46 = radlistp6.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString46 + "\t\t ");
		System.out.println();
		
		ArrayList<Integer> bublistp7 = new ArrayList<Integer>(list8.subList(60, 70));
		String deleteString49 = bublistp7.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString49 + "\t ");
		ArrayList<Integer> selclistp7 = new ArrayList<Integer>(list8.subList(60, 70));
		String deleteString50 = selclistp7.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString50 + "\t  ");
		ArrayList<Integer> inslistp7 = new ArrayList<Integer>(list8.subList(60, 70));
		String deleteString51 = inslistp7.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString51 + "\t   ");
		//System.out.println();
		ArrayList<Integer> qlistp7 = new ArrayList<Integer>(list8.subList(60, 70));
		String deleteString52 = qlistp7.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString52 + "    ");
		ArrayList<Integer> merglistp7 = new ArrayList<Integer>(list8.subList(60, 70));
		String deleteString53 = merglistp7.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString53 + "    ");
		ArrayList<Integer> cocklistp7 = new ArrayList<Integer>(list8.subList(60, 70));
		String deleteString55 = cocklistp7.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString55 + "    ");
		ArrayList<Integer> gnomlistp7 = new ArrayList<Integer>(list8.subList(60, 70));
		String deleteString56 = gnomlistp7.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString56 + "    ");
		ArrayList<Integer> radlistp7 = new ArrayList<Integer>(list8.subList(60, 70));
		String deleteString54 = radlistp7.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString54 + "\t\t ");
		System.out.println();
		
		ArrayList<Integer> bublistp8 = new ArrayList<Integer>(list8.subList(70, 80));
		String deleteString57 = bublistp8.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString57 + "\t ");
		ArrayList<Integer> selclistp8 = new ArrayList<Integer>(list8.subList(70, 80));
		String deleteString58 = selclistp8.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString58 + "\t  ");
		ArrayList<Integer> inslistp8 = new ArrayList<Integer>(list8.subList(70, 80));
		String deleteString59 = inslistp8.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString59 + "\t   ");
		//System.out.println();
		ArrayList<Integer> qlistp8 = new ArrayList<Integer>(list8.subList(70, 80));
		String deleteString60 = qlistp8.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString60 + "    ");
		ArrayList<Integer> merglistp8 = new ArrayList<Integer>(list8.subList(70, 80));
		String deleteString61 = merglistp8.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString61 + "    ");
		ArrayList<Integer> cocklistp8 = new ArrayList<Integer>(list8.subList(70, 80));
		String deleteString63 = cocklistp8.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString63 + "    ");
		ArrayList<Integer> gnomlistp8 = new ArrayList<Integer>(list8.subList(70, 80));
		String deleteString64 = gnomlistp8.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString64 + "    ");
		ArrayList<Integer> radlistp8 = new ArrayList<Integer>(list8.subList(70, 80));
		String deleteString62 = radlistp8.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString62 + "\t\t ");
		System.out.println();
		
		ArrayList<Integer> bublistp9 = new ArrayList<Integer>(list8.subList(80, 90));
		String deleteString65 = bublistp9.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString65 + "\t ");
		ArrayList<Integer> selclistp9 = new ArrayList<Integer>(list8.subList(80, 90));
		String deleteString66 = selclistp9.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString66 + "\t  ");
		ArrayList<Integer> inslistp9 = new ArrayList<Integer>(list8.subList(80, 90));
		String deleteString67 = inslistp9.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString67 + "\t   ");
		//System.out.println();
		ArrayList<Integer> qlistp9 = new ArrayList<Integer>(list8.subList(80, 90));
		String deleteString68 = qlistp9.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString68 + "    ");
		ArrayList<Integer> merglistp9 = new ArrayList<Integer>(list8.subList(80, 90));
		String deleteString69 = merglistp9.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString69 + "    ");
		ArrayList<Integer> cocklistp9 = new ArrayList<Integer>(list8.subList(80, 90));
		String deleteString71 = cocklistp9.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString71 + "    ");
		ArrayList<Integer> gnomlistp9 = new ArrayList<Integer>(list8.subList(80, 90));
		String deleteString72 = gnomlistp9.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString72 + "    ");
		ArrayList<Integer> radlistp9 = new ArrayList<Integer>(list8.subList(80, 90));
		String deleteString70 = radlistp9.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString70 + "\t\t ");
		System.out.println();
		
		ArrayList<Integer> bublistp10 = new ArrayList<Integer>(list8.subList(90, 100));
		String deleteString73 = bublistp10.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString73 + "\t ");
		ArrayList<Integer> selclistp10 = new ArrayList<Integer>(list8.subList(90, 100));
		String deleteString74 = selclistp10.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString74 + "\t  ");
		ArrayList<Integer> inslistp10 = new ArrayList<Integer>(list8.subList(90, 100));
		String deleteString75 = inslistp10.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString75 + "\t   ");
		//System.out.println();
		ArrayList<Integer> qlistp10 = new ArrayList<Integer>(list8.subList(90, 100));
		String deleteString76 = qlistp10.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString76 + "    ");
		ArrayList<Integer> merglistp10 = new ArrayList<Integer>(list8.subList(90, 100));
		String deleteString77 = merglistp10.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString77 + "    ");
		ArrayList<Integer> cocklistp10 = new ArrayList<Integer>(list8.subList(90, 100));
		String deleteString79 = cocklistp10.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString79 + "    ");
		ArrayList<Integer> gnomlistp10 = new ArrayList<Integer>(list8.subList(90, 100));
		String deleteString80 = gnomlistp10.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString80 + "    ");
		ArrayList<Integer> radlistp10 = new ArrayList<Integer>(list8.subList(90, 100));
		String deleteString78 = radlistp10.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.print(deleteString78 + "\t\t ");
		System.out.println();
		System.out.println();
		BubbleSort.compare();
		System.out.printf(" ");
		SelectionSort.compare();
		System.out.printf("\t\t  ");
		InsertionSort.compare();
		System.out.printf("\t\t   ");
		QuickSort.compare();
		System.out.printf("\t\t    ");
		MergeSort.compare();
		System.out.printf("\t\t     ");
		//RadixSort.compare();
		CockTailSort.compare();
		System.out.printf("\t      ");
		GnomeSort.compare();
		System.out.printf("\t       ");
		RadixSort.runtime();
		System.out.printf("\t\t\t\t ");
		System.out.println();
		BubbleSort.swap();
		System.out.printf("\t\t\t ");
		SelectionSort.swap();
		System.out.printf("\t\t\t  ");
		InsertionSort.swap();
		System.out.printf("\t\t\t   ");
		QuickSort.swap();
		System.out.printf("\t\t\t    ");
		MergeSort.swap();
		System.out.printf(" ");
		//RadixSort.swap();
		System.out.printf("\t\t\t     ");
		CockTailSort.swap(); 
		System.out.printf("\t\t      ");
		GnomeSort.swap();
		System.out.printf("\t\t\t  ");
		System.out.println();
		BubbleSort.runtime(); 
		System.out.printf("\t\t\t ");
		SelectionSort.runtime();
		System.out.printf("\t\t\t  ");
		InsertionSort.runtime();
		System.out.printf("\t\t\t   ");
		QuickSort.runtime();
		System.out.printf("\t\t    ");
		MergeSort.runtime();
		System.out.printf("\t     ");
		
		System.out.printf("\t     ");
		CockTailSort.runtime();
		System.out.printf("\t\t      ");
		GnomeSort.runtime();
		System.out.printf("\t\t\t  ");
		System.out.println();
		System.out.println();
	}
	public static void print1kList() {
		RandomIntegers.randomizeList1k(list17);
		RandomIntegers.randomizeList1k(list18);
		RandomIntegers.randomizeList1k(list19);
		RandomIntegers.randomizeList1k(list20);
		RandomIntegers.randomizeList1k(list21);
		RandomIntegers.randomizeList1k(list23);
		RandomIntegers.randomizeList1k(list24); 
		RandomIntegers.randomizeList1k(list22);
		System.out.println();
		System.out.print("1000 Elements\t\t\t 1000 Elements\t\t\t  1000 Elements\t\t\t   1000 Elements\t\t    1000 Elements\t\t     1000 Elements\t\t      1000 Elements\t\t       1000 Elements\t\t\t");
		BubbleSort.bubbleSort(list17);
		SelectionSort.selectionSort(list18);
		InsertionSort.insertionSort(list19);
		QuickSort.quickSort4(list20);
		MergeSort.mergeSort3(list21);
		CockTailSort.cockTailSort(list23);
		GnomeSort.gnomeSort(list24);
		RadixSort.radixSort(list22);
		System.out.println();
		System.out.println("Bubble sorted 1k stats:\t\t Selection sorted 1k stats:\t  Insertion sorted 1k stats:\t   Quick sorted 1k stats:\t    Merge sorted 1k stats:\t     Cocktail sorted 1k stats:\t      Gnome sorted 1k stats:\t       Radix sort 1k stats:\t\t\t");

		BubbleSort.compare();
		System.out.printf(" ");
		SelectionSort.compare();
		System.out.printf("\t\t  ");
		InsertionSort.compare();
		System.out.printf("\t\t   ");
		QuickSort.compare();
		System.out.printf("\t\t    ");
		MergeSort.compare();
		//System.out.printf("\t\t ");
		//RadixSort.compare();
		System.out.printf("\t\t     ");
		CockTailSort.compare();
		System.out.printf("      ");
		GnomeSort.compare();
		System.out.printf("       ");
		RadixSort.runtime();
		System.out.println();
		BubbleSort.swap();
		System.out.printf("\t\t\t ");
		SelectionSort.swap();
		System.out.printf("\t\t\t  ");
		InsertionSort.swap();
		System.out.printf("\t\t\t   ");
		QuickSort.swap();
		System.out.printf("\t\t\t    ");
		MergeSort.swap();
		System.out.printf("\t ");
		//RadixSort.swap();
		System.out.printf("\t\t     ");
		CockTailSort.swap();
		System.out.printf("\t\t      ");
		GnomeSort.swap();
		System.out.printf("\t\t\t  ");
		System.out.println();
		BubbleSort.runtime();
		System.out.printf("\t\t\t ");
		SelectionSort.runtime();
		System.out.printf("\t\t\t  ");
		InsertionSort.runtime();
		System.out.printf("\t\t   ");
		QuickSort.runtime();
		System.out.printf("\t\t    ");
		MergeSort.runtime();
		System.out.printf("\t     ");
		
		System.out.printf("\t     ");
		CockTailSort.runtime();
		System.out.printf("\t\t      ");
		GnomeSort.runtime();
		System.out.printf("\t\t\t  ");
		System.out.println();
	}
	public static void print10kList() {
		RandomIntegers.randomizeList10k(list25);
		RandomIntegers.randomizeList10k(list26);
		RandomIntegers.randomizeList10k(list27);
		RandomIntegers.randomizeList10k(list28);
		RandomIntegers.randomizeList10k(list29);
		RandomIntegers.randomizeList10k(list30);
		RandomIntegers.randomizeList10k(list31);
		RandomIntegers.randomizeList10k(list32); 
		System.out.println();
		System.out.println();
		System.out.print("10k Elements\t\t\t 10k Elements\t\t\t  10k Elements\t\t\t   10k Elements\t\t\t    10k Elements\t\t     10k Elements\t\t      10k Elements\t\t       10k Elements\t\t\t");
		BubbleSort.bubbleSort(list25);
		SelectionSort.selectionSort(list26);
		InsertionSort.insertionSort(list27);
		QuickSort.quickSort4(list28);
		MergeSort.mergeSort3(list29);
		RadixSort.radixSort(list30);
		CockTailSort.cockTailSort(list31);
		GnomeSort.gnomeSort(list32);
		System.out.println();
		System.out.println("Bubble sorted 10k stats:\t Selection sorted 10k stats:\t  Insertion sorted 10k stats:\t   Quick sorted 10k stats:\t    Merge sorted 10k stats:\t     Cocktail sorted 10k stats:\t      Gnome sorted 10k stats:\t       Radix sort 10k stats:\t\t\t");
		
		BubbleSort.compare();
		System.out.printf(" ");
		SelectionSort.compare();
		System.out.printf("\t\t  ");
		InsertionSort.compare();
		System.out.printf("\t\t   ");
		QuickSort.compare();
		System.out.printf("\t\t    ");
		MergeSort.compare();
		System.out.printf("\t             ");
	//	RadixSort.compare();
		CockTailSort.compare();
		System.out.printf("      ");
		GnomeSort.compare();
		System.out.printf("       ");
		RadixSort.runtime();
		System.out.println();
		BubbleSort.swap();
		System.out.printf("\t\t\t ");
		SelectionSort.swap();
		System.out.printf("\t\t\t  ");
		InsertionSort.swap();
		System.out.printf("\t\t   ");
		QuickSort.swap();
		System.out.printf("\t\t\t    ");
		MergeSort.swap();
		System.out.printf("\t     ");
		//RadixSort.swap();
		System.out.printf("\t\t     ");
		CockTailSort.swap();
		System.out.printf("\t\t      ");
		GnomeSort.swap();
		System.out.printf("\t\t\t  ");
		System.out.println();
		BubbleSort.runtime();
		System.out.printf("\t\t\t ");
		SelectionSort.runtime();
		System.out.printf("\t\t  ");
		InsertionSort.runtime();
		System.out.printf("\t\t   ");
		QuickSort.runtime();
		System.out.printf("\t\t    ");
		MergeSort.runtime();
		System.out.printf("\t ");
		
		System.out.printf("\t     ");
		CockTailSort.runtime();
		System.out.printf("\t\t      ");
		GnomeSort.runtime();
		System.out.printf("\t\t\t  ");
		System.out.println();
		System.out.println();
	}
	public static void print100kList() {
		RandomIntegers.randomizeList100k(list33);
		RandomIntegers.randomizeList100k(list34);
		RandomIntegers.randomizeList100k(list35);
		RandomIntegers.randomizeList100k(list36);
		RandomIntegers.randomizeList100k(list37);
		RandomIntegers.randomizeList100k(list38);
		RandomIntegers.randomizeList100k(list39);
		RandomIntegers.randomizeList100k(list40); 
		System.out.println();
		System.out.println();
		System.out.print("100k Elements\t\t\t 100k Elements\t\t\t  100k Elements\t\t\t   100k Elements\t\t    100k Elements\t\t     100k Elements\t\t      100k Elements\t\t       100k Elements\t\t\t");
		System.out.println();
		System.out.println("Bubble sorted 100k stats:\t Selection sorted 100k stats:\t  Insertion sorted 100k stats:\t   Quick sorted 100k stats:\t    Merge sorted 100k stats:\t     Cocktail sorted 100k stats:      Gnome sorted 100k stats:\t       Radix sort 100k stats:\t\t");
		BubbleSort.bubbleSort(list33);
		BubbleSort.compare();
		System.out.printf(" ");
		SelectionSort.selectionSort(list34);
		SelectionSort.compare();
		System.out.printf("\t  ");
		InsertionSort.insertionSort(list35);
		InsertionSort.compare();
		System.out.printf("\t   ");
		QuickSort.quickSort4(list36);
		QuickSort.compare();
		System.out.printf("\t\t    ");
		MergeSort.mergeSort3(list37);
		MergeSort.compare();
		System.out.printf("\t\t     ");
		
		
		CockTailSort.cockTailSort(list39);
		CockTailSort.compare();
		System.out.printf("      ");
		GnomeSort.gnomeSort(list40);
		GnomeSort.compare();
		System.out.printf("       ");
		RadixSort.radixSort(list38);
		//RadixSort.compare();
		RadixSort.runtime();
		System.out.println();
		BubbleSort.swap();
		System.out.printf("\t\t ");
		SelectionSort.swap();
		System.out.printf("\t\t          ");
		InsertionSort.swap();
		System.out.printf("\t\t   ");
		QuickSort.swap();
		System.out.printf("\t\t    ");
		MergeSort.swap();
		System.out.printf("\t ");
		//RadixSort.swap();
		System.out.printf("\t     ");
		CockTailSort.swap();
		System.out.printf("\t\t      ");
		GnomeSort.swap();
		System.out.printf("\t\t\t  ");
		System.out.println();
		BubbleSort.runtime();
		System.out.printf("\t\t ");
		SelectionSort.runtime();
		System.out.printf("\t          ");
		InsertionSort.runtime();
		System.out.printf("\t\t   ");
		QuickSort.runtime();
		System.out.printf("\t\t    ");
		MergeSort.runtime();
		System.out.printf("\t ");
		
		System.out.printf("\t     ");
		CockTailSort.runtime();
		System.out.printf("\t\t      ");
		GnomeSort.runtime();
		System.out.printf("\t\t\t  ");
		System.out.println();
		System.out.println();
	}
}
*/
















































//RandomIntegers.randomizeList10(list21);
//		System.out.println("List of 10 random numbers:");
//		Print.printList10(list21);
//		System.out.println();
//		GnomeSort.gnomeSort(list21);
//		System.out.println("Gnome sorted list:");
//		Print.printList10(list21);
//		System.out.printf("\t\t ");
//		Print.printList100(list6);
//		System.out.printf("\t\t  ");
//		Print.printList100(list11);
//		System.out.println();
//		System.out.println("------------------------------------");
//		RandomIntegers.randomizeList100(list2);
//		System.out.println("List of 100 random numbers:");
//		Print.printList100(list2);
//		System.out.println();
//		bs.bubbleSort(list2);
//		System.out.println("Bubble sorted list:");
//		Print.printList100(list2);
//		BubbleSort.stats();
//		//
//		System.out.println("------------------------------------");
//		RandomIntegers.randomizeList1k(list3);
//		System.out.println("1000 Elements");
//		bs.bubbleSort(list3);
//		System.out.println("Bubble sorted 1000 list stats:");
//		BubbleSort.stats();
//		//
//		System.out.println("------------------------------------");
//		RandomIntegers.randomizeList10k(list4);
//		System.out.println("10k Elements");
//		bs.bubbleSort(list4); 
//		System.out.println("Bubble sorted 10k list stats:");
//		BubbleSort.stats();
//
//		System.out.println("------------------------------------");
//		RandomIntegers.randomizeList100k(list100k);
//		System.out.println("100k Elements");
//		BubbleSort.bubbleSort(list100k);
//		System.out.println("Bubble sorted 100k list stats: ");
//		BubbleSort.compare();
//		BubbleSort.swap();
//		BubbleSort.runtime();
//
//		System.out.println("____________________________________");
//		System.out.println("SELECTION SORT:");
//		RandomIntegers.randomizeList10(list6);
//		System.out.println("List of 10 random numbers:");
//		Print.printList10(list6);
//		System.out.println();
//		SelectionSort.selectionSort(list6);
//		System.out.println("Selection sorted list:");
//		Print.printList10(list6);
//		SelectionSort.stats();
//
//		System.out.println("------------------------------------");
//		RandomIntegers.randomizeList100(list7);
//		System.out.println("List of 100 random numbers:");
//		Print.printList100(list7);
//		System.out.println();
//		SelectionSort.selectionSort(list7);
//		System.out.println("Selection sorted list:");
//		Print.printList100(list7);
//		SelectionSort.stats();
//
//		System.out.println("------------------------------------");
//		RandomIntegers.randomizeList1k(list5);
//		System.out.println("1000 Elements:");
//		SelectionSort.selectionSort(list5);
//		System.out.println("Selection sorted 1000 list stats:");
//		SelectionSort.stats();
//
//		System.out.println("------------------------------------");
//		RandomIntegers.randomizeList10k(list8);
//		System.out.println("10k Elements:");
//		SelectionSort.selectionSort(list8);
//		System.out.println("Selection sorted 10k list stats:");
//		SelectionSort.stats();
//
//		System.out.println("------------------------------------");
//		RandomIntegers.randomizeList100k(list8);
//		System.out.println("100k Elements:");
//		SelectionSort.selectionSort(list8);
//		System.out.println("Selection sorted 100k list stats:");
//		SelectionSort.stats();
//		//		//
//		System.out.println("____________________________________");
//		System.out.println("INSERTION SORT:");
//		RandomIntegers.randomizeList10(list11);
//		System.out.println("List of 10 random numbers:");
//		Print.printList10(list11);
//		System.out.println();
//		InsertionSort.insertionSort(list11);
//		System.out.println("Insertion sorted list:");
//		Print.printList10(list11);
//		InsertionSort.stats();
//
//		System.out.println("------------------------------------");
//		RandomIntegers.randomizeList100(list12);
//		System.out.println("List of 100 random numbers:");
//		Print.printList100(list12);
//		System.out.println();
//		InsertionSort.insertionSort(list12);
//		System.out.println("Insertion sorted list:");
//		Print.printList100(list12);
//		InsertionSort.stats();
//
//		System.out.println("------------------------------------");
//		RandomIntegers.randomizeList1k(list9);
//		System.out.println("1000 Elements");
//		InsertionSort.insertionSort(list9);
//		System.out.println("Insertion sorted 1000 list stats:");
//		InsertionSort.stats();
//
//		System.out.println("------------------------------------");
//		RandomIntegers.randomizeList10k(list0);
//		System.out.println("10k Elements");
//		InsertionSort.insertionSort(list0);
//		System.out.println("Insertion sorted 10k list stats:");
//		InsertionSort.stats();
//
//		System.out.println("------------------------------------");
//		RandomIntegers.randomizeList100k(list13);
//		System.out.println("100k Elements");
//		InsertionSort.insertionSort(list13);
//		System.out.println("Insertion sorted 100k list stats:");
//		InsertionSort.stats();
//		//
//		System.out.println();
//		System.out.println("QUICK SORT:");
//		RandomIntegers.randomizeList10(list16);
//		System.out.println("List of 10 random numbers:");
//		Print.printList10(list16);
//		System.out.println();
//		QuickSort.quickSort2(list16);
//		System.out.println("Quick sorted list:");
//		Print.printList10(list16);
//		System.out.println();
//
//		System.out.println();
//		RandomIntegers.randomizeList100(list21);
//		System.out.println("List of 100 random numbers:");
//		Print.printList100(list21);
//		System.out.println();
//		QuickSort.quickSort2(list21);
//		System.out.println("Quick sorted list:");
//		Print.printList100(list21);
//		System.out.println();
//
//		System.out.println();
//		RandomIntegers.randomizeList1k(list13);
//		System.out.println("List of 1000 random numbers:");
//		Print.printList1k(list13);
//		System.out.println();
//		QuickSort.quickSort2(list13);
//		System.out.println("Quick sorted list:");
//		Print.printList1k(list13);
//		System.out.println();
//
//		System.out.println();
//		RandomIntegers.randomizeList10k(list14);
//		System.out.println("List of 10k random numbers:");
//		Print.printList10k(list14);
//		System.out.println();
//		QuickSort.quickSort2(list14);
//		System.out.println("Quick sorted list:");
//		Print.printList10k(list14);
//		System.out.println();
//		//
//		System.out.println();
//		System.out.println("MERGE SORT:");
//		RandomIntegers.randomizeList10(list17);
//		System.out.println("List of 10 random numbers:");
//		Print.printList10(list17);
//		System.out.println();
//		MergeSort.mergeSort1(list17);
//		System.out.println("Merge sorted list:");
//		Print.printList10(list17);
//		System.out.println();
//
//		System.out.println();
//		RandomIntegers.randomizeList100(list18);
//		System.out.println("List of 100 random numbers:");
//		Print.printList100(list18);
//		System.out.println();
//		MergeSort.mergeSort1(list18);
//		System.out.println("Merge sorted list:");
//		Print.printList100(list18);
//		System.out.println();
//
//		System.out.println();
//		RandomIntegers.randomizeList1k(list15);
//		System.out.println("List of 1000 random numbers:");
//		Print.printList1k(list15);
//		System.out.println();
//		MergeSort.mergeSort1(list15);
//		System.out.println("Merge sorted list:");
//		Print.printList1k(list15);
//		System.out.println();
//
//		System.out.println();
//		RandomIntegers.randomizeList10k(list10k);
//		System.out.println("List of 10k random numbers:");
//		Print.printList10k(list10k);
//		System.out.println();
//		MergeSort.mergeSort1(list10k);
//		System.out.println("Merge sorted list:");
//		Print.printList10k(list10k);
//		System.out.println();
//		//		
//		System.out.println();
//		System.out.println("COUNTING SORT:");
//		RandomIntegers.countAndRadix10(list22);
//		System.out.println("List of 10 random numbers:");
//		Print.printCountRadix10(list22);
//		System.out.println();
//		CountingSort.countingSort(list22, list22.length);
//		System.out.println("Counting sorted list:");
//		Print.printCountRadix10(list22);
//		System.out.println();
//
//		System.out.println();
//		RandomIntegers.countAndRadix100(list23);
//		System.out.println("List of 100 random numbers:");
//		Print.printCountRadix100(list23);
//		System.out.println();
//		CountingSort.countingSort(list23, list23.length);
//		System.out.println("Counting sorted list:");
//		Print.printCountRadix100(list23);
//		System.out.println();
//		//		
//		System.out.println();
//		System.out.println("RADIX SORT:");
//		RandomIntegers.randomizeList10(list24);
//		System.out.println("List of 10 random numbers:");
//		Print.printList10(list24);
//		System.out.println();
//		RadixSort.radixSort(list24);
//		System.out.println("Radix sorted list:");
//		Print.printList10(list24);
//		System.out.println();
//
//		System.out.println();
//		RandomIntegers.randomizeList100(list25);
//		System.out.println("List of 100 random numbers:");
//		Print.printList100(list25);
//		System.out.println();
//		RadixSort.radixSort(list25);
//		System.out.println("Radix sorted list:");
//		Print.printList100(list25);
//		System.out.println();
//
//		System.out.println();
//		RandomIntegers.randomizeList1k(list10);
//		System.out.println("List of 1000 random numbers:");
//		Print.printList1k(list10);
//		System.out.println();
//		RadixSort.radixSort(list10);
//		System.out.println("Radix sorted list:");
//		Print.printList1k(list10);
//		System.out.println();
//
//		System.out.println();
//		RandomIntegers.randomizeList10k(list100);
//		System.out.println("List of 10k random numbers:");
//		Print.printList10k(list100);
//		System.out.println();
//		RadixSort.radixSort(list100);
//		System.out.println("Radix sorted list:");
//		Print.printList10k(list100);
//		System.out.println();
//		//		
//		System.out.println();
//		System.out.println("COCKTAIL SORT:");
//		RandomIntegers.randomizeList10(list19);
//		System.out.println("List of 10 random numbers:");
//		Print.printList10(list19);
//		System.out.println();
//		CockTailSort.cockTailSort(list19);
//		System.out.println("Cocktail sorted list:");
//		Print.printList10(list19);
//		System.out.println();
//
//		System.out.println();
//		RandomIntegers.randomizeList100(list20);
//		System.out.println("List of 100 random numbers:");
//		Print.printList100(list20);
//		System.out.println();
//		CockTailSort.cockTailSort(list20);
//		System.out.println("Cocktail sorted list:");
//		Print.printList100(list20);
//		System.out.println();
//
//		System.out.println();
//		RandomIntegers.randomizeList1k(list1k);
//		System.out.println("List of 1000 random numbers:");
//		Print.printList1k(list1k);
//		System.out.println();
//		CockTailSort.cockTailSort(list1k);
//		System.out.println("Cocktail sorted list:");
//		Print.printList1k(list1k);
//		System.out.println();
//
//		System.out.println();
//		RandomIntegers.randomizeList10k(list100k);
//		System.out.println("List of 10k random numbers:");
//		Print.printList10k(list100k);
//		System.out.println();
//		CockTailSort.cockTailSort(list100k);
//		System.out.println("Cocktail sorted list:");
//		Print.printList10k(list100k);
//		System.out.println();

//	public static void printSortedResults() {
//		ArrayList<Integer> bublistp1 = new ArrayList<Integer>(bubble100.subList(0, 10));
//		String deleteString1 = bublistp1.toString().replace(",", "").replace("[", "").replace("]", "").trim();
//		System.out.print(deleteString1 + "\t ");
//		ArrayList<Integer> selclistp1 = new ArrayList<Integer>(selection100.subList(0, 10));
//		String deleteString2 = selclistp1.toString().replace(",", "").replace("[", "").replace("]", "").trim();
//		System.out.print(deleteString2 + "\t  ");
//		ArrayList<Integer> inslistp1 = new ArrayList<Integer>(insertion100.subList(0, 10));
//		String deleteString3 = inslistp1.toString().replace(",", "").replace("[", "").replace("]", "").trim();
//		System.out.print(deleteString3 + "\t   ");
//		//System.out.println();
//		ArrayList<Integer> qlistp1 = new ArrayList<Integer>(quick100.subList(0, 10));
//		String deleteString16 = qlistp1.toString().replace(",", "").replace("[", "").replace("]", "").trim();
//		System.out.print(deleteString16 + "    ");
//		ArrayList<Integer> merglistp1 = new ArrayList<Integer>(merge100.subList(0, 10));
//		String deleteString17 = merglistp1.toString().replace(",", "").replace("[", "").replace("]", "").trim();
//		System.out.print(deleteString17 + "    ");
//		ArrayList<Integer> cocklistp1 = new ArrayList<Integer>(cocktail100.subList(0, 10));
//		String deleteString19 = cocklistp1.toString().replace(",", "").replace("[", "").replace("]", "").trim();
//		System.out.print(deleteString19 + "    ");
//		ArrayList<Integer> gnomlistp1 = new ArrayList<Integer>(gnome100.subList(0, 10));
//		String deleteString20 = gnomlistp1.toString().replace(",", "").replace("[", "").replace("]", "").trim();
//		System.out.print(deleteString20 + "    ");
//		ArrayList<Integer> radlistp1 = new ArrayList<Integer>(radix100.subList(0, 10));
//		String deleteString18 = radlistp1.toString().replace(",", "").replace("[", "").replace("]", "").trim();
//		System.out.print(deleteString18 + "\t\t ");
//		System.out.println();
//		
//		ArrayList<Integer> bublistp2 = new ArrayList<Integer>(bubble100.subList(10, 20));
//		String deleteString4 = bublistp2.toString().replace(",", "").replace("[", "").replace("]", "").trim();
//		System.out.print(deleteString4 + "\t ");
//		ArrayList<Integer> selclistp2 = new ArrayList<Integer>(selection100.subList(10, 20));
//		String deleteString5 = selclistp2.toString().replace(",", "").replace("[", "").replace("]", "").trim();
//		System.out.print(deleteString5 + "\t  ");
//		ArrayList<Integer> inslistp2 = new ArrayList<Integer>(insertion100.subList(10, 20));
//		String deleteString6 = inslistp2.toString().replace(",", "").replace("[", "").replace("]", "").trim();
//		System.out.print(deleteString6 + "\t   ");
//		//System.out.println();
//		ArrayList<Integer> qlistp2 = new ArrayList<Integer>(quick100.subList(10, 20));
//		String deleteString21 = qlistp2.toString().replace(",", "").replace("[", "").replace("]", "").trim();
//		System.out.print(deleteString21 + "    ");
//		ArrayList<Integer> merglistp2 = new ArrayList<Integer>(merge100.subList(10, 20));
//		String deleteString22 = merglistp2.toString().replace(",", "").replace("[", "").replace("]", "").trim();
//		System.out.print(deleteString22 + "    ");
//		ArrayList<Integer> cocklistp2 = new ArrayList<Integer>(cocktail100.subList(10, 20));
//		String deleteString24 = cocklistp2.toString().replace(",", "").replace("[", "").replace("]", "").trim();
//		System.out.print(deleteString24 + "    ");
//		ArrayList<Integer> gnomlistp2 = new ArrayList<Integer>(gnome100.subList(10, 20));
//		String deleteString25 = gnomlistp2.toString().replace(",", "").replace("[", "").replace("]", "").trim();
//		System.out.print(deleteString25 + "    ");
//		ArrayList<Integer> radlistp2 = new ArrayList<Integer>(radix100.subList(10, 20));
//		String deleteString23 = radlistp2.toString().replace(",", "").replace("[", "").replace("]", "").trim();
//		System.out.print(deleteString23 + "\t\t ");
//		System.out.println();
//		
//		ArrayList<Integer> bublistp3 = new ArrayList<Integer>(bubble100.subList(20, 30));
//		String deleteString7 = bublistp3.toString().replace(",", "").replace("[", "").replace("]", "").trim();
//		System.out.print(deleteString7 + "\t ");
//		ArrayList<Integer> selclistp3 = new ArrayList<Integer>(selection100.subList(20, 30));
//		String deleteString8 = selclistp3.toString().replace(",", "").replace("[", "").replace("]", "").trim();
//		System.out.print(deleteString8+ "\t  ");
//		ArrayList<Integer> inslistp3 = new ArrayList<Integer>(insertion100.subList(20, 30));
//		String deleteString9 = inslistp3.toString().replace(",", "").replace("[", "").replace("]", "").trim();
//		System.out.print(deleteString9 + "\t   ");
//		//System.out.println();
//		ArrayList<Integer> qlistp3 = new ArrayList<Integer>(quick100.subList(20, 30));
//		String deleteString26 = qlistp3.toString().replace(",", "").replace("[", "").replace("]", "").trim();
//		System.out.print(deleteString26 + "    ");
//		ArrayList<Integer> merglistp3 = new ArrayList<Integer>(merge100.subList(20, 30));
//		String deleteString27 = merglistp3.toString().replace(",", "").replace("[", "").replace("]", "").trim();
//		System.out.print(deleteString27 + "    ");
//		ArrayList<Integer> cocklistp3 = new ArrayList<Integer>(cocktail100.subList(20, 30));
//		String deleteString29 = cocklistp3.toString().replace(",", "").replace("[", "").replace("]", "").trim();
//		System.out.print(deleteString29 + "    ");
//		ArrayList<Integer> gnomlistp3 = new ArrayList<Integer>(gnome100.subList(20, 30));
//		String deleteString30 = gnomlistp3.toString().replace(",", "").replace("[", "").replace("]", "").trim();
//		System.out.print(deleteString30 + "    ");
//		ArrayList<Integer> radlistp3 = new ArrayList<Integer>(radix100.subList(20, 30));
//		String deleteString28 = radlistp3.toString().replace(",", "").replace("[", "").replace("]", "").trim();
//		System.out.print(deleteString28 + "\t\t ");
//		System.out.println();
//		
//		ArrayList<Integer> bublistp4 = new ArrayList<Integer>(bubble100.subList(30, 40));
//		String deleteString10 = bublistp4.toString().replace(",", "").replace("[", "").replace("]", "").trim();
//		System.out.print(deleteString10 + "\t ");
//		ArrayList<Integer> selclistp4 = new ArrayList<Integer>(selection100.subList(30, 40));
//		String deleteString11 = selclistp4.toString().replace(",", "").replace("[", "").replace("]", "").trim();
//		System.out.print(deleteString11 + "\t  ");
//		ArrayList<Integer> inslistp4 = new ArrayList<Integer>(insertion100.subList(30, 40));
//		String deleteString12 = inslistp4.toString().replace(",", "").replace("[", "").replace("]", "").trim();
//		System.out.print(deleteString12 + "\t   ");
//		//System.out.println();
//		ArrayList<Integer> qlistp4 = new ArrayList<Integer>(quick100.subList(30, 40));
//		String deleteString31 = qlistp4.toString().replace(",", "").replace("[", "").replace("]", "").trim();
//		System.out.print(deleteString31 + "    ");
//		ArrayList<Integer> merglistp4 = new ArrayList<Integer>(merge100.subList(30, 40));
//		String deleteString32 = merglistp4.toString().replace(",", "").replace("[", "").replace("]", "").trim();
//		System.out.print(deleteString32 + "    ");
//		ArrayList<Integer> cocklistp4 = new ArrayList<Integer>(cocktail100.subList(30, 40));
//		String deleteString34 = cocklistp4.toString().replace(",", "").replace("[", "").replace("]", "").trim();
//		System.out.print(deleteString34 + "    ");
//		ArrayList<Integer> gnomlistp4 = new ArrayList<Integer>(gnome100.subList(30, 40));
//		String deleteString35 = gnomlistp4.toString().replace(",", "").replace("[", "").replace("]", "").trim();
//		System.out.print(deleteString35 + "    ");
//		ArrayList<Integer> radlistp4 = new ArrayList<Integer>(radix100.subList(30, 40));
//		String deleteString33 = radlistp4.toString().replace(",", "").replace("[", "").replace("]", "").trim();
//		System.out.print(deleteString33 + "\t\t ");
//		System.out.println();
//		
//		ArrayList<Integer> bublistp5 = new ArrayList<Integer>(bubble100.subList(40, 50));
//		String deleteString13 = bublistp5.toString().replace(",", "").replace("[", "").replace("]", "").trim();
//		System.out.print(deleteString13 + "\t ");
//		ArrayList<Integer> selclistp5 = new ArrayList<Integer>(selection100.subList(40, 50));
//		String deleteString14 = selclistp5.toString().replace(",", "").replace("[", "").replace("]", "").trim();
//		System.out.print(deleteString14 + "\t  ");
//		ArrayList<Integer> inslistp5 = new ArrayList<Integer>(insertion100.subList(40, 50));
//		String deleteString15 = inslistp5.toString().replace(",", "").replace("[", "").replace("]", "").trim();
//		System.out.print(deleteString15 + "\t   ");
//		//System.out.println();
//		ArrayList<Integer> qlistp5 = new ArrayList<Integer>(quick100.subList(40, 50));
//		String deleteString36 = qlistp5.toString().replace(",", "").replace("[", "").replace("]", "").trim();
//		System.out.print(deleteString36 + "    ");
//		ArrayList<Integer> merglistp5 = new ArrayList<Integer>(merge100.subList(40, 50));
//		String deleteString37 = merglistp5.toString().replace(",", "").replace("[", "").replace("]", "").trim();
//		System.out.print(deleteString37 + "    ");
//		ArrayList<Integer> cocklistp5 = new ArrayList<Integer>(cocktail100.subList(40, 50));
//		String deleteString39 = cocklistp5.toString().replace(",", "").replace("[", "").replace("]", "").trim();
//		System.out.print(deleteString39 + "    ");
//		ArrayList<Integer> gnomlistp5 = new ArrayList<Integer>(gnome100.subList(40, 50));
//		String deleteString40 = gnomlistp5.toString().replace(",", "").replace("[", "").replace("]", "").trim();
//		System.out.print(deleteString40 + "    ");
//		ArrayList<Integer> radlistp5 = new ArrayList<Integer>(radix100.subList(40, 50));
//		String deleteString38 = radlistp5.toString().replace(",", "").replace("[", "").replace("]", "").trim();
//		System.out.print(deleteString38 + "\t\t ");
//		System.out.println();
//		
//		ArrayList<Integer> bublistp6 = new ArrayList<Integer>(bubble100.subList(50, 60));
//		String deleteString41 = bublistp6.toString().replace(",", "").replace("[", "").replace("]", "").trim();
//		System.out.print(deleteString41 + "\t ");
//		ArrayList<Integer> selclistp6 = new ArrayList<Integer>(selection100.subList(50, 60));
//		String deleteString42 = selclistp6.toString().replace(",", "").replace("[", "").replace("]", "").trim();
//		System.out.print(deleteString42 + "\t  ");
//		ArrayList<Integer> inslistp6 = new ArrayList<Integer>(insertion100.subList(50, 60));
//		String deleteString43 = inslistp6.toString().replace(",", "").replace("[", "").replace("]", "").trim();
//		System.out.print(deleteString43 + "\t   ");
//		//System.out.println();
//		ArrayList<Integer> qlistp6 = new ArrayList<Integer>(quick100.subList(50, 60));
//		String deleteString44 = qlistp6.toString().replace(",", "").replace("[", "").replace("]", "").trim();
//		System.out.print(deleteString44 + "    ");
//		ArrayList<Integer> merglistp6 = new ArrayList<Integer>(merge100.subList(50, 60));
//		String deleteString45 = merglistp6.toString().replace(",", "").replace("[", "").replace("]", "").trim();
//		System.out.print(deleteString45 + "    ");
//		ArrayList<Integer> cocklistp6 = new ArrayList<Integer>(cocktail100.subList(50, 60));
//		String deleteString47 = cocklistp6.toString().replace(",", "").replace("[", "").replace("]", "").trim();
//		System.out.print(deleteString47 + "    ");
//		ArrayList<Integer> gnomlistp6 = new ArrayList<Integer>(gnome100.subList(50, 60));
//		String deleteString48 = gnomlistp6.toString().replace(",", "").replace("[", "").replace("]", "").trim();
//		System.out.print(deleteString48 + "    ");
//		ArrayList<Integer> radlistp6 = new ArrayList<Integer>(radix100.subList(50, 60));
//		String deleteString46 = radlistp6.toString().replace(",", "").replace("[", "").replace("]", "").trim();
//		System.out.print(deleteString46 + "\t\t ");
//		System.out.println();
//		
//		ArrayList<Integer> bublistp7 = new ArrayList<Integer>(bubble100.subList(60, 70));
//		String deleteString49 = bublistp7.toString().replace(",", "").replace("[", "").replace("]", "").trim();
//		System.out.print(deleteString49 + "\t ");
//		ArrayList<Integer> selclistp7 = new ArrayList<Integer>(selection100.subList(60, 70));
//		String deleteString50 = selclistp7.toString().replace(",", "").replace("[", "").replace("]", "").trim();
//		System.out.print(deleteString50 + "\t  ");
//		ArrayList<Integer> inslistp7 = new ArrayList<Integer>(insertion100.subList(60, 70));
//		String deleteString51 = inslistp7.toString().replace(",", "").replace("[", "").replace("]", "").trim();
//		System.out.print(deleteString51 + "\t   ");
//		//System.out.println();
//		ArrayList<Integer> qlistp7 = new ArrayList<Integer>(quick100.subList(60, 70));
//		String deleteString52 = qlistp7.toString().replace(",", "").replace("[", "").replace("]", "").trim();
//		System.out.print(deleteString52 + "    ");
//		ArrayList<Integer> merglistp7 = new ArrayList<Integer>(merge100.subList(60, 70));
//		String deleteString53 = merglistp7.toString().replace(",", "").replace("[", "").replace("]", "").trim();
//		System.out.print(deleteString53 + "    ");
//		ArrayList<Integer> cocklistp7 = new ArrayList<Integer>(cocktail100.subList(60, 70));
//		String deleteString55 = cocklistp7.toString().replace(",", "").replace("[", "").replace("]", "").trim();
//		System.out.print(deleteString55 + "    ");
//		ArrayList<Integer> gnomlistp7 = new ArrayList<Integer>(gnome100.subList(60, 70));
//		String deleteString56 = gnomlistp7.toString().replace(",", "").replace("[", "").replace("]", "").trim();
//		System.out.print(deleteString56 + "    ");
//		ArrayList<Integer> radlistp7 = new ArrayList<Integer>(radix100.subList(60, 70));
//		String deleteString54 = radlistp7.toString().replace(",", "").replace("[", "").replace("]", "").trim();
//		System.out.print(deleteString54 + "\t\t ");
//		System.out.println();
//		
//		ArrayList<Integer> bublistp8 = new ArrayList<Integer>(bubble100.subList(70, 80));
//		String deleteString57 = bublistp8.toString().replace(",", "").replace("[", "").replace("]", "").trim();
//		System.out.print(deleteString57 + "\t ");
//		ArrayList<Integer> selclistp8 = new ArrayList<Integer>(selection100.subList(70, 80));
//		String deleteString58 = selclistp8.toString().replace(",", "").replace("[", "").replace("]", "").trim();
//		System.out.print(deleteString58 + "\t  ");
//		ArrayList<Integer> inslistp8 = new ArrayList<Integer>(insertion100.subList(70, 80));
//		String deleteString59 = inslistp8.toString().replace(",", "").replace("[", "").replace("]", "").trim();
//		System.out.print(deleteString59 + "\t   ");
//		//System.out.println();
//		ArrayList<Integer> qlistp8 = new ArrayList<Integer>(quick100.subList(70, 80));
//		String deleteString60 = qlistp8.toString().replace(",", "").replace("[", "").replace("]", "").trim();
//		System.out.print(deleteString60 + "    ");
//		ArrayList<Integer> merglistp8 = new ArrayList<Integer>(merge100.subList(70, 80));
//		String deleteString61 = merglistp8.toString().replace(",", "").replace("[", "").replace("]", "").trim();
//		System.out.print(deleteString61 + "    ");
//		ArrayList<Integer> cocklistp8 = new ArrayList<Integer>(cocktail100.subList(70, 80));
//		String deleteString63 = cocklistp8.toString().replace(",", "").replace("[", "").replace("]", "").trim();
//		System.out.print(deleteString63 + "    ");
//		ArrayList<Integer> gnomlistp8 = new ArrayList<Integer>(gnome100.subList(70, 80));
//		String deleteString64 = gnomlistp8.toString().replace(",", "").replace("[", "").replace("]", "").trim();
//		System.out.print(deleteString64 + "    ");
//		ArrayList<Integer> radlistp8 = new ArrayList<Integer>(radix100.subList(70, 80));
//		String deleteString62 = radlistp8.toString().replace(",", "").replace("[", "").replace("]", "").trim();
//		System.out.print(deleteString62 + "\t\t ");
//		System.out.println();
//		
//		ArrayList<Integer> bublistp9 = new ArrayList<Integer>(bubble100.subList(80, 90));
//		String deleteString65 = bublistp9.toString().replace(",", "").replace("[", "").replace("]", "").trim();
//		System.out.print(deleteString65 + "\t ");
//		ArrayList<Integer> selclistp9 = new ArrayList<Integer>(selection100.subList(80, 90));
//		String deleteString66 = selclistp9.toString().replace(",", "").replace("[", "").replace("]", "").trim();
//		System.out.print(deleteString66 + "\t  ");
//		ArrayList<Integer> inslistp9 = new ArrayList<Integer>(insertion100.subList(80, 90));
//		String deleteString67 = inslistp9.toString().replace(",", "").replace("[", "").replace("]", "").trim();
//		System.out.print(deleteString67 + "\t   ");
//		//System.out.println();
//		ArrayList<Integer> qlistp9 = new ArrayList<Integer>(quick100.subList(80, 90));
//		String deleteString68 = qlistp9.toString().replace(",", "").replace("[", "").replace("]", "").trim();
//		System.out.print(deleteString68 + "    ");
//		ArrayList<Integer> merglistp9 = new ArrayList<Integer>(merge100.subList(80, 90));
//		String deleteString69 = merglistp9.toString().replace(",", "").replace("[", "").replace("]", "").trim();
//		System.out.print(deleteString69 + "    ");
//		ArrayList<Integer> cocklistp9 = new ArrayList<Integer>(cocktail100.subList(80, 90));
//		String deleteString71 = cocklistp9.toString().replace(",", "").replace("[", "").replace("]", "").trim();
//		System.out.print(deleteString71 + "    ");
//		ArrayList<Integer> gnomlistp9 = new ArrayList<Integer>(gnome100.subList(80, 90));
//		String deleteString72 = gnomlistp9.toString().replace(",", "").replace("[", "").replace("]", "").trim();
//		System.out.print(deleteString72 + "    ");
//		ArrayList<Integer> radlistp9 = new ArrayList<Integer>(radix100.subList(80, 90));
//		String deleteString70 = radlistp9.toString().replace(",", "").replace("[", "").replace("]", "").trim();
//		System.out.print(deleteString70 + "\t\t ");
//		System.out.println();
//		
//		ArrayList<Integer> bublistp10 = new ArrayList<Integer>(bubble100.subList(90, 100));
//		String deleteString73 = bublistp10.toString().replace(",", "").replace("[", "").replace("]", "").trim();
//		System.out.print(deleteString73 + "\t ");
//		ArrayList<Integer> selclistp10 = new ArrayList<Integer>(selection100.subList(90, 100));
//		String deleteString74 = selclistp10.toString().replace(",", "").replace("[", "").replace("]", "").trim();
//		System.out.print(deleteString74 + "\t  ");
//		ArrayList<Integer> inslistp10 = new ArrayList<Integer>(insertion100.subList(90, 100));
//		String deleteString75 = inslistp10.toString().replace(",", "").replace("[", "").replace("]", "").trim();
//		System.out.print(deleteString75 + "\t   ");
//		//System.out.println();
//		ArrayList<Integer> qlistp10 = new ArrayList<Integer>(quick100.subList(90, 100));
//		String deleteString76 = qlistp10.toString().replace(",", "").replace("[", "").replace("]", "").trim();
//		System.out.print(deleteString76 + "    ");
//		ArrayList<Integer> merglistp10 = new ArrayList<Integer>(merge100.subList(90, 100));
//		String deleteString77 = merglistp10.toString().replace(",", "").replace("[", "").replace("]", "").trim();
//		System.out.print(deleteString77 + "    ");
//		ArrayList<Integer> cocklistp10 = new ArrayList<Integer>(cocktail100.subList(90, 100));
//		String deleteString79 = cocklistp10.toString().replace(",", "").replace("[", "").replace("]", "").trim();
//		System.out.print(deleteString79 + "    ");
//		ArrayList<Integer> gnomlistp10 = new ArrayList<Integer>(gnome100.subList(90, 100));
//		String deleteString80 = gnomlistp10.toString().replace(",", "").replace("[", "").replace("]", "").trim();
//		System.out.print(deleteString80 + "    ");
//		ArrayList<Integer> radlistp10 = new ArrayList<Integer>(radix100.subList(90, 100));
//		String deleteString78 = radlistp10.toString().replace(",", "").replace("[", "").replace("]", "").trim();
//		System.out.print(deleteString78 + "\t\t ");
//		System.out.println();
//		System.out.println();
//		bs.compare();
//		System.out.printf(" ");
//		sc.compare();
//		System.out.printf("\t\t  ");
//		ins.compare();
//		System.out.printf("\t\t   ");
//		QuickSort.compare();
//		System.out.printf("\t\t    ");
//		MergeSort.compare();
//		System.out.printf("\t\t     ");
//		//RadixSort.compare();
//		CockTailSort.compare();
//		System.out.printf("\t      ");
//		GnomeSort.compare();
//		System.out.printf("\t       ");
//		RadixSort.runtime();
//		System.out.printf("\t\t\t\t ");
//		System.out.println();
//		bs.swap();
//		System.out.printf("\t\t\t ");
//		sc.swap();
//		System.out.printf("\t\t\t  ");
//		ins.swap();
//		System.out.printf("\t\t\t   ");
//		QuickSort.swap();
//		System.out.printf("\t\t\t    ");
//		MergeSort.swap();
//		System.out.printf(" ");
//		//RadixSort.swap();
//		System.out.printf("\t\t\t     ");
//		CockTailSort.swap(); 
//		System.out.printf("\t\t      ");
//		GnomeSort.swap();
//		System.out.printf("\t\t\t  ");
//		System.out.println();
//		bs.runtime(); 
//		System.out.printf("\t\t\t ");
//		sc.runtime();
//		System.out.printf("\t\t\t  ");
//		ins.runtime();
//		System.out.printf("\t\t\t   ");
//		QuickSort.runtime();
//		System.out.printf("\t\t    ");
//		MergeSort.runtime();
//		System.out.printf("\t     ");
//
//		System.out.printf("\t     ");
//		CockTailSort.runtime();
//		System.out.printf("\t\t      ");
//		GnomeSort.runtime();
//		System.out.printf("\t\t\t  ");
//		System.out.println();
//		System.out.println();
//	}