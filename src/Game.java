
public class Game{
    static private int target;
    public void play()
    {
        Team team1=new Team();
        team1.play(false,team1);
        System.out.println("end of innings");
        target=team1.getScore()+1;
        Team team2=new Team();
        team2.play(true,team2);
        EndOfGame.getWinner(team1,team2);
    }

    static public int getTarget() {
        return target;
    }

}



