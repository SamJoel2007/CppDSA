#include <iostream>

using namespace std;

struct Node {
    int data;
    Node* next;
};

int main() {
    Node* first = new Node();
    Node* second = new Node();

    first->data = 97;
    first->next = second;

    second->data = 86;
    second->next = NULL;

    Node* current = first;

    while (current != NULL) {
        cout << current->data << endl;
        current = current->next;
    }
    return 0;
}