
public class QuickSort {
	
	private int pivot;
	private int low;
	private int high;
	private int [] sort_arr;
	
	QuickSort(int[] arr){
		sort_arr = new int[arr.length];
		sort_arr = arr;
		int_sort(sort_arr, 0, arr.length-1);
	}
	
	int partition(int[] arr, int left, int right) {
		int [] temp = new int[arr.length];
		temp = arr;
		
		pivot = temp[left];
		low = left + 1;
		high = right;
		
		int tmp;
		while(low < high) {
			while(temp[low] < pivot && low < high) {
				low++;
			}
			
			while(temp[high] > pivot && low < high) {
				high--;
			}
			
			if(temp[low] > pivot && temp[high] < pivot) {
				tmp = temp[low];
				temp[low] = temp[high];
				temp[high] = tmp;
				
			}	
		}
		
		temp[left] = temp[high-1];
		temp[high-1] = pivot;
		
		return high-1;
	}
	void int_sort(int arr[], int left, int right) {
		if(left < right) {
			int p = partition(arr, left, right);
			int_sort(arr, left, p-1);
			int_sort(arr, p+1, right);
		}
	}
	void print_quick_sort() {
		for(int i = 0; i < sort_arr.length; i++) {
			System.out.print(sort_arr[i] + " ");
		}
	}

}
