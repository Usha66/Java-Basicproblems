import java.util.*;
public class Largestamongthree {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        int n1 = sc.nextInt();
        System.out.print("Enter second number:");
        int n2 = sc.nextInt();
        System.out.print("Enter third number:");
        int n3 = sc.nextInt();
        if(n1>=n2 && n1>=n3){
            System.out.println("The first number is largest.");
        }
        else if (n2>=n1 && n2>=n3){
            System.out.println("The second number is largest.");
        } else {
            System.out.println("The third number is largest.");

        }
        
    }
}
    


