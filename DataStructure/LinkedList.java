class Node{
	int data;
	Node nextNode;
	
	Node(){
		this.data = 0;
		this.nextNode = null;
	}
}
public class LinkedList {
	private static Node head;
	private static Node crnt;
	private int size;
	
	public LinkedList() {
		head = new Node();
		crnt = new Node();
		//head = null;
		size = 0;
	}
	boolean isEmpty() {
		if(size == 0) {
			return true;
		}
		return false;
	}
	boolean isTail() {
		if(crnt.nextNode == null) {
			return true;
		}
		return false;
	}
	void search(int data) {
		Node ptr = head;
		int i = 0;
		while(i <= size) {
			if(ptr.data == data) {
				crnt = ptr;
				System.out.println("검색 성공!");
				return;
			}
			ptr = ptr.nextNode;
		}
		System.out.println("검색 실패!");
	}
	void addFirst(int data) {
		Node node = new Node();
		if(isEmpty()) {
			//System.out.println("head null!");
			head.data = data;
			head.nextNode = null;
			crnt = head;
			//System.out.println("head null data : " + head.data);
			//System.out.println("crnt data : " + head.data);
		}
		else {
			//node.data = data;
			//node.nextNode = head;
			Node tmp = head;
			node.data = data;
			node.nextNode = tmp;
			//System.out.println("node dataaa : " + node.data);
			head = node;
			//System.out.println("head data : " + head.data);
			//System.out.println("head next data : " + head.nextNode.data);
			//System.out.println("node data : " + node.data);
			//System.out.println("crnt data : " + crnt.data);
			crnt = head;
			//System.out.println("crnt data : " + crnt.data);
		}
		size++;
	}
	void addLast(int data) {
		Node node = new Node();
		if(isEmpty()) {
			addFirst(data);
		}
		else {
			node.data = data;
			node.nextNode = null;
			//while(crnt.nextNode != null) 
			while(!isTail())
				crnt = crnt.nextNode;
				
			crnt.nextNode = node;
			crnt = node;
		}
		size++;
	}
	void removeFirst() {
		if(isEmpty()) {
			System.out.println("노드가 없습니다.");
			return;
		}
		else if(size == 1){
			head.data = 0;
			head.nextNode = null;
			crnt = head;
			//System.out.println("호잇");
		}
		else {
			Node temp = head.nextNode;
			//System.out.println("head data : " + head.data);
			head = temp;
			//System.out.println("temp data : " + temp.data);
			//System.out.println("remove head data : " + head.data);
			//System.out.println("head next data : " + head.nextNode.data);
			
		}
		size--;
	}
	void removeLast() {
		if(isEmpty()) {
			System.out.println("노드가 없습니다.");
			return;
		}
		else if(size == 1) {
			//head.data = 0;
			//head.nextNode = null;
			//crnt = head;
			removeFirst();
			return;
		}
		else {
			Node temp = head;
			while(temp.nextNode.nextNode != null) { 
			//while(!isTail())
				//System.out.println("while crnt data : " + crnt.data);
				temp = temp.nextNode;
			}
			//System.out.println("crnt data : " + crnt.data);
			//crnt.nextNode = null;
			temp.nextNode = null;
			crnt = temp;
		}
		size--;
	}
	void selectRemove(int data) {
		search(data);
		currentRemove();
	}
	void currentRemove() {
		//Node temp = new Node();
		//temp = head;
		Node temp = head;
		if(isTail()) {
			removeLast();
		}
		else if(crnt == head) {
			removeFirst();
		}
		else {
			while(!temp.nextNode.equals(crnt)) {
				temp = temp.nextNode;
			}
		/*System.out.println("temp data : " + temp.data);
		System.out.println("temp next data : " + temp.nextNode.data);
		System.out.println("crnt data : " + crnt.data);
		System.out.println("crnt next data : " + crnt.nextNode.data);
		*/
			temp.nextNode = crnt.nextNode;
			crnt = temp.nextNode; // 현재 지운 노드의 뒷 노드를 현재 노드로 설정
			size--;
		/*System.out.println("rm temp data : " + temp.data);
		System.out.println("rm temp next data : " + temp.nextNode.data);
		System.out.println("rm crnt data : " + crnt.data);
		*/
		}
	}
	void clear() {
		//int i = 0;
		while(head.nextNode != null) {
			removeFirst();
			//System.out.println("clear while head node : " + head.data);
			//System.out.println("size : " + size);
			//System.out.println("clear while i : " + i);
		}
		removeFirst();
		//crnt = head;
		//System.out.println("clear crnt node : " + crnt.data);
		//System.out.println("clear head node : " + head.data);
		//size = 0;
	}
	int printSize() {
		return size;
	}
	void dump() {
		Node ptr = head;
		//System.out.println("size : " + size);
		//System.out.println("ptr : " + ptr.data);
		//System.out.println("ptr next : " + ptr.nextNode.data);
		//System.out.println("ptr next next : " + ptr.nextNode.nextNode.data);
		if(isEmpty()) {
			System.out.println("노드가 없습니다.");
		}
		else {
			int i = 0;
			while(i < size) {
			//while(ptr.nextNode != null) {
				System.out.println(ptr.data);
				ptr = ptr.nextNode;
				i++;
			}
		}
	}
	void printCurrentNode() {
		System.out.println("current node : " + crnt.data);
	}

}
