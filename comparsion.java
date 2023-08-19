import java.util.Scanner;
public class Comparison
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int num1;
        int num2;
        
        System.out.print ("Enter the first integer: ");
        num1 = input.nextInt();
        
        System.out.print ("Enter the second number: ");
        num2 = input.nextInt();
        
        if (num1 == num2)
            System.out.printf ("%d is equal to %d%n", num1, num2);
            
        if (num1 != num2)
            System.out.printf ("%d is not eual to %d%n", num1, num2);
        
        if (num1 < num2)
            System.out.printf ("%d is smaller than %d%n", num1, num2);
            
        if (num1 <= num2)
            System.out.printf ("%d  is equal or smaller than %d%n", num1, num2);
            
        if (num1 >= num2)
            System.out.printf ("%d is greater or equal to %d%n", num1, num2);
    }
}
