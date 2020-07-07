import java.util.Scanner;

public class InsertionSort {
	private int[] sortArr;
	public void run() {
		Scanner scan = new Scanner(System.in);
		System.out.println("input array size");
		int size = scan.nextInt();
		sortArr = new int[size];
		System.out.println("input data");
		for(int i = 0; i < size; i++) {
			sortArr[i] = scan.nextInt();
		}
		int_insertion_sort();
		System.out.println("========insertion sorting========");
		print_sort();
		scan.close();
	}
	private void int_insertion_sort() {
		int temp, prev;
		for(int i = 1; i < sortArr.length; i++) {
			prev = i - 1;
			temp = sortArr[i];
			while((prev >= 0) && (sortArr[prev] > temp)) {
				sortArr[prev+1] = sortArr[prev];
				prev--;
			}
			sortArr[prev + 1] = temp; 
		}
	}
	private void print_sort() {
		for(int i = 0; i < sortArr.length; i++) {
			System.out.print(sortArr[i] + "  ");
		}
	}
}
