package sou;

public class A2 {
	
	String a= "i am sourabh";
	int len=a.length();
	public static void main(String []args){
	A2 b=new A2();
	for(int i= b.len-1;i>=0;i--)
		System.out.print(b.a.charAt(i));
}
}
