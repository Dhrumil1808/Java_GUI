package lec1;
import java.util.Scanner;
public class example {
	public static void main(String[] args)
	{
		//double gpa=3.6;
		Scanner scan=new Scanner(System.in);
		double grades=scan.nextDouble();
		
		if(grades>=3.7)
		{
			System.out.println("Grade is A");
		}
		else if(grades>=3.3 && grades<3.7)
		{
			System.out.println("Grade is B+");
		}
		else
		{
			System.out.println("Grade is B");
		}
		scan.close();
		
		
		
		
	}
	

}
