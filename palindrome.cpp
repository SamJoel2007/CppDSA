// Online C++ compiler to run C++ program online
#include <iostream>
#include <set>

using namespace std;

int main() {
    string word;
    cout << "Enter word: ";
    cin >> word;

    int l = word.length()-1;

    // cout << l << endl;

    string reversed_wrd;

    for (int i=l ;i>=0; i--) {
        reversed_wrd += word[i];
    }

    cout << "Reversed word: " << reversed_wrd << endl;

    if (word == reversed_wrd) {
        cout << "It is a palindrome" << endl;
    } else {
        cout << "It is not a palindrome" << endl;
    }
    return 0;
}