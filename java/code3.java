package coding;

import java.util.Scanner;

public class code3 {
	boolean checkNumber(int n){
		boolean bool=true;
		int rev,rev2;
		
		for(int i=0;i<n;i++)
		{
			rev=n%10;
			n=n/10;
			for(int j=0;j<n;j++)
			{
			rev2=n%10;
			if(rev2>rev)
			{
				return false;
			}
			n=n/10;
			
			}
		}
		return bool;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	code3 c=new code3();
	System.out.println(c.checkNumber(n));
	
	
}
}
