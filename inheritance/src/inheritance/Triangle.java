package inheritance;

import java.util.Scanner;

public class Triangle extends Rectangle {
	float lenth,height;
	public  double  hei= 0.5;
double trai;
	
public	Triangle(){
	super();
	System.out.println("enter the value of traingle");
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the lenght :");
	lenth=sc.nextInt();
	Scanner b=new Scanner(System.in);
	System.out.print("enter the height :");
	height=sc.nextInt();
	try{
	double	trai= (hei * lenth * height);
	}
	catch(Exception e){
		System.out.println("not a valid input");
	}
}
public void train(){
	super.rec();
	
	System.out.print("the area of traingle :"  +trai);
}


}
