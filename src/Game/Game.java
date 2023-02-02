package Game;
import input.*;
import Team.*;

import java.util.ArrayList;

public class Game{
    public ArrayList<Team> swap(Team team1, Team team2)
    {
        ArrayList<Team>arr=new ArrayList<Team>();
        arr.add(team2);
        arr.add(team1);
        return arr;
    }
    static private int target;
    private int TeamSize;
    private int Overs;
    public void play()
    {

        TeamSize=InputHelper.getSize();
        Team team1=new Team(TeamSize);
        Team team2=new Team(TeamSize);
        int k=Toss.toss();
        if(k==21)
        {
            ArrayList<Team>arr=swap(team1,team2);
            team1=arr.get(0);
            team2=arr.get(1);
        }
        team1.play(false,team1);
        System.out.println("\n--------");
        System.out.println("end of innings");
        target=team1.getScore()+1;
        System.out.println("The target for "+team2.getTeamname()+" set by "+team1.getTeamname()+" is "+target);
        System.out.println("--------");
        team2.play(true,team2);
        System.out.println("\n--------");
        team1.getOverall();
        System.out.println("--------");
        team2.getOverall();
        EndOfGame.getWinner(team1,team2);

    }

    static public int getTarget() {
        return target;
    }

}



