package Team;
public class Bowler extends Player{

    public static void Eventinit(Player player)
    {
        for(int i=0;i<2;i++)
        {
            player.Event.add("6");
        }
        for(int i=0;i<8;i++)
        {
            player.Event.add("W");
        }
        for(int i=0;i<2;i++)
        {
            player.Event.add("2");
            player.Event.add("3");
            player.Event.add("1");
            player.Event.add("4");
            player.Event.add("0");
        }
    }
}
