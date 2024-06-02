public class TwoOddOccuring {
    static void oddOccurring(int arr[], int n){
        int x = arr[0];
        for (int i = 1; i < n; i++){
            x = x ^ arr[i];
        }
        int k = (x & ~(x - 1));
        int res1 = 0, res2 = 0;
        for(int i = 0; i < n; i++){
            if ((arr[i] & k) != 0){
                res1 = res1 ^ arr[i];
            } else {
                res2 = res2 ^ arr[i];
            }
        }
        System.out.println(res1 + " " + res2);
    }

    public static void main(String[] args){
        int arr1[] = {1, 6, 5, 6, 6, 1};
        int arr2[] = {5, 6, 10, 6, 10, 6, 3, 3};
        oddOccurring(arr1, arr1.length);
        oddOccurring(arr2, arr2.length);
    }
}
