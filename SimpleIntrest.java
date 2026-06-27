import java.util.Scanner;
public class SimpleIntrest {
    public static void main(String []agrs){
        Scanner sc =new Scanner(System.in);
        System.out.print("enter the principal");
        double principal=sc.nextDouble();

        System.out.print("enter the rate");
        double rate =sc.nextDouble();

        System.out.print("enter the time");
        double time=sc.nextDouble();

        double SimpleIntrest = (principal*rate*time)/100;
        double amount= SimpleIntrest + principal;

        System.out.println("Simple intrest : "+ SimpleIntrest);

        System.out.print("Amount : " +amount);
        sc.close();


    }
}