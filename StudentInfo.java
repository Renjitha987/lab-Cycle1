// Student Information Display
import java.util.Scanner;
public class StudentInfo {
    public static void main (String[] args){
        Scanner sc =new Scanner (System.in);
        System.out.print("enter the name : ");
        String name =sc.nextLine();
        System.out.print("enter the roll no: ");
        int num =sc.nextInt();
        sc.nextLine();

        System.out.print("enter the course : ");
        String course = sc.nextLine();

        System.out.print("enter the percentage: ");
        float percentage=sc.nextFloat();

        // Display Output
        System.out.println("\nStudent Details");
        System.out.println("----------------");
        System.out.println("Name       : " + name);
        System.out.println("Roll No    : " + num);
        System.out.println("Course     : " + course);
        System.out.println("Percentage : " + percentage);


    }
}
