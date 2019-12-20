import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class SingletonExample {
	public static SingletonExample exp;
	private SingletonExample() {
		
	}
	
	public static SingletonExample getObject() {
		if (exp == null) {
			System.out.println("in singleton method");
			exp = new SingletonExample();
		}
		return exp;
	}
	
	public <E extends Number> void  add (E one, E two)
	{
		System.out.println(one.doubleValue() + two.doubleValue());
	    //return one.doubleValue() + two.doubleValue(); 
	}
	
	public void print() {
		System.out.println("object method");
	}
	public static void main(String[] args) 
	{
		/*ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(8);
		l.add(3);
		l.add(6);
		
		Iterator<Integer> i = l.iterator();
		while(i.hasNext()) {
			Integer val = i.next();
			if(val % 2 == 0) {
				i.remove();
			}
		}
		
		i = l.iterator();
		while(i.hasNext()) {
			Integer val = i.next();
			if(val % 2 == 0) {
				i.remove();
			}
		}
		l.forEach(ll -> System.out.println(ll));
*/
		CopyOnWriteArrayList<Integer> al = new CopyOnWriteArrayList<Integer>(); 
        al.add(1); 
        al.add(2); 
        al.add(3); 
        al.add(4); 
        al.add(5); 
  
        Iterator<Integer> itr = al.iterator(); 
        while (itr.hasNext()) { 
            if (itr.next() == 2) { 
                // will not throw Exception 
            	itr.remove();
            } 
        } 
  
        System.out.println(al); 
  
        itr = al.iterator(); 
        while (itr.hasNext()) { 
            if (itr.next() == 3) { 
                // will throw Exception on 
                // next call of next() method 
                al.remove(3); 
            } 
        } 
		
	}

}
