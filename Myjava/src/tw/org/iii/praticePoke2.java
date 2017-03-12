package tw.org.iii;

public class praticePoke2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] poke=new int[20];
		int temp;
		for(int i=0;i<poke.length;i++)
			poke[i]=i+1;			
		for(int j=poke.length-1;j>=0;j--){
			temp=(int)(Math.random()*j);
			if(poke[j]==poke[temp]){			
			}else{
				int temp2=poke[temp];
				poke[temp]=poke[j];
				poke[j]=temp2;				
			}
			System.out.println(poke[j]);
		}	
	}
}
