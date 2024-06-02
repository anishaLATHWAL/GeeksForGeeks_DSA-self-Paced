public class CountSetBits {
    static int countBits(int n){
        int res=0;
        while (n>0){
            if(n%2==1){
                res++;
            }
            n=n/2;
        }
        return res;
    }
    public static void main(String[] args){
        int num = 5;
        System.out.println("Number of set bits "+countBits(num));
        System.out.println("Number of set bits is "+countBits(7));
    }
}

// Brian kerningan algorithm

// int CountBits(int n){
//     int res=0;
//     while(n>0){
//         n=n&(n-1);
//         res=res+1;
//     }
//     return res;
// }
