package vote;

public class Elig_age {
	public int eli_age(int age){
		if(age<=0){
			System.out.print("entered age is not valid");
		}
		else if(age<=16){
			System.out.print("to young to vote");
		}
		else if(age==17){
			System.out.print("one more year to go");
		}
		else if(age>=18){
			System.out.println("welcome to vote");
		}
		return age;
		
		
		
	}

}
