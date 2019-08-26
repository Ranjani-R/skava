package gradingSystem;import java.util.Scanner;

public class Students {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int num=scan.nextInt();
		float sum=0,avg;
		for(int j=0;j<n;j++) {
			
		   String name=scan.next();
		for(int i=1;i<=num;i++)
		{
			int mark=scan.nextInt();
			sum=sum+mark;
		}
		avg=sum/num;
		//System.out.print(avg);
		if(avg>=75)
		{
			System.out.print("Disctinction");
		}
		else if(avg>=60){
			System.out.print("First Class");
		}
		else if(avg>=50) {
			System.out.print("Second class");
		}
		else if(avg>=40) {
			System.out.print("Third class");
			
		}
		else {
			System.err.print("Failed");
		}
		}	
		}
		
		

	

}
