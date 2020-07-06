
public class test {

	public static void main(String[] args) {
		
		/* trie test
		Trie t = new Trie();
		t.init();
		t.inputString("apple");
		t.inputString("appe");
		t.inputString("air");
		t.inputString("airplane");
		t.printSearchAllString("ai");
		t.printSearchAllString("appl");
		*/
		
		
		/* Hash test
		Hash hash = new Hash();
		hash.inputString("abcdefghijklmn");
		hash.inputString("hello");
		*/
		
		/* Red Black Tree test
		RedBlackTree rb = new RedBlackTree();
		rb.createNode(5);
		rb.createNode(1);
		rb.createNode(7);
		rb.createNode(4);
		rb.createNode(2);
		rb.createNode(3);
		rb.createNode(8);
		rb.createNode(9);
		rb.createNode(10);
		rb.printRBTree(rb.getRoot(), 0);
		rb.preOrderPrintRBTree(rb.getRoot());
		*/
		
		/* Weight Graph test
		WeightGraph wg = new WeightGraph();
		wg.adjustInit(6);
		wg.insertAdjust(1, 2, 3);
		wg.insertAdjustSingle(2, 4, 6);
		wg.insertAdjust(3, 6, 2);
		wg.insertAdjustSingle(6, 1, 5);
		wg.printAdjust();
		System.out.println();
		wg.matrixInit(6);
		wg.insertMatrix(1, 2, 3);
		wg.insertMatrixSingle(2, 4, 6);
		wg.insertMatrix(3, 6, 2);
		wg.insertMatrixSingle(6, 1, 5);
		wg.printMatrix();
		*/
		
		/* No Weight Graph test
		NoWeightGraph nwg = new NoWeightGraph();
		nwg.adjustInit(6);
		nwg.insertAdjust(1, 2);
		nwg.insertAdjustSingle(2, 4);
		nwg.insertAdjust(3, 6);
		nwg.insertAdjustSingle(6, 1);
		nwg.printAdjustGraph();
		
		nwg.matrixInit(6);
		nwg.insertMatrix(1, 2);
		nwg.insertMatrixSingle(2, 4);
		nwg.insertMatrix(3, 6);
		nwg.insertMatrixSingle(6, 1);
		nwg.printMatrix();
		*/
		
		/* Binary Search Tree test
		BinarySearchTree bst = new BinarySearchTree();
		bst.insertBST(3);
		bst.insertBST(9);
		bst.insertBST(7);
		bst.insertBST(1);
		bst.insertBST(6);
		bst.insertBST(2);
		bst.insertBST(8);
		bst.printBSTpreOrder(bst.getRoot());
		bst.deleteBST(6);
		System.out.println();
		bst.printBSTpreOrder(bst.getRoot());
		*/
		
		/* Queue test
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
		*/
		
		/* LinkedList test
		LinkedList l = new LinkedList();
		l.removeLast();
		l.addFirst(1);
		l.addFirst(2);
		l.addLast(3);
		l.addLast(7);
		l.removeLast();
		l.dump();
		l.search(1);
		l.printCurrentNode();
		l.currentRemove();
		l.dump();
		l.removeFirst();
		l.addLast(4);
		l.dump();
		l.currentRemove();
		System.out.println("dump!");
		l.dump();
		l.addFirst(5);
		l.printCurrentNode();
		l.addFirst(6);
		l.dump();
		l.removeFirst();
		//System.out.println(l.printSize());
		l.dump();
		l.clear();
		System.out.println(l.printSize());
		l.dump();
		*/
		
		/* Buuble Sort test
		BubbleSort bs = new BubbleSort();
		int [] arr = {5, 9, 4, 1, 3};
		bs.arr_int_Sort(arr);
		bs.arr_sort_print();
		*/
		
		/* Quick Sort test
		int [] arr = {5, 3, 8, 4, 9, 1, 6, 2, 7};
		QuickSort qs = new QuickSort(arr);
		qs.int_sort(arr, 0, arr.length-1);
		qs.print_quick_sort();
		*/ 
		
		/* Merge Sort test
		int [] arr = {21, 10, 12, 20, 25, 13, 15, 22};
		MergeSort ms = new MergeSort(arr);
		ms.print_sort_arr();
		*/
		
		/* Heap & Heap Sort
		Heap hp = new Heap();
		hp.insert_heap(1);
		hp.insert_heap(3);
		hp.insert_heap(9);
		hp.insert_heap(6);
		hp.insert_heap(5);
		hp.insert_heap(4);
		hp.dump();
		System.out.println();
		hp.delete_heap();
		hp.dump();
		
		int [] arr = {10, 13, 5, 21, 6, 9, 4, 7};
		int [] sort_arr = new int[arr.length];
		sort_arr = hp.heap_sort(arr, arr.length);
		for(int i = 0; i < sort_arr.length; i++) {
			System.out.print(sort_arr[i] + " ");
		}
		*/

	}

}
