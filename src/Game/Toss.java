package Game;

import java.util.Scanner;

import static java.lang.System.in;

public class Toss {
        public static int toss()
        {
            System.out.println("This is a random function with 50% probab of you winning the toss");
            int teamwinner=(int)(Math.random()*2);
            if(teamwinner==1)
            {
               System.out.println("Press 1 to bat first else Press 2 for Team 1");
                Scanner sc=new Scanner(in);
                String choice=sc.nextLine();
                if(choice.equals("1"))
                    return 12;
                return 21;
            }
            else{
                System.out.println("Press 1 to bat first else Press 2 for Team 2");
                Scanner sc=new Scanner(in);
                String choice=sc.nextLine();
                if(choice.equals("1"))
                    return 21;
                return 12;

            }

        }
}
