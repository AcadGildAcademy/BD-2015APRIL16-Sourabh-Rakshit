
public class month1 {

	public int num_month(int no){
		switch (no){
		case 1:
			System.out.print("january is of 31 days");
			break;
		case 2:
			System.out.print("february is of 28 days");
			break;
		case 3:
			System.out.print("march is of 31 days");
			break;
		default :
			System.out.print("not valid");
		}
		return no;
	}
}
