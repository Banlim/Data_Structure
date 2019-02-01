
public class Stack {
	int max;
	int ptr;
	int[] stk;
	
	public Stack(int max) {
		this.max = max;
		this.ptr = 0;
		this.stk = new int[max];
	}
	
	void push(int data) {
		if(isFull()) {
			System.out.println("스택이 가득 찼습니다.");
			return;
		}
		stk[ptr] = data;
		ptr++;
	}
	
	void pop() {
		if(isEmpty()) {
			System.out.println("스택이 비어있습니다.");
			return;
		}
		ptr--;
	}
	
	int peek() {
		if(isEmpty()) {
			System.out.println("스택이 비어있습니다.");
			return 0;
		}
		else 
			return this.stk[ptr-1];
	}
	
	int indexOf(int data) {
		int j = ptr;
		while (j >= 0) {
			if(stk[j] == data) {
				return j;
			}
			j--;
		}
		return -1;
	}
	
	void clear() {
		this.ptr = 0;
	}
	
	int capacity() {
		return this.max;
	}
	
	int size() {
		return this.ptr;
	}
	
	boolean isEmpty() {
		if(ptr == 0) {
			return true;
		}
		return false;
	}
	
	boolean isFull() {
		if(ptr == max) {
			return true;
		}
		return false;
	}
}