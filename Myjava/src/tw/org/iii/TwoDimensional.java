package tw.org.iii;
/*陣列以樹狀延展開*/
public class TwoDimensional {

	public static void main(String[] args) {
		int[]d = new int[4];
		int[]e = new int[]{1,2,3,4};
		int[]f = {1,2,3,4};
		int[][] a;
		int b [][];
		int []c[];
		a=new int[2][];
		a[0]=new int[3];
		a[1]=new int[2];
		int [][] x={{1,2,3,4},{5,6,7},{8,9}};
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				System.out.print(a[i][j]);
			}
			System.out.println();
		}

	}

}
