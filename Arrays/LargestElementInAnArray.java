import java.util.*;
class LargestElementInAnArray{
    static int getLargest(int arr[]){
        int result = 0;
        for(int i=0; i<arr.length;i++){
            if(arr[i]>arr[result]){
                result = i;
            }
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Largest element index is "+getLargest(arr));
    }
}