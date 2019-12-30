package coding5;

import java.util.Scanner;

public class Code4exp {
	private String fname;
	private String lname;
	
public Code4exp(String fname, String lname) {
		super();
		this.fname = fname;
		this.lname = lname;
	}

@Override
public String toString() {
	return "Code4exp [fname=" + fname + ", lname=" + lname + "]";
}
    public void Verify() throws Code4{
    	
	if(fname==null || lname==null || fname=="" || lname=="")
	{
		throw new Code4("name cannot be null");
	}
	else System.out.println("successful");
}
    

public static void main(String[] args) {
	String fname;
	String lname;
	Scanner scan=new Scanner(System.in);
	do {
	System.out.println("do you want to enter first name(1/0)");
	byte ch=scan.nextByte();
	 fname=null;
	
	if(ch==1){
	System.out.print("enter the first name:");
	fname=scan.next();
	if(!fname.matches("[A-Z]*[a-z]*"))
	{
		System.out.println("enter a valid first name");
		continue;
	}
	else{
		break;
	}
	}
	}while(true);
	do{
	System.out.println("do you want to enter last name(1/0)");
	byte ch1=scan.nextByte();
	lname=null;
	
	if(ch1==1){
	System.out.print("enter the last name:");
	lname=scan.next();
	if(!lname.matches("[A-Z]*[a-z]*"))
	{
		System.out.println("enter a valid last name");
		continue;
	}
	else {
		break;
	}
	}
	}while(true);
	Code4exp e=new Code4exp(fname,lname);

	try {
		e.Verify();
	} catch (Code4 e1) {
		// TODO Auto-generated catch block
		System.out.println(e1);;
	}
}
}
