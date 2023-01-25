public class EndOfGame {
    static void getWinner(Team team1,Team team2){
        System.out.println("\n"+"ScoreCard:");
        System.out.println(team1.getScore()+" "+team1.getWickets());
        System.out.println(team2.getScore()+ " "+team2.getWickets());
        System.out.print("\n"+"The winner is ");
        if(team1.getScore()>team2.getScore())
        {
            System.out.println("One");
        }
        else
        {
            if(team2.getScore()>team1.getScore())
            {
                System.out.println("Second");
            }
            else
                System.out.println("Draw");
        }
    }

}
