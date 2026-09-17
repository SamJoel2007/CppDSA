// Online C++ compiler to run C++ program online
#include <iostream>
#include <list>

using namespace std;

void display(list<string> cars) {
    cout << "Displaying Cars: " << endl;
    for (string car : cars) {
        cout << car << endl;
    }
}

int main() {
    // Write C++ code here
    int n;
    cout << "Enter car names (type exit to stop): ";

    list<string> cars;

    while (1) {
        string car;
        cin >> car;

        if (car == "exit" || car == "EXIT") {
            break;
        }  else {
            cars.push_back(car);
        }
    }

    display(cars);

    // REMOVING ELEMENTS

    cars.pop_front();
    cars.pop_back();
    cout << "popped list" << endl;
    display(cars);
    
    return 0;
}