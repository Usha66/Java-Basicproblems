import java.util.*;
public class Factorial {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int a = sc.nextInt();
        long fact = 1;
        for (int i =1; i<=a; i++){
            fact = i*a;
        }
        System.out.print("The factorial of the number is :" + fact);        

    }

    
}
