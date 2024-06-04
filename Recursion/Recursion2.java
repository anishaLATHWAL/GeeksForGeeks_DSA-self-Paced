package Recursion;

public class Recursion2 {
    static void fun(int n){
        if (n==0)
            return;
        System.out.println("AnishaLathwal04");
        fun(n-1);
    }    
    public static void main(String[] args){
        fun(5);
    }
}
