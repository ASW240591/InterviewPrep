import java.util.ArrayList;
import java.util.List;

public class JavaEigthPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArithmaticExpression sum = (a,b) ->  a+b ;
		ArithmaticExpression multiply = (a,b) ->  a*b ;
		ArithmaticExpression division = (a,b) ->  b/a ;
		ArithmaticExpression subtract = (a,b) ->  b-a ;
		
		System.out.println(sum.job(5, 10));
		System.out.println(multiply.job(5, 10));
		System.out.println(division.job(5, 10));
		System.out.println(subtract.job(5, 10));
		
		List<Footballers> playerProfiles = new ArrayList<>();
		playerProfiles.add(new Footballers(21, "Cristiano", "Juventus"));
		playerProfiles.add(new Footballers(25, "Messi", "Barcelona"));
		playerProfiles.add(new Footballers(15, "Neymar", "PSG"));
		playerProfiles.add(new Footballers(12, "Hazard", "Real Madrid"));
		playerProfiles.add(new Footballers(10, "Modric", "Real Madrid"));
		playerProfiles.add(new Footballers(11, "Bale", "Real Madrid"));
		playerProfiles.add(new Footballers(13, "Salah", "Liverpool"));
		playerProfiles.add(new Footballers(9, "Firmino", "Liverpool"));
		playerProfiles.add(new Footballers(8, "Gerard", "Liverpool"));
		playerProfiles.add(new Footballers(12, "Suarez", "Barcelona"));
		playerProfiles.add(new Footballers(14, "Mbape", "PSG"));
		
//		playerProfiles
	}

}

interface ArithmaticExpression {
	int job(int a, int b);
}


class Footballers {
	String clubName;
	String playerName;
	int goals;
	
	public Footballers(int go,String clbNme,String name) {
		goals = go;
		clubName = clbNme;
		playerName = name;		
	}
	
}