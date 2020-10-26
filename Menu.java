import java.util.Scanner;

public class Menu
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner (System.in);
        Boolean running = true;

        while (running) {
            System.out.println("MENU");
            System.out.println("1) Metallica");
            System.out.println("2) Megadeth");
            System.out.println("3) Quit");

            String cmd = sc.nextLine();

            if(cmd.equals("1"))
            {
                System.out.println("Master! ... Master! " +
                        "\nMaster of Puppets, I'm pulling your strings. ");
            }

            if(cmd.equals("2"))
            {
                System.out.println("Brother will kill brother, spilling blood across the land. " +
                        "\nKilling for religion, something I don't understand");
            }

            else if (cmd.equals("3"))
            {
                running = false;
            }
        }
    }
}
