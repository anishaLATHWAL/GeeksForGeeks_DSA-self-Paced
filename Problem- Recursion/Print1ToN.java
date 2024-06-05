public class Print1ToN {
    /*
    Print numbers from 1 to N without the help of loops.

    Example 1:

    Input:
    N = 10
    Output: 1 2 3 4 5 6 7 8 9 10

    Example 2:

    Input:
    N = 5
    Output: 1 2 3 4 5
     */
    
    public static void main(String[] args){
        print(5);
    }

    static void print(int n){
        if(n==0){
            return;
        }
        print(n-1);
        System.out.println(n+" ");
    }
}
