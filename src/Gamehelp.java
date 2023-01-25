public class Gamehelp {
    public void play(boolean chasing, Team team)
    {
        int balls=team.getBalls();
        int score = team.getScore();
        int wickets = team.getWickets();
        while (balls <= 120 && team.getWickets() < 10) {
            int index = (int) (Math.random() * 8);
            String event = Integer.toString(index);
            if (index == 7) {
                event = "W";
                wickets++;
                team.setWickets(wickets);
            } else {
                score+=index;
                team.setScore(score);
            }
            balls++;
            System.out.print(event + " ");
            if (balls % 6 == 0) {
                System.out.print("\n");
            }

            if(chasing && team.getScore()>=Game.getTarget())
                break;
        }

    }

}
