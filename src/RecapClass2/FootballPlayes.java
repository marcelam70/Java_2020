package RecapClass2;

public class FootballPlayes extends Athlete {
       String team;
public FootballPlayes(String name, int age, String team) {
	super(name, age);
	this.team = team;
	System.out.println("Name: " + name +"\nAge: " + age + "\nTeam:" + team);
	}
@Override
public void game(){
	System.out.println("Football player is playing soccer......");
}
@Override
public void run(){
	System.out.println("Football player is running....");
}

}
