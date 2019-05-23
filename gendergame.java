import java.util.Scanner;
public class gendergame {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("what is your gender? : (M or F)");
        String gender =  scanner.nextLine();

        Scanner name = new Scanner(System.in);
        System.out.println("first name : ");
        String neym = name.nextLine();

        Scanner last = new Scanner(System.in);
        System.out.println("last name : ");
        String soyad = last.nextLine();

        Scanner age = new Scanner(System.in);
        System.out.println("age : ");
        int yas = age.nextInt();

        Scanner mar = new Scanner(System.in);
        System.out.println("are you married, "+ neym +"? (y or n)");
        String evlilik = mar.nextLine();


        if (gender.equals ("F") && evlilik.equals("y") && yas >= 20 ){
            System.out.println("then ı shall call you Mrs." + soyad);

        }else if((gender.equals ("F") && evlilik.equals("y") && yas >= 20 )){
            System.out.println("then ı shall call you Ms." + soyad);
        }else{
            System.out.println(neym +" "+ soyad);
        }

        if(gender.equals ("M") && evlilik.equals("y") && yas >= 20){
            System.out.println("then ı shall call you Mr."+ soyad);

        }else{
            System.out.println(neym +" " + soyad);
        }


    }
}
