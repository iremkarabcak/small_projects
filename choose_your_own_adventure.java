import javax.sound.midi.Soundbank;
import java.util.Scanner;
public class choose_your_own_adventure {
    public static void main(String[]args){

        Scanner keyboard = new Scanner (System.in);
        System.out.println("WELCOME TO İREMS TİNY ADVENTURE !");
        System.out.println("you are in a  creepy house! would you like to go \"upstairs\" or into the \"kitchen\" ?");
        String ans = keyboard.nextLine();
        System.out.println("  ");

        if (ans.equals ("kitchen")){
            System.out.println("there is a long countertop with dirty dishes everywhere. off to one side, there is , as you would expect , a refrigerator. you may open the \"refrigeraor \" or look in the \"cabinet \"");
        }
        if (ans.equals ("refrigerator")){
            System.out.println("inside refrigerator you see food and stuff.  It looks pretty nasty.\n" +
                    "Would you like to eat some of the food? (\"yes\" or \"no\") ");
        }if (ans.equals ("yes")) {
            System.out.println("there is a meatball for you to taste... ");
        }else if (ans.equals("no")){
            System.out.println("You die of starvation... eventually.");
        }else if(ans.equals ("cabinet")){
            System.out.println("change your clothes");
        }if (ans.equals ("yes")){
            System.out.println("you can try the white dress");
        }else if(ans.equals("no")){
            System.out.println("ok chill then");
        }

        else if (ans.equals("upstairs")){
            System.out.println("upstairs you see a hallway,At the end of the hallway is the master \\\"bedroom\\\". There is also a \\\"bathroom\\\" off the hallway. Where would you like to go?\");\n" +
                    "\t\tSystem.out.print(\"> \"); ");

        }if(ans.equals("yes")){
            System.out.println("Here is a collection of your books to read in your leisure time!\"");
        }else if (ans.equals("no")){
            System.out.println("You are in your bathroom which has a bathtub and your body shower gel. Would you like to have bath after a hectic day at work? (\\\"yes\\\" or \\\"no\\\")\");\n" );

        }if(ans.equals("yes")){

            System.out.println("Have warm water bath in your bathtub!");
        }else if(ans.equals("no")){

            System.out.println("You have been tired and nasty for the whole day. Don't you want to have bath?");
        }





    }
}
