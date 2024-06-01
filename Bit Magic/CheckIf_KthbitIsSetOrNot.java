
// Naive Solution

public class CheckIf_KthbitIsSetOrNot {
    static void isSet(int n, int k){
        int x=1;
        for(int i=0;i<(k-1);i++){
            x=x*2;
        }
        if((n&x)==1){
            System.out.println(k+ "th bit is set");
        }
        else{
            System.out.println(k+"th bit is not set");
        }
    }
    public static void main(String[]args){
        isSet(5,3);
    }
}

// Alternate Naive Solution

// public class CheckIf_KthbitIsSetOrNot {
//     static void isSet(int n, int k){
//         int x=1;
//         for(int i=0;i<(k-1);i++){
//             n=n/2;
//         }
//         if((n&1)!=0){
//             System.out.println(k+ "th bit is set");
//         }
//         else{
//             System.out.println(k+"th bit is not set");
//         }
//     }
//     public static void main(String[]args){
//         isSet(5,3);
//     }
// }