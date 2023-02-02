package Game;
import Team.*;
public class EndOfGame {
    static void getWinner(Team team1,Team team2){
        System.out.println("\n"+"ScoreCard of Team "+team1.getTeamname()+" is: ");
        System.out.println(team1.getScore()+" "+team1.getWickets());
        System.out.println("\n"+"ScoreCard of Team "+team2.getTeamname()+" is: ");
        System.out.println(team2.getScore()+ " "+team2.getWickets());
        System.out.print("\n"+"The winner is ");
        if(team1.getScore()>team2.getScore())
        {
            System.out.println(team1.getTeamname());
        }
        else
        {
            if(team2.getScore()>team1.getScore())
            {
                System.out.println(team2.getTeamname());
            }
            else
                System.out.println("Draw");
        }
    }

}
