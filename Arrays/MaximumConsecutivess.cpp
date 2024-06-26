#include <iostream>
using namespace std;
int max(bool arr[],int n){
    int res=0, curr=0;
    for(int i=0;i<n;i++){
        if(arr[i]==0){
            curr = 0;
        }
        else{
            curr++;
            res = max(curr,res);
        }
    }
    return res;
}
int main(){
    int n;
    cin >> n;
    bool arr[n];
    for(int i=0;i<n;i++){
        cin >> arr[i];
    }
    
    cout << "Maximum Consecutive : " << max(arr,n);
}