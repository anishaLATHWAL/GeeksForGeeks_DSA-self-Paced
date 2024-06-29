#include <iostream>
using namespace std;

int binarySearch(int arr[], int n, int x){
    int low = 0;
    int high = n-1;
    while(low<=high){
        int mid = (low+high)/2;
        if(arr[mid]==x){
            return mid;
        }
        else if(arr[mid]>x){
            high = mid-1;
        }
        else{
            low = mid+1;
        }
    }
    return -1;
}
int main(){
    int x;
    cout << "Enter the number to search for: ";
    cin >>  x;
    int n;
    cout << "Enter the number of elements: ";
    cin >> n;
    int arr[n];
    cout <<"Enter array: ";
    for(int i=0;i<n;i++){
        cin >> arr[i];
    }
    cout << "Element is present at index " << binarySearch(arr,n,x);
}