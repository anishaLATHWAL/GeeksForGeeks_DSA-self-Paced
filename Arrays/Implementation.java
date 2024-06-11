public class Implementation {
    public static void main (String[] args)  
    {           
      int[] arr; 
          
      arr = new int[5]; 
          
      arr[0] = 10; 
      arr[1] = 20; 
      arr[3] = 40; 
      arr[4] = 50; 
          
    // accessing the elements of the specified array 
      for (int i = 0; i < arr.length; i++) 
         System.out.println("Element at index " + i +  
                                      " : "+ arr[i]);           
    } 
} 


