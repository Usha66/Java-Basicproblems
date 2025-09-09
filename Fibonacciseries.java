import java.util.*;
public class Fibonacciseries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range:");
        int a = sc.nextInt();
        int s = 0 , n = 1;
        System.out.print("The Fibonacci Series:");
        for (int i=0;i<=a; i++){
            System.out.print(s+"");
            int next = s+n;
            s = n;
            n = next;
       }

        System.out.print("");
    }

}
    