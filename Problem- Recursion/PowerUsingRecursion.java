public class PowerUsingRecursion {
   
   public static void main(String[] args) {
       System.out.println(RecursivePower(2,9));
   }

   // main code
   public static int RecursivePower(int n,int p) {
       if( p == 0 ) return 1;
       if( p == 1 ) return n;
       return n * RecursivePower(n,p-1);
   }
}

