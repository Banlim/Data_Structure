
public class BinarySearchTree {
	private class BSTNode{
		int key;
		BSTNode leftNode;
		BSTNode rightNode;
		
		public BSTNode(int key) {
			this.key = key;
		}
	}
	private BSTNode root;
	
	public BSTNode getRoot() {
		return this.root;
	}
	public void insertBST(int key) {
		if(findBST(key) != null) { // �ش� ���� �̹� �����ϴ� ��� �ߺ��̹Ƿ� ����.
			return;
		}
		
		BSTNode newNode = new BSTNode(key);
		
		if(root == null) {
			root = newNode;
		}
		else {
			BSTNode searchNode = root;
			BSTNode parent;
			
			while(true) {
				parent = searchNode;
				if(key < parent.key) {
					searchNode = searchNode.leftNode;
					if(searchNode == null) {
						parent.leftNode = newNode;
						return;
					}
				}
				else {
					searchNode = searchNode.rightNode;
					if(searchNode == null) {
						parent.rightNode = newNode;
						return;
					}
				}
			}
		}
	}
	
	public boolean deleteBST(int key) {
		BSTNode searchNode = root;
		BSTNode parent = root;
		boolean isLeftNode = false;
		
		while(searchNode.key != key) {
			parent = searchNode;
			if(searchNode.key > key) {
				isLeftNode = true;
				searchNode = parent.leftNode;
			}
			else {
				isLeftNode = false;
				searchNode = parent.rightNode;
			}
			if(searchNode == null) {
				return false;
			}
		}
		
		BSTNode replace;
		// �����Ϸ��� ����� �ڽ��� �ϳ��� ���� ���
		if(searchNode.leftNode == null && searchNode.rightNode == null) {
			if(searchNode == root) {
				root = null;
			}
			else if(isLeftNode) {
				parent.leftNode = null;
			}
			else {
				parent.rightNode = null;
			}
		}
		// �����Ϸ��� ����� �ڽ��� ���ʿ��� ������ ���
		else if(searchNode.rightNode == null) {
			replace = searchNode.leftNode;
			if(searchNode == root) {
				root = replace;
			}
			else if(isLeftNode) {
				parent.leftNode = replace;
			}
			else {
				parent.rightNode = replace;
			}
		}
		// �����Ϸ��� ����� �ڽ��� �����ʿ��� ������ ���
		else if(searchNode.leftNode == null) {
			replace = searchNode.rightNode;
			if(searchNode == root) {
				root = replace;
			}
			else if(isLeftNode) {
				parent.leftNode = replace;
			}
			else {
				parent.rightNode = replace;
			}
		}
		// �����Ϸ��� ����� �ڽ��� ��� ������ ���
		else {
			BSTNode rightSubTree = searchNode.rightNode;
			replace = getReplaceRightNode(searchNode.rightNode);
			if(searchNode == root) {
				root = replace;
			}
			else if(isLeftNode) {
				parent.leftNode = replace;
			}
			else {
				parent.rightNode = replace;
			}
			replace.rightNode = rightSubTree;
			if(rightSubTree == replace) {
				replace.rightNode = null;
			}
			replace.leftNode = searchNode.leftNode;
		}
		
		return true;
	}
	public BSTNode getReplaceRightNode(BSTNode rightNodeRoot) {
		BSTNode searchNode = rightNodeRoot;
		BSTNode parent = rightNodeRoot;
		
		while(searchNode.leftNode != null) {
			parent = searchNode;
			searchNode = searchNode.leftNode;
		}
		parent.leftNode = null;
		return searchNode;
	}
	
	public BSTNode findBST(int key) {
		if(root == null) {
			return null;
		}
		
		BSTNode searchNode = root;
		
		while(searchNode.key != key) {
			if(key < searchNode.key) {
				searchNode = searchNode.leftNode;
			}
			else {
				searchNode = searchNode.rightNode;
			}
			if(searchNode == null) {
				return null;
			}
		}
		return searchNode;
	}
	public void printBSTpreOrder(BSTNode searchNode) {
		if(searchNode != null) {
			System.out.print(searchNode.key + "  ");
			printBSTpreOrder(searchNode.leftNode);
			printBSTpreOrder(searchNode.rightNode);
		}
	}
}
