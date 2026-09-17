// Online C++ compiler to run C++ program online
#include <iostream>
#include <set>

using namespace std;

int main() {
    int n;
    cout << "Enter number of elements: ";
    cin >> n;

    set<int> num;

    for (int i=0; i<n; i++) {
        int temp;
        cin >> temp;
        num.insert(temp);
    }

    cout << "Size of set: " << num.size() << endl;

    for (int i : num) {
        cout << i << " ";
    }

    cout << endl;
    return 0;
}