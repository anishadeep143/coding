package excp;

public class Exceptionexp extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String str;
	@Override
	public String toString() {
		if(str==null)
		return "age be greater than 15";
		else return str;
	}
	public Exceptionexp(String str) {
		super();
		this.str = str;
	}
	public Exceptionexp(){}
	

}
