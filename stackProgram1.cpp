// Online C++ compiler to run C++ program online
#include <iostream>
#include <string>
#include <stack>

using namespace std;

int main() {
    // Write C++ code here
    stack<char> ss;
    string s = "abcd@1234";

    for (char c: s) {
        ss.push(c);
    }
    while (!ss.empty()) {
        cout << ss.top();
        ss.pop();
    }
    return 0;
}