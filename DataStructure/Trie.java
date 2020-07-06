import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class Trie {
	private class TrieNode{
		String key;
		int value;
		boolean isTerminal;
		TrieNode[] child;
		
		public TrieNode[] getChildren() {
			return this.child;
		}
		public TrieNode(String key) {
			this.key = key;
			this.child = new TrieNode[alphabet_size];
		}
		public boolean isTerminal() {
			return isTerminal;
		}
		public void setTerminal(boolean isTerminal) {
			this.isTerminal = isTerminal;
		}
		public TrieNode getChild(int index) {
			return child[index];
		}
		public void setChild(int index, TrieNode child, int value) {
			child.value = value;
			this.child[index] = child;
		}
		
	}
	private TrieNode root;
	private int num = 1;
	final int alphabet_size = 26;
	
	public void init() {
		root = new TrieNode("");
	}
	
	public void inputString(String s) {
		TrieNode currentNode = this.root;
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			int idx = convertASCII(c);
			if(currentNode.getChild(idx) == null) {
				TrieNode newNode = new TrieNode(String.valueOf(c));
				currentNode.setChild(idx, newNode, num);
				currentNode = newNode;
			}
			else {
				currentNode = currentNode.getChild(idx);
			}
		}
		num++;
		currentNode.setTerminal(true);
	}
	public boolean search(String s) {
		TrieNode currentNode = this.root;
		for(int i = 0; i < s.length(); i++) {
			int idx = convertASCII(s.charAt(i));
			if(currentNode.getChild(idx) == null)
				return false;
			else
				currentNode = currentNode.getChild(idx);
		}
		return true;	
	}
	public void printSearchAllString(String preStr) {
		List<String> result = searchAllString(preStr);
		System.out.println(preStr + " : " + result);
	}
	public List<String> searchAllString(String preStr){
		TrieNode currentNode = this.root;
		List<String> result = new ArrayList<>();
		for(int i = 0; i < preStr.length(); i++) {
			int idx = convertASCII(preStr.charAt(i));
			if(currentNode.getChild(idx) == null) {
				System.out.println("해당 String 존재 X");
				return result;
			}
			currentNode = currentNode.getChild(idx);
		}
		collect(currentNode, preStr, result);
		return result;
	}
	private void collect(TrieNode node, String preStr, List<String> result) {
		if(node == null)
			return;
		if(node.isTerminal()) {
			result.add(preStr);
		}
		for(TrieNode childNode : node.getChildren()) {
			if(childNode == null) {
				continue;
			}
			String childChar = childNode.key;
			collect(childNode, preStr + childChar, result);
		}
	}

	private int convertASCII(char c) {
		return c - 'a';
	}
}
