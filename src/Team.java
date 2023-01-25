public class Team extends Gamehelp {
    private int score;
    private int balls;
    private int wickets;

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
}
