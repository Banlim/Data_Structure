import java.util.Scanner;

public class SelectionSort {
	private int [] sortArr;
	public void run() {
		Scanner scan = new Scanner(System.in);
		System.out.println("input array size");
		int size = scan.nextInt();
		sortArr = new int[size];
		System.out.println("input data");
		for(int i = 0; i < size; i++) {
			sortArr[i] = scan.nextInt();
		}
		int_selection_sort();
		System.out.println("========selection sorting========");
		print_sort();
		scan.close();
	}
	private void int_selection_sort() {
		int changeIdx, temp;
		for(int i = 0; i < sortArr.length-1; i++) {
			changeIdx = i;
			for(int j = i+1; j < sortArr.length; j++) {
				if(sortArr[j] < sortArr[changeIdx]) {
					changeIdx = j;
				}
			}
			temp = sortArr[i];
			sortArr[i] = sortArr[changeIdx];
			sortArr[changeIdx] = temp;
		}
	}
	private void print_sort() {
		for(int i = 0; i < sortArr.length; i++) {
			System.out.print(sortArr[i] + "  ");
		}
	}
}
