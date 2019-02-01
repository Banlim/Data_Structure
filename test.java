
public class test {

	public static void main(String[] args) {
		Queue q = new Queue(5);
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		System.out.println(q.peek());
		q.dequeue();
		q.dequeue();
		q.dequeue();
		System.out.println(q.peek());
		System.out.println(q.indexOf(5));
		q.enqueue(7);
		q.dequeue();
		q.dequeue();
		System.out.println("peek : " + q.peek());
		q.dequeue();
		System.out.println("size : " + q.size());

	}

}
