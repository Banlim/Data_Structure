
public class Queue {
	private int max;
	private int num;
	private int front;
	private int rear;
	private int[] que;
	
	public Queue(int max) {
		this.max = max;
		this.num = 0;
		this.front = 0;
		this.rear = 0;
		this.que = new int[max];
	}
	
	void enqueue(int data) {
		if(isFull()) {
			System.out.println("큐가 가득 찼습니다.");
			return;
		}
		que[rear] = data;
		num++;
		rear++;
		if(rear == max)
			rear = 0;
	}
	void dequeue() {
		if(isEmpty()) {
			System.out.println("큐가 비어있습니다.");
			return;
		}
		num--;
		front++;
		if (front == max)
			front = 0;
		
	}
	boolean isEmpty() {
		if(num == 0) {
			return true;
		}
		return false;
	}
	boolean isFull() {
		if(num >= max) {
			return true;
		}
		return false;
	}
	int indexOf(int data) {
		int j = rear-1;
		if (rear < front) {
			for(int i = 0; i < rear; i++) {
				if(que[i] == data)
					return i;
			}
			for(int i = front; i < max; i++) {
				if(que[i] == data)
					return i;
			}
		}
		else {
			while(j >= 0) {
				if(que[j] == data) {
					return j;
				}
				j--;
			}
		}
		return -1;
	}
	void clear() {
		front = 0;
		rear = 0;
		num = 0;
	}
	int capacity() {
		return this.max;
	}
	int size() {
		return this.num;
	}
	int peek() {
		if(isEmpty()) {
			System.out.println("큐가 비어있습니다.");
			return 0;
		}
		return que[front];
	}

}
