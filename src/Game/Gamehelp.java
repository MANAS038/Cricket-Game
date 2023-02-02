package Game;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.lang.Object.*;
import Team.*;
public class Gamehelp {
    public void play(boolean chasing, Team team)
    {
        int balls=team.getBalls();
        int score = team.getScore();
        int wickets = team.getWickets();
        int strike=0,nonstrike=1,next=2;
        ArrayList<Player>players=team.getPlayers();
        while (balls <= 120 && team.getWickets() < team.getTeamsize()) {
            int index = (int) (Math.random() * 20);
            Player current=players.get(strike);

            String event=players.get(strike).Event.get(index);
            if (event.equals("W")){
                wickets++;
                System.out.print("Its a wicket "+current.getName()+" is out :(    ");
                if(next<team.getTeamsize()){
                strike=next;
                next++;
                }
                else
                    strike=nonstrike;
                team.setWickets(wickets);
                current.setBallsFaced(current.getBallsFaced()+1);
            } else {
                int runOnCur=Integer.parseInt(event);
                int scoreByCurrent=current.getRunsScored();
                current.setRunsScored(scoreByCurrent+runOnCur);
                current.setBallsFaced(current.getBallsFaced()+1);
                if(runOnCur%2==1 && nonstrike< team.getTeamsize())
                {
                    int temp=strike;
                    strike=nonstrike;
                    nonstrike=temp;
                }
                if(runOnCur==4)
                {
                    current.setFours(current.getFours()+1);
                }
                if(runOnCur==6)
                    current.setSixes(current.getSixes()+1);
                score+=Integer.parseInt(event);
                team.setScore(score);
            }
            balls++;
            if(!event.equals("W"))
            System.out.print(event + " ");
            if (balls % 6 == 0 ) {
                System.out.print("\n");
                if(nonstrike< team.getTeamsize()){
                int temp=strike;
                strike=nonstrike;
                nonstrike=temp;
                }
            }
            if(chasing && team.getScore()>=Game.getTarget())
                break;
        }

    }

}
