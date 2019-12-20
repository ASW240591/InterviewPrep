import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class HackerEarth {

	public static void main(String args[]) {
			@SuppressWarnings("resource")
			Scanner s = new Scanner(System.in);
	        int size = s.nextInt();
	       // System.out.println(size);
	        ArrayList<Integer> l = new ArrayList<Integer>();
	        for(int i = 0 ; i < size ; i++){
	            l.add(s.nextInt());
	        }
	        Collections.sort(l);
	        //System.out.println(l.get(0));
	        /*HashMap m = new HashMap<Integer,Integer>();
	        for(int i = 0 ; i < size ; i++){
	            if(m.get(l.get(i))== null){
	                m.put(l.get(i),1);
	            }else{
	                m.put(l.get(i),(Integer)m.get(l.get(i))+1);
	            }
	        }
	        for(int i = 0 ; i < size ; i++){
	            if((Integer)m.get(l.get(i)) == 1){
	                System.out.println(l.get(i));
	                break;
	            }
	        }*/
	        l.forEach(System.out::println);
	        for(int i = 0 ; i < size ; i++) {
	        	if(!(l.get(i).equals(l.get(i+1)))) {
	        		System.out.println(l.get(i+1));
	        		break;
	        	}
	        }
		
		/*Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        
        int[] tempArray = new int[size];
        for(int i = 0 ; i < size ; i++){
            tempArray[s.nextInt()];
        }
        
        int mapKey = 0;
        int tempArrayIndex =0;
        int requiredNumber = 0;
       
        Map<Integer,Integer> duplicateElementsHolder = new HashMap<Integer, Integer>();
        Arrays.sort(a);
        for(int y=0; y<a.length-1; y++){
        if(a[y]==a[y+1]){
        duplicateElementsHolder.put(mapKey, a[y]);
        mapKey++;
        }
        }
        Set<Integer> nonDuplicateElements = new HashSet<Integer>();
        for(int j:a){
        nonDuplicateElements.add(j);
        }
       
        for(int d1 : nonDuplicateElements){
        tempArray[tempArrayIndex]=d1;
        tempArrayIndex++;
        }
       
        for (int h1 = 0; h1 < tempArray.length - 1; h1++) {
        
        if (!(duplicateElementsHolder.containsValue(tempArray[h1]))) {
        requiredNumber = tempArray[h1];
        break;
        }
        }
       
        System.out.println(requiredNumber);
*/
	}
}
