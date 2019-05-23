import java.util.Scanner;
public class two_more_questions {
    public static void main(String[]args){

        Scanner question = new Scanner(System.in);

        System.out.println("TWO MORE QUESTİONS BABY!!");
        System.out.println("think of something and ı'll try to guess it !" );
        System.out.println("question 1) does it stay inside or outside or both ? (inside, outside ,or both)");
        String answer1 = question.nextLine();

        System.out.println("is it a living thing ? (alive, not alive )");
        String answer2 = question.nextLine();

        if (answer1.equals ("inside") && answer2.equals ("alive") ){
            System.out.println("then what else could you be thinking of besides a houseplant? ");

        }else if(answer1.equals ("inside") && answer2.equals("not alive")){
            System.out.println("then what else could you be thinking of besides a shower curtain ?");

        }else if (answer1.equals ("outside")&& answer2.equals ("alive")){
            System.out.println("then what else could you thinking of besides a bison ?");

        }else if(answer1.equals ("outside")&& answer2.equals ("not alive")){
            System.out.println("then what else could you thinking of a billboard? ");

        }else if (answer2.equals ("both") && answer2.equals("alive")){
            System.out.println("then what else could you be thinking  of besides a phyton?");
        }else if(answer1.equals("both")&& answer2.equals("not alive")){
            System.out.println("then what else could you be thinking of besides a cell phone? ");

        }else{
            System.out.println("obviously the nonliving , inside/outside thing on your mind is a dead ant?!");
        }
    }
}
