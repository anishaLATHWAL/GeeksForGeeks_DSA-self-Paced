import java.util.*;

public class LCM {
    static int hcf(int a, int b){
        if(b==0){
            return a;
        }
        else{
            return hcf(b,a%b);
        }
    }
    static int lcm(int a , int b){
        return (a*b)/hcf(a,b);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter num2: ");
        int num2 = sc.nextInt();
        sc.close();
        System.out.println("LCM of the two numbers is " + lcm(num1,num2));
    }
}
