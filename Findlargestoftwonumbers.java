import java.util.*;
public class Findlargestoftwonumbers {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        int n1 = sc.nextInt();
        System.out.print("Enter second number:");
        int n2 = sc.nextInt();
        int large = 0;
        if(n1>n2){
            System.out.println("The first number is largest.");
        }else{
            System.out.println("The second number is largest.");
        }
    }
    
}
