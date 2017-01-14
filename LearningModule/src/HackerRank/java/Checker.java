package HackerRank.java;

import java.util.Comparator;

class Checker implements Comparator<Player> {
    
	
	@Override
	public int compare(Player a, Player b) {

		int c=0;
		int score1=a.score;
		int score2=b.score;
String name1=a.name;
String name2=b.name;

if(score1>score2)
{
	c=-1;
	
	}
else if(score2>score1){
	c=1;
	
}
else 
	c=name1.compareTo(name2);
		
	
return c;
	}
    
}