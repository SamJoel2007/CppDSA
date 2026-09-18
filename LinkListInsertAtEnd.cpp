#include <iostream>

using namespace std;

struct Node {
    int data;
    Node* next;
};

int main() {
    Node* head = new Node();
    Node* second = new Node();
    Node* third = new Node();

    head->data = 10;
    head->next = second;

    second->data = 20;
    second->next = third;

    third->data = 30;
    third->next = NULL;

    Node* temp = head;

    Node* newNode = new Node();
    newNode->data = 97;
    newNode->next = NULL;

    while (temp != NULL) {
        if (temp->next == NULL) {
            temp->next = newNode;
            break;
        }
        temp = temp->next;
    }


    Node* current = head;

    while (current != NULL) {
        cout << current->data << endl;
        current = current->next;
    }
    return 0;
}