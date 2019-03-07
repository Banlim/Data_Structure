
public class Heap {
	private int [] heap;
	private int heapCnt;
	
	Heap(){
		heap = new int[200];
		heapCnt = 0;
	}
	
	void insert_heap(int element) {
		heapCnt++;
		int newNode = heapCnt;
		heap[newNode] = element;
		while(heap[newNode] > heap[newNode/2] && newNode/2 != 0) {
			int tmp = heap[newNode];
			heap[newNode] = heap[newNode/2];
			heap[newNode/2] = tmp;
			newNode = newNode/2;
		}
	}
	void delete_heap() {
		heap[1] = heap[heapCnt];
		heapCnt--;
		int deleteNode = 1;
		while(deleteNode*2+1 < heapCnt && (heap[deleteNode] < heap[deleteNode*2] || heap[deleteNode] < heap[deleteNode*2+1])) {
			int tmp = heap[deleteNode];
			if(heap[deleteNode] < heap[deleteNode*2] && heap[deleteNode*2] >= heap[deleteNode*2+1]) {
				heap[deleteNode] = heap[deleteNode*2];
				heap[deleteNode*2] = tmp;
				deleteNode = deleteNode*2;
			}
			else if(heap[deleteNode] < heap[deleteNode*2+1] && heap[deleteNode*2] < heap[deleteNode*2+1]) {
				heap[deleteNode] = heap[deleteNode*2+1];
				heap[deleteNode*2+1] = tmp;
				deleteNode = deleteNode*2+1;
			}
		}
	}
	void dump() {
		for(int i = 1; i <= heapCnt; i++) {
			System.out.print(heap[i] + " ");
		}
	}
	int[] heap_sort(int [] arr, int Cnt) {
		for(int i = 0; i < Cnt ; i++) {
			insert_heap(arr[i]);
		}
		for(int i = 0; i < Cnt; i++) {
			arr[i] = heap[1];
			delete_heap();
		}
		return arr;
	}
}
