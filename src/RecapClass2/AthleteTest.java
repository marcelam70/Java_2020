package RecapClass2;

public class AthleteTest {

	public static void main(String[] args) {
	
		Athlete athlete = new Athlete();
		System.out.println("*********");
		FootballPlayes footballPlayes = new FootballPlayes("Ronaldo", 34, "Juventus");
		System.out.println("He is a football player");
		footballPlayes.game();
		footballPlayes.run();
		
		System.out.println("***********");
		BasketballPlayer basketballPlayer = new BasketballPlayer("LeBron", 31, "LA Lakers", false);
		System.out.println("He is basket player");
		basketballPlayer.game();
		basketballPlayer.run();

	}

}
