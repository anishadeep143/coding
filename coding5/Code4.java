package coding5;

public class Code4 extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String str;
	public Code4(String str) {
		super();
		this.str = str;
	}
	@Override
	public String toString() {
		if(str==null)
		return "name cannot be null";
		else return str;
	}
 public Code4(){}
 
	

}
