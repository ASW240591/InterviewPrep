

class MutliplicationTableClass{
	public void tableNumber(int num) {
		for(int i = 1; i <=10;i++) {
			System.out.println(num + " X " + i + " = "+ i*num);
		}
	}
}

public class MultiplicationTable {

	public static void main(String args[])  {
		MutliplicationTableClass m = new MutliplicationTableClass();
		m.tableNumber(2);
		AlphabetPrint a = new AlphabetPrint();
		a.printAlphabets();
		Object o = new String("Abhijeet");
		
		System.out.println(o);
		
	}
}

class AlphabetPrint{
	public void printAlphabets() {
		for (char val = 'a'; val <='z' ; val++) {
			System.out.println(val);
		}
	}
}

class UserArithmaticException extends ArithmeticException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UserArithmaticException(String msg) {
		super(msg);
	}
}