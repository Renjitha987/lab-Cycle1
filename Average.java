import java.util.Scanner;
public class Average {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.print("enter the number ");
        int num1=sc.nextInt();

        System.out.print("enter the  2nd number ");
        int num2=sc.nextInt();

        System.out.print("enter the 3rd number ");
        int num3=sc.nextInt();

        double average = (num1+num2+num3)/3;

        System.out.print("Avereage = " + average);
        sc.close();

    }

}
