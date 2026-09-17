// Online C++ compiler to run C++ program online
#include <iostream>
#include <vector>

using namespace std;

int main() {
    // Write C++ code here
    int n;
    cout << "Enter number of osint tools: ";
    cin >> n;

    vector<string> tools;

    for (int i=0; i<n; i++) {
        string temp;
        cin >> temp;
        tools.push_back(temp);
    }

    cout << endl;
    cout << "FULL DISPLAY" << endl;

    for (string tool : tools) {
        cout << tool << endl;
    }

    cout << endl;

    cout << "TRYING POP" << endl;

    tools.pop_back();
    // tools.pop_front();

        for (string tool : tools) {
        cout << tool << endl;
    }

    cout << endl;
    cout << "Trying isEmpty function" << endl;

    cout << tools.empty() << endl;

    tools.push_back("Radium");

    cout << "FULL FINAL DISPLAY" << endl;

    for (string tool : tools) {
        cout << tool << endl;
    }

        return 0;
}