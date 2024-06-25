// This commit includes only the maximumAdjacent function. 
// The rest of the implementation and context is present in the 
// GeeksforGeeks (GFG) code editor.

void maximumAdjacent(int sizeOfArray, int arr[]){
    
     for (int i=1;i<sizeOfArray;i++){
         std::cout << max(arr[i],arr[i-1]) << " ";
     }
     
}