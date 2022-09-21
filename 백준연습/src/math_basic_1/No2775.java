package math_basic_1;

public class No2775 {
	
	public static void main(String[] args) {
	
		int[][] n = new int[15][15];
		for(int i=0; i<15; i++) {
			for(int j=0; j<15;j++) {
				n[i][j] = i==0 ? j : n[i][j-1] + n[i-1][j];
				n[i][j] = j==0 ? 0 : n[i][j-1] + n[i-1][j];
			}
		}
		for(int i=0; i<15; i++) {
			for(int j=0; j<15;j++) {
				System.out.printf("%d ",n[i][j]);
			}
			System.out.println();
		}
		
	}
}
