package coding;

import java.util.Scanner;

public class code4 {
	boolean checkNumber(int n){
		boolean b=false;
		for(int i=0;i<n;i++)
		{
			if(Math.pow(2, i)==n)
			{
				b=true;
			}
			
		}
		return b;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		code4 c=new code4();
		System.out.println(c.checkNumber(n));
		sc.close();
		
		
	}

}
