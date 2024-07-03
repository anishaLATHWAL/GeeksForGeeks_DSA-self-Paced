// This commit includes only the countOccurence function. 
// The rest of the implementation and context are present in the 
// GeeksforGeeks (GFG) code editor.

int countOccurence(int arr[], int n, int k) {
          map<int,int>mp;
          for(int i = 0; i<n ; i++){
              mp[arr[i]]++;
          }
          int count = 0;
          for(auto it:mp){
              if(it.second>n/k){
                  count++;
              }
          }
          return count;
    }