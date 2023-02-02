package input;

import Team.Batsman;
import Team.Bowler;
import Team.Player;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;
import Exception.*;
public class InputHelper {
    static Scanner sc=new Scanner(in);
    public static String getTeamname()
    {
        System.out.println("Enter Team Name:");
        return sc.nextLine();
    }
    public static ArrayList<Player> getPlayers(int sz)
    {
        ArrayList<Player>pls=new ArrayList<Player>();
        int i=1;
        while(i<=sz)
        {
            System.out.println("Enter the name for "+i+" Player:");
            String name=sc.nextLine();
            Player p=new Player();
            System.out.println("Press 1 for Batsman \nPress 2 for bowler");

            String designation=sc.nextLine();
            if(ExceptionHandler.checker(designation)==null){
            p.setName(name);
            p.setDesignation(designation);
            if(designation.equals("1"))
                Batsman.EventInit(p);
            else
                Bowler.Eventinit(p);
            pls.add(p);
            i++;
            }
            else {
                System.out.println("You Inputed Wrong Info");
            }

        }
        return pls;
    }
    public static int getSize()
    {
        System.out.println("Enter Team Size:");
        int size=sc.nextInt();
        sc.nextLine();
        return size;
    }
}
