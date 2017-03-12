package tw.org.iii;

public class TwoDimen2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] a={{1,2,3,4},{5,6,7},{8,9}};
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		//用for-each代替
		for(int i[]:a){
			for(int j:i){
				System.out.print(j);
			}
			System.out.println();
		}
		
	}

}
