import java.util.Scanner;
public class bmi_categories {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("your height in m : ");
        double height = scanner.nextDouble();

        System.out.println("your weight in kg : ");
        double weight = scanner.nextDouble();

        double bmi = (height / Math.sqrt(weight));


        System.out.println("bmi category :" + bmi);


        if (bmi < 18.5) {
            System.out.println(" normal weight ");
        } else if (18.5 >= bmi && bmi <= 24.5) {
            System.out.println("bmi >= 18.5 && bmi <=24.5");
        } else if (bmi >= 25.0 && bmi <= 29.9) {
            System.out.println("overweight");
        } else if (bmi >= 30.0) {
            System.out.println("obese");
        } else {
            System.out.println("you need to go to sports");


        }
    }
}