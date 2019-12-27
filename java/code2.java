package coding;

import java.util.Scanner;

public class code2 {
	int calculateDifference(int n)
	{
		int sum=0;
		int sum2=0;
		int dif;
		for(int i=1;i<=n;i++)
		{
			sum=sum+(i*i);
			sum2=sum2+i;
		}
		dif=sum-(sum2*sum2);
		return dif;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		code2 c=new code2();
		System.out.println("sum is "+c.calculateDifference(n));
		
		
	}

}
