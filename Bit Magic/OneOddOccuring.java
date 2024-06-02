public class OneOddOccuring {
    static int findOdd(int arr[], int n){
        int res=arr[0];
        for (int i=1;i<n;i++){
            res=res^arr[i];
        }
        return res;
    }
    public static void main(String[] args){
        int array[] = {4,4,7,4,7,7,7,8,8};
        System.out.print("Odd occuring number is: "+ findOdd(array,9));
    }
}
