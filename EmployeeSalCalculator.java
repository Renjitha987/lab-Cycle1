import java.util.Scanner;
public class EmployeeSalCalculator {
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Basic salary");
        double Basicsalary =sc.nextDouble();

        double da= Basicsalary *10 /100;
        double HRA= Basicsalary *15 /100;
        double GrossSalary = Basicsalary +da +HRA;

        System.out.println("DA : "+ (int) da);
        System.out.println("HRA : "+ (int) HRA);
        System.out.println("Gross Salary : "+ (int) GrossSalary);
        sc.close();
    }
}
