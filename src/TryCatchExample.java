
class UserDefinedException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public UserDefinedException(String s) {
		super(s);
	}
	
}


public class TryCatchExample {

	@SuppressWarnings("finally")
	public int checkExceptions() {
		try {
			throw new UserDefinedException("first exception");
			//return 1;
		}catch(UserDefinedException e) {
			System.out.println("caught");
			System.out.println(e.getMessage());
		}finally {
			return 2;
		}
	}
	
	
	
	public static void main(String args[]) {
		TryCatchExample t = new TryCatchExample();
		System.out.println(t.checkExceptions());
	}
}
