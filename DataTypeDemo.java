import java.util.Scanner;
public class DataTypeDemo {
    public static void main(String[] agrs){
        int i =100;
        long l=1000000;
        float f=25.5f;
        double d=123.456;
        char c='A';
        boolean b=true;

        System.out.println("integer value       :"          +i);
        System.out.println("long value          :"          +l);
        System.out.println("Float value           : "       +f);
        System.out.println("Double value            : "     +d);
        System.out.println("Character value         :   "   +c);
        System.out.println("boolean value           :"      +b);

        System.out.println("\n memory range data types: ");
        System.out.println("byte    : "+Byte.MIN_VALUE + "to" + Byte.MAX_VALUE);
        System.out.println("short    : "+Short.MIN_VALUE + "to" + Short.MAX_VALUE);
        System.out.println("int        : "+Integer.MIN_VALUE + "to" + Integer.MAX_VALUE);
        System.out.println("long        : "+Long.MIN_VALUE + "to" + Long.MAX_VALUE);
        System.out.println("float    : "+Float.MIN_VALUE + "to" + Float.MAX_VALUE);
        System.out.println("double    : "+Double.MIN_VALUE + "to" + Double.MAX_VALUE);
        System.out.println("char        : "+Character.MIN_VALUE + "to" + Character.MAX_VALUE);


    }
}
