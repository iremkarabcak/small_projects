import java.util.Scanner;
public class alphabeticalorder {
    public static void main(String[]args){
        System.out.println("whats your last name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        if(name.compareTo("carswell") <= 0 ){
            System.out.println("you dont have to wait long ");

        }else if(name.compareTo("jones")<=0){
            System.out.println("thats not bad");
        }else if(name.compareTo("smith") <= 0){
            System.out.println("looks like a bit of a wait");
        }else if (name.compareTo("young") <=0){
            System.out.println("its gonna be a while ");
        }else if(name.compareTo("young") >0){
            System.out.println("not going anywhere for a while ?");
        }

    }
}
