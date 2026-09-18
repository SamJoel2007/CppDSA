#include <iostream>

using namespace std;

struct Node {
    int data;
    Node* next;
};

int main() {
    int n;
    cout << "Enter number: ";
    cin >> n;
    
    Node* first = NULL;
     for (int i=0; i<n; i++) {
         Node* current = new Node();
         int value;
         cin >> value;
         current->data = value;
         current->next = NULL;

         if (first == NULL) {
             first = current;
         } else {
             Node* temp = first;

             while (temp->next != NULL) {
                 temp = temp->next;
             }

             temp->next = current;
         }
     }
    Node* current = first;

    while (current != NULL) {
        cout << current->data << endl;
        current = current->next;
    }
    return 0;
}