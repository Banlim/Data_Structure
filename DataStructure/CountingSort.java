import java.util.Scanner;

public class CountingSort {
	private int[] prevSortArr;
	private int[] sortArr;
	private int[] countArr;
	private int MAX_NUM = 100;
	private int maxCount = 0;
	
	public void run() {
		Scanner scan = new Scanner(System.in);
		System.out.println("input array size");
		int size = scan.nextInt();
		
		prevSortArr = new int[size];
		sortArr = new int[size];
		countArr = new int[MAX_NUM];
		
		System.out.println("input data");
		for(int i = 0; i < size; i++) {
			prevSortArr[i] = scan.nextInt();
			if(prevSortArr[i] > MAX_NUM) {
				System.out.println("ERROR : " + MAX_NUM + "이하여야 합니다.");
				return;
			}
			if(maxCount < prevSortArr[i]) {
				maxCount = prevSortArr[i];
			}
			countArr[prevSortArr[i]]++;
		}
		
		cumulative_sum();
		System.out.println("========Counting sorting========");
		int_counting_sort();
		print_sort();
		
		scan.close();
	}
	private void cumulative_sum() {
		for(int i = 0; i < maxCount; i++) {
			countArr[i+1] += countArr[i];
		}
	}
	private void int_counting_sort() {
		for(int i = prevSortArr.length-1; i >= 0; i--) {
			sortArr[countArr[prevSortArr[i]] - 1] = prevSortArr[i];
			countArr[prevSortArr[i]]--;
		}
	}
	private void print_sort() {
		for(int i = 0; i < sortArr.length; i++) {
			System.out.print(sortArr[i] + "  ");
		}
	}
}
