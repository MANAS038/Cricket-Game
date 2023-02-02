package Team;

import org.w3c.dom.events.Event;

import java.util.ArrayList;

public class Batsman extends Player{

public static  void EventInit(Player player)
{
    for(int i=0;i<4;i++)
    {
        player.Event.add("6");
    }
    for(int i=0;i<8;i++)
    {
        player.Event.add("4");
    }
    for(int i=0;i<2;i++)
    {
        player.Event.add("2");
        player.Event.add("3");
        player.Event.add("1");
        player.Event.add("W");
    }
}

}
