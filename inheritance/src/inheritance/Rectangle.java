package inheritance;

import java.util.Scanner;

public class Rectangle {
	
int rec,a,b;

public	 Rectangle(){
	System.out.println("rectangle");
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the length : "  );
	 a=sc.nextInt();
	System.out.print("enter the breadth : ");
	 b=sc.nextInt();
	
	
	try{
	 rec=(a * b);
	}
	catch(Exception e){
		System.out.print("invalid input");
		
	}
	
	}

public void rec(){
	
	System.out.println("area of rectangle is :" +rec);
}

}
