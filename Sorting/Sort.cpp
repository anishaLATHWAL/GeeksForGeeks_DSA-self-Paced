
#include <bits/stdc++.h>
using namespace std;

int main()
{   
    // Sorting Array
    int arr[] = {1, 5, 8, 9, 6, 7, 3, 4, 2, 0};
    int n = sizeof(arr)/sizeof(arr[0]);

    sort(arr, arr+n);

    cout << "Array after sorting is : \n";
    for (int i = 0; i < n; ++i)
        cout << arr[i] << " ";
    
    // Sorting Vector    
    vector<int> vec = {1,2,4,5,3};
    
    sort(vec.begin(), vec.end());
    
    cout << "\nVector after sorting is : \n";
    for (int i = 0; i < vec.size(); ++i)
        cout << vec[i] << " ";

    return 0;
}
