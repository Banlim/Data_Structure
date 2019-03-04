
public class MergeSort {
	private int [] sort_arr;
	
	MergeSort(int [] list){
		sort_arr = new int[list.length];
		merge_sort(list, 0, list.length-1);
	}
	
	void merge(int [] list, int left, int mid, int right) {
		int l = left;
		int r = mid+1;
		int sort_index = left;
		while(l <= mid && r <= right) {
			if(list[l] < list[r]) {
				sort_arr[sort_index] = list[l];
				l++;
			}
			else if (list[l] > list[r]) {
				sort_arr[sort_index] = list[r];
				r++;
			}
			sort_index++;
		}
		if(l <= mid) {
			for(int i = l; i <= mid; i++) {
				sort_arr[sort_index] = list[i];
				sort_index++;
			}
		}
		else {
			for(int i = r; i <= right; i++) {
				sort_arr[sort_index] = list[i];
				sort_index++;
			}
		}
		for(int i = left; i <= right; i++) {
			list[i] = sort_arr[i];
		}
	}
	
	void merge_sort(int [] list, int left, int right) {
		int mid;
		if(left < right) {
			mid = (left + right)/2;
			merge_sort(list, left, mid);
			merge_sort(list, mid+1, right);
			merge(list, left, mid, right);
		}
	}
	void print_sort_arr() {
		for(int i = 0; i < sort_arr.length; i++) {
			System.out.print(sort_arr[i] + " ");
		}
	}

}
