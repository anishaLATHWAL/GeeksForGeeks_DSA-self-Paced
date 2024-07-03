// This commit includes only the majorityElement function. 
// The rest of the implementation and context are present in the 
// GeeksforGeeks (GFG) code editor.

int majorityElement(int a[], int size)
    {
        
        // your code here
        int res = 0; 
        int count=1;
        for(int i=1;i<size;i++){
            
            if(a[res]==a[i]){
                count++;
            }
            else{
                count--;
            }
            if (count ==0){
                res=i;
                count=1;
            }
        }
        count=0;
        for(int i=0;i<size;i++){
            if(a[res]==a[i]){
                count++;
            }
        }
        if(count<=size/2){
                return -1;
        }
        return a[res];
    }