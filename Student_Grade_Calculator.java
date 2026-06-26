import java.util.Scanner;
public class Student_Grade_Calculator {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the mark");
        int mark = sc.nextInt();

        if (mark >= 90 && mark <= 100) {
            System.out.print("Grade= A");
        } else if (mark >= 80 && mark <= 89) {
            System.out.print(" Grade=B");
        } else if (mark >= 70 && mark <= 79) {

            System.out.print("Grade: C");
        } else if (mark > 0 && mark < 70) {
            System.out.print("Grade : D");
        } else {
            System.out.print("invalid");
        }



    }
}
