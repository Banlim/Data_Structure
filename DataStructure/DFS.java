import java.util.ArrayList;
import java.util.Scanner;

public class DFS {
	private boolean[] visitArr;
	private ArrayList<ArrayList<Integer>> adjustList;
	private int [][] matrixList;
	
	public void initVisitArr(int vCnt) {
		visitArr = new boolean[vCnt];
		for(int i = 0; i < this.visitArr.length; i++) {
			this.visitArr[i] = false;
		}
	}
	
	public void initDfsAdjust(ArrayList<ArrayList<Integer>> adjustList) {
		initVisitArr(adjustList.size());
		this.adjustList = adjustList;
		Scanner scan = new Scanner(System.in);
		System.out.println("탐색 시작할 정점 입력 : ");
		int vIdx = scan.nextInt();
		scan.close();
		DfsAdjust(vIdx);
	}
	
	public void initDfsMatrix(int [][] matrixList) {
		initVisitArr(matrixList.length);
		this.matrixList = matrixList;
		Scanner scan = new Scanner(System.in);
		System.out.println("탐색 시작할 정점 입력 : ");
		int vIdx = scan.nextInt();
		scan.close();
		DfsMatrix(vIdx);
	}
	
	private void DfsAdjust(int vIdx) {
		this.visitArr[vIdx-1] = true;
		System.out.print(vIdx + "  ");
		for(int i : this.adjustList.get(vIdx-1)) {
			if(this.visitArr[i] == false) {
				DfsAdjust(i+1);
			}
		}
	}
	
	private void DfsMatrix(int vIdx) {
		this.visitArr[vIdx - 1] = true;
		System.out.print(vIdx + "  ");
		for(int i = 0; i < this.matrixList.length; i++) {
			if(this.matrixList[vIdx-1][i] == 1 && visitArr[i] == false) {
				DfsMatrix(i+1);
			}
		}
	}
}
