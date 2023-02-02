package Team;
import java.util.ArrayList;
import java.util.Scanner;
import Game.*;
import input.*;
public class Team extends Gamehelp {
    private int score;
    private int balls;
    private int wickets;
    private String Teamname;
    private int Teamsize;
    private ArrayList<Player>players;

    public String getTeamname() {
        return Teamname;
    }

    public int getTeamsize() {
        return Teamsize;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }
    public Player getPlayer(int index)
    {
        return players.get(index);
    }
    public Team(int TeamSize)
    {
        this.Teamname=InputHelper.getTeamname();
        this.Teamsize=TeamSize;
        this.players=InputHelper.getPlayers(Teamsize);
    }
    public int getBalls() {
        return balls;
    }

    public void setBalls(int balls) {
        this.balls = balls;
    }

    public void setWickets(int wickets)
    {
        this.wickets=wickets;
    }
    public void setScore(int score)
    {
        this.score=score;
    }
    public int getWickets()
    {
        return wickets;
    }
    public int getScore()
    {
        return score;
    }
    public void getOverall()
    {
//        System.out.printf("%8s %15s %25s %10s %10s %15s", "PLAYER NAME", "RUNS SCORED", "BALLS FACED", "4s", "6s", "STRIKE RATE");
//        System.out.println("\n");

        for(Player p: players)
        {
            p.setBallsFaced(Math.max(1,p.getBallsFaced()));
            System.out.println(p.getName()+" "+p.getRunsScored()+"("+p.getBallsFaced()+")"+" 4s scored "+p.getFours()+" 6s Scored "+p.getSixes()+" Strike Rate is: "+((double)p.getRunsScored()/p.getBallsFaced())*100);
//            System.out.format("%8s %15s %25s %10s %10s 15s", player.getName(), player.getRunsScored(), player.getBallsFaced(), player.getFours(), player.getSixes(),((double)player.getRunsScored()/player.getBallsFaced())*100);
//            System.out.print("\n");
        }
    }
}
