import java.util.ArrayList;
import java.util.Scanner;

public class NoWeightGraph {
	
	private ArrayList<ArrayList<Integer>> adjustList;
	private int [][] matrixList;
	
	public void adjustInit(int vCnt) {
		this.adjustList = new ArrayList<ArrayList<Integer>>();
		for(int i = 0; i< vCnt; i++) {
			this.adjustList.add(new ArrayList<Integer>());
		}
	}
	public void matrixInit(int vCnt) {
		this.matrixList = new int[vCnt][vCnt];
	}

	public void insertAdjustSingle(int x, int y) {
			this.adjustList.get(x-1).add(y-1);
	}
	public void insertAdjust(int x, int y) {
			this.adjustList.get(x-1).add(y-1);
			this.adjustList.get(y-1).add(x-1);
	}
	public void printAdjustGraph() {
		for(int i = 0; i < this.adjustList.size(); i++) {
			System.out.print(i + 1);
			for(int j = 0; j < this.adjustList.get(i).size(); j++) {
				System.out.print(" -> " + (this.adjustList.get(i).get(j)+1));
			}
			System.out.println();
		}
	}
	public void insertMatrixSingle(int x, int y) {
		this.matrixList[x-1][y-1] = 1;
	}
	public void insertMatrix(int x, int y) {
		this.matrixList[x-1][y-1] = 1;
		this.matrixList[y-1][x-1] = 1;
	}
	public void printMatrix() {
		for(int i = 0; i < this.matrixList.length; i++) {
			for(int j = 0; j < this.matrixList.length; j++) {
				System.out.print(this.matrixList[i][j] + "  ");
			}
			System.out.println();
		}
	}

}
