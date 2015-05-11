package vote;

import java.util.Scanner;

public class Vote_main {

	public static void main(String [] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("entered age is:");
		int age=sc.nextInt();
		Elig_age ag=new Elig_age();
		age=ag.eli_age(age);
		
		
		
	}
}
