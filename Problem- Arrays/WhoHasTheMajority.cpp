// This commit includes only the majorityWins function. 
// The rest of the implementation and context are present in the 
// GeeksforGeeks (GFG) code editor.

int majorityWins(int arr[], int n, int x, int y) {
        // code here
        int freq1=0;
        int freq2=0;
        for(int i=0;i<n;i++){
            if(x==arr[i]){
                freq1++;
            }
            if(y==arr[i]){
                freq2++;
            }
        }
        if(freq1==freq2){
            if(x<y){
                return x;
            }
            else{
                return y;
            }
        }
        
        return freq1>freq2 ? x:y;
        
    }