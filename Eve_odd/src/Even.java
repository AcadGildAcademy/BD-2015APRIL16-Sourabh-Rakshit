import java.util.Scanner;


public class Even {
public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("enter the number :");
	int num= sc.nextInt();
	System.out.println(num + " :-"+"this is the entered number");
	if(num%2==0){
		System.out.print(num+ " :" +"the no is even ");
		
	}
	else
		System.out.print(num +" :"+"the no is odd");
	
	
}
}
