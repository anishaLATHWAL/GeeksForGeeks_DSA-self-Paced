import java.util.*;
public class Palindrome {
    public static boolean isPal(int n){
        int rev=0;
        int temp=n;
        while(temp != 0){
            int rem = temp%10;
            rev = rev*10 + rem;
            temp=temp/10;
        }
        return (rev==n);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();

        System.out.println(isPal(num));
  
    }
}
