import java.util.Scanner;
public class age_messages_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your name : ");
        String name = scanner.nextLine();

        Scanner scan = new Scanner(System.in);
        System.out.println("your age : ");
        int age = scan.nextInt();

        if (age < 16) {

            System.out.println("you can't drive");
        } else if (age >= 16 && age <= 17) {
            System.out.println("you can't drive , but you can vote ");
        } else if (age <= 24 && age >= 18) {
            System.out.println("you can vote but can not rent a car ,");
        } else if (age >= 25) {
            System.out.println("you can do pretty much thing ,");
        } else {
            System.out.println("you are too young to think about this stuff.");
        }


    }
}