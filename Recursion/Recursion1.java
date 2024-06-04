package Recursion;

public class Recursion1 {
    static void fun(){
        System.out.println("Anisha Lathwal");
        fun();
    }
    public static void main(String[] args){
        fun();
    }
}

// There is no base case which leads to Stack Overflow or segmentation fault
