
public class BubbleSort {
	private int[] temp;
	
	void arr_int_Sort(int[] arr) {
		temp = new int[arr.length];
		temp = arr;
		int tmp = 0;
		for(int i = 0; i < temp.length; i++) {
			for(int j = 1; j < temp.length-i; j++) {
				if(temp[j-1] > temp[j]) {
					tmp = temp[j-1];
					temp[j-1] = temp[j];
					temp[j] = tmp;
				}
			}
		}
	}
	void arr_sort_print() {
		for(int i = 0; i < temp.length; i++) {
			System.out.print(temp[i] + " ");
		}
	}
	

}
