import java.util.Scanner;



public class Month {

	 public static String month;
	public static void main (String[] args){
		
		
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the month:" );
		 month=sc.nextLine();
		 if(month.length()>3){
		 Month2 m=new Month2();
		 String days= m.str_month(month);
		 }
		 else if(month.length()==3) {
			 Month3 m3= new Month3();
			 String days= m3.tre_mon(month);
		 }
		 else if(month.length()<=2){
		 month1 m1= new month1();
		int no = Integer.parseInt(month);
		int nu= m1.num_month(no);}
		
		 
		
		 
	}

}
