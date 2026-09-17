// Online C++ compiler to run C++ program online
#include <iostream>
#include <queue>

using namespace std;

int main() {
    queue<string> names;
    names.push("Sam");
    names.push("Joel");
    names.push("Winters");

    cout << names.front() << endl;

    names.pop();

    cout << names.front() << endl;
    return 0;
}