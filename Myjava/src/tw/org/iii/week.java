package tw.org.iii;
import javax.swing.JOptionPane;
public class week {

	public static void main(String[] args) {
				String input=JOptionPane.showInputDialog("請輸入年分");
				int year=Integer.parseInt(input);
				input=JOptionPane.showInputDialog("請輸入月分");
				int month =Integer.parseInt(input); 
				input=JOptionPane.showInputDialog("請輸入日期");
				int days = Integer.parseInt(input);
				if(days>0&&days<=31&&month>0&&month<=12&&year>=1900){
					date(year,month,days);}
				else if(month>0&&month<=12&&year>=1900)
					month(year,month);
				else if(year>=1900)
					year(year);
				else
					System.out.println("輸入錯誤");
			}
			static void date(int year,int month,int dat){
				System.out.print(year+"/"+month+"/"+dat);
				int[] M={31,0,31,30,31,30,31,31,30,31,30,31};
				if ((year%400==0)||(year%4==0)&&(year%100!=0)){
					    M[1]=29;
					 }else{
					    M[1]=28;
				}
				int y = (year-1900)*365;		
				for(int i=1900;i<year;i++){
					if ((i%400==0)||(i%4==0)&&(i%100!=0)){
					    y++;}		
				}
				for(int j=1;j<month;j++){
					y=y+M[j-1];
				}
				int a=(y%7)+dat;
				switch(a%7){
					case 1:
						System.out.println("為禮拜一");
						break;
					case 2:
						System.out.println("為禮拜二");
						break;
					case 3:
						System.out.println("為禮拜三");
						break;
					case 4:
						System.out.println("為禮拜四");
						break;
					case 5:
						System.out.println("為禮拜五");
						break;
					case 6:
						System.out.println("為禮拜六");
						break;
					case 7:
						System.out.println("為禮拜日");
						break;			
				}		
			}
			static void month(int year ,int month){
				
				System.out.println(year+"/"+month);
				System.out.println("日\t一\t二\t三\t四\t五\t六");	
				int[] M={31,0,31,30,31,30,31,31,30,31,30,31};
				if ((year%400==0)||(year%4==0)&&(year%100!=0)){
					    M[1]=29;
					 }else{
					    M[1]=28;
				}
				int y = (year-1900)*365;		
				for(int i=1900;i<year;i++){
					if ((i%400==0)||(i%4==0)&&(i%100!=0)){
					    y++;}		
				}
				for(int j=1;j<month;j++){
					y=y+M[j-1];
				}
				for(int k=1;k<=y%7+1;k++){
					System.out.print(" \t");
				}
				for(int l=1;l<=M[month-1];l++){
					System.out.print(l+"\t");
					if((l+(y+1))%7==0)
						System.out.println();
				}		
			}
			static void year(int year){
				int[] M={31,0,31,30,31,30,31,31,30,31,30,31};
				if ((year%400==0)||(year%4==0)&&(year%100!=0)){
					    M[1]=29;
					 }else{
					    M[1]=28;
				}
				int y = (year-1900)*365;		
				for(int i=1900;i<year;i++){
					if ((i%400==0)||(i%4==0)&&(i%100!=0)){
					    y++;}		
				}
				for(int month=1;month<=12;month++){
					System.out.println(year+"/"+month+"月");
					System.out.println("日\t一\t二\t三\t四\t五\t六");
					for(int j=1;j<month;j++){
						y=y+M[j-1];
					}
					for(int k=1;k<=((y+1)%7);k++){
						System.out.print(" \t");
					}
					for(int l=1;l<=M[month-1];l++){
						System.out.print(l+"\t");
						if((l+(y+1))%7==0)
							System.out.println();
					}
					System.out.println();
					System.out.println();
					y = (year-1900)*365;		
					for(int i=1900;i<year;i++){
						if ((i%400==0)||(i%4==0)&&(i%100!=0)){
						    y++;}		
					}
				}
				
			} 
	}
class re{
	 void year(){
		
	}	
	 void year(int a){
		 year();
	 }
	 void year(int a,int x){
		this.year();
	 }
}
