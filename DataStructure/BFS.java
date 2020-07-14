import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class BFS {
	private boolean [] visitArr;
	private ArrayList<ArrayList<Integer>> adjustList;
	private int [][] matrixList;
	
	private void initVisitArr(int vCnt) {
		visitArr = new boolean[vCnt];
		for(int i = 0; i < this.visitArr.length; i++) {
			this.visitArr[i] = false;
		}
	}
	public void initBfsAdjust(ArrayList<ArrayList<Integer>> adjustList) {
		initVisitArr(adjustList.size());
		this.adjustList = adjustList;
		Scanner scan = new Scanner(System.in);
		System.out.println("탐색 시작할 정점 입력 : ");
		int vIdx = scan.nextInt();
		scan.close();
		BfsAdjust(vIdx);
	}
	public void initBfsMatrix(int [][] matrixList) {
		initVisitArr(matrixList.length);
		this.matrixList = matrixList;
		Scanner scan = new Scanner(System.in);
		System.out.println("탐색 시작할 정점 입력 : ");
		int vIdx = scan.nextInt();
		scan.close();
		BfsMatrix(vIdx);
	}
	private void BfsAdjust(int vIdx) {
		LinkedList<Integer> q = new LinkedList<>();
		q.add(vIdx-1);
		visitArr[vIdx-1] = true;
		while(!q.isEmpty()) {
			int current = q.remove();
			System.out.print((current+1) + "  ");
			for(int i : adjustList.get(current)) {
				if(visitArr[i])
					continue;
				visitArr[i] = true;
				q.add(i);
			}
		}
	}
	private void BfsMatrix(int vIdx) {
		LinkedList<Integer> q = new LinkedList<>();
		q.add(vIdx-1);
		visitArr[vIdx-1] = true;
		while(!q.isEmpty()) {
			int current = q.remove();
			System.out.print((current+1) + "  ");
			for(int i = 1; i <= visitArr.length; i++) {
				if(matrixList[current][i-1] == 0 || visitArr[i-1])
					continue;
				q.add(i-1);
				visitArr[i-1] = true;
			}
				
			}
	}
}
