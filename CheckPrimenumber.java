import java.util.*;
public class CheckPrimenumber {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int a = sc.nextInt();
        int count = 0;
        for (int i=1; i<=a; i++){
            if (a % i == 0){
                count++;
            }
        }
                if (count == 2){
                    System.out.println("The number is Prime.");
                }else{
                    System.out.println("The number is Not Prime");
                }
            }
        }

