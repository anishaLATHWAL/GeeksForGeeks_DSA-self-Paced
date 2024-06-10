
public class SecondLargestElement {
    static int getSecond(int arr[]){
        int n = arr.length;
        int res=-1,largest=0;
        for(int i=1;i<n;i++){
            if(arr[i]>arr[largest]){
                res=largest;
                largest=i;
            }
            else if (arr[i]!=arr[largest]) {
                if(res==-1 || arr[i]>arr[res]){
                    res=i;
                }
            }
        }
        return res;
    }
    public static void main(String[] args){
        int arr[] = {2,4,3,6,5};

        System.out.println("Index of second largest element is "+getSecond(arr));
    }
}
