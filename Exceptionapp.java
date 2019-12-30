package excp;

public class Exceptionapp {
	private int age;
	private String ename;
	public Exceptionapp(int age, String ename) {
		super();
		this.age = age;
		this.ename = ename;
	}
	@Override
	public String toString() {
		return "Exceptionapp [eid=" + age + ", ename=" + ename + "]";
	}
	public Exceptionapp(){}
	public void verifyExp() throws Exceptionexp{
		if(age<15)
		throw new Exceptionexp("age should be greater than 15");
		else 
			System.out.println("succesfull");
		
	}
	public static void main(String[] args) {
		Exceptionapp e1=new Exceptionapp(1,"abc");
		Exceptionapp e2=new Exceptionapp(17,"xyz");
		try {
			e1.verifyExp();
			e2.verifyExp();
		} catch (Exceptionexp e) {
			// TODO Auto-generated catch block
			System.out.println(e);;
		}
	
		
	}

}
