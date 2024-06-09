// package Problem- Arrays;

public class InsertAtEnd {
    public static void main(String[] args){
        /*
         * You are given an array arr. The size of the array is given by sizeOfArray. You need to insert an element at the end.
    Array already have the sizeofarray -1 elements.

    Example 1:

    Input:
    sizeOfArray = 6
    arr[] = {1, 2, 3, 4, 5}
    element = 90
    Output: 1 2 3 4 5 90
    Explanation: After inserting 90 at the
    end, we have array elements as 
    1 2 3 4 5 90.

         */
        int sizeOfArray = 6;
        int arr[] = new int[sizeOfArray]; // Declare array with enough size
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        int element = 90;

        // Insert the element at the end of the array
        insertAtEnd(arr, sizeOfArray, element);

        // Print the array
        for (int i = 0; i < sizeOfArray; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    // You only need to insert the given element at 
    // the end, i.e., at index sizeOfArray - 1. You may 
    // assume that the array already has sizeOfArray - 1
    // elements. 
    public static void insertAtEnd(int arr[],int sizeOfArray,int element)
    {
        //Your code here
        int index = sizeOfArray - 1;
      
        arr[index] = element;
        
    }
}

