#include <iostream>
#include <stack>

using namespace std;

int main() {
    stack<string> names;

    names.push("Sam");
    names.push("Joel");
    names.push("Winters");
    names.push("Leon");

    cout << names.top();
    cout << endl;

    names.pop();
    cout << endl << names.top() << endl;
    return 0;
}