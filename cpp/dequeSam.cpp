// Online C++ compiler to run C++ program online
#include <iostream>
#include <deque>

using namespace std;

int main() {
    deque<string> names;
    names.push_front("Sam");
    names.push_front("Joel");
    names.push_front("Winters");

    cout << "Name in front: " << names.front() << endl;
    cout << "Name in back: " << names.back() << endl;

    names.pop_front();

    cout << names.front() << endl;
    return 0;
}