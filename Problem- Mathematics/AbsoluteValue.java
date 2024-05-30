import java.util.*;
public class AbsoluteValue{
    static int absolute(int I) {
        return Math.abs(I);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num: ");
        int num = sc.nextInt();
        sc.close();
        System.out.println(absolute(num));
    }
} 