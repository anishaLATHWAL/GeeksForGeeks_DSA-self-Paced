public class MovesZerosToEnd {
    static void move(int arr[]) {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
    }

    public static void main(String args[]) {
        int arr[] = {0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        int n = arr.length;
    
        System.out.print("Original array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        
        move(arr);
    
        System.out.print("New array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
