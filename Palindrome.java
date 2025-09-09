import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        int original = a;  
        int rev = 0;

        while (a != 0) {
            rev = rev * 10 + a % 10;  
            a /= 10;                 
        }

        if (original == rev)
            System.out.println(original + " is a Palindrome");
        else
            System.out.println(original + " is not a Palindrome");

        sc.close();
    }
}
