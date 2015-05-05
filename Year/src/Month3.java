
public class Month3 {
	public String tre_mon(String month){
		switch (month){
		
		case "jan":
			System.out.print("jan no of days 31");
			break;
		case "feb":
			System.out.print("feb no of days is 29");
			break;
		case "mar":
			System.out.print("mar no of days is 29");
			break;
		case "apr":
			System.out.print("apr no of days is 31");
			break;
		case "may":
			System.out.print("may no of days is 30");
			break;
		case "jun":
			System.out.print("jun no of days is 31");
			break;
		case "jul":
			System.out.print("jul no of days is 30");
			break;
			default :
				System.out.print("not valid month");
		}
		
		
		return month;
		
	}

}
