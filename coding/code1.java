package coding;

import java.util.Scanner;

public class code1 {
	int calculateSum(int n){
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(i%3==0 || i%5==0)
			{
				sum=sum+i;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	code1 c=new code1();
	System.out.println("sum is"+c.calculateSum(n));
	sc.close();
	}
	
 

}
