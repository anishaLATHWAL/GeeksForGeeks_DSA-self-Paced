#include <iostream>
using namespace std;

int maxSum(int arr[],int n,int k){
    int curr = 0;
    for(int i=0;i<k;i++){
        curr += arr[i];
    }
    int res=curr;
    for(int i=k;i<n;i++){
        curr =curr + arr[i]-arr[i-k];
        res = max(res,curr);
    }
    
    return res;
}

int main(){
    int n;
    cout << "Enter n: ";
    cin >> n;
    int arr[n];
    cout << "Enter k: ";
    int k;
    cin >> k;
    cout << "Enter array elements: ";
    for(int i=0;i<n;i++){
        cin >> arr[i];
    }

    cout << "Maximum Sum of k consecutive elements is " << maxSum(arr,n,k);
    return 0;
}