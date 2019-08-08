import java.util.Scanner;

public class Compound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the principle investment amount");
		int p=sc.nextInt();
		System.out.println("Enter the  annual interest rate ");
		int r=sc.nextInt();
		System.out.println("Enter the number of times that interest in compound per year");
		int n=sc.nextInt();
		System.out.println("Enter the number of year the money is invested ");
		int t= sc.nextInt();
		double A= p*(1+r/n)*Math.pow(n,t);
		System.out.println("Compound::::="+A);
			
	}

}
