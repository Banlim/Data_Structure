import java.util.ArrayList;

public class WeightGraph {

	private class WeightEdge{
		int weight;
		int yVertex;
		public WeightEdge(int weight, int yVertex) {
			this.weight = weight;
			this.yVertex = yVertex;
		}
		
	}
	
	private ArrayList<ArrayList<WeightEdge>> adjustList;
	private int [][] matrixList;
	
	public void adjustInit(int vCnt) {
		this.adjustList = new ArrayList<ArrayList<WeightEdge>>();
		for(int i = 0; i < vCnt; i++) {
			this.adjustList.add(new ArrayList<WeightEdge>());
		}
	}
	public void matrixInit(int vCnt) {
		this.matrixList = new int[vCnt][vCnt];
	}
	public void insertAdjust(int x, int y, int weight) {
		this.adjustList.get(x-1).add(new WeightEdge(weight, y));
		this.adjustList.get(y-1).add(new WeightEdge(weight, x));
	}
	public void insertAdjustSingle(int x, int y, int weight) {
		this.adjustList.get(x-1).add(new WeightEdge(weight, y));
	}
	public void printAdjust() {
		for(int i = 0; i < this.adjustList.size(); i++) {
			System.out.print(i+1);
			for(int j = 0; j < this.adjustList.get(i).size(); j++) {
				System.out.print(" -> [E] " + this.adjustList.get(i).get(j).yVertex + ", [W] " + this.adjustList.get(i).get(j).weight);
			}
			System.out.println();
		}
	}
	public void insertMatrix(int x, int y, int weight) {
		this.matrixList[x-1][y-1] = weight;
		this.matrixList[y-1][x-1] = weight;
	}
	public void insertMatrixSingle(int x, int y, int weight) {
		this.matrixList[x-1][y-1] = weight;
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
