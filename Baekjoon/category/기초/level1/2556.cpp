//20/2/1 05:30 2556

#include <iostream>
using namespace std;

int main() {
	int floor;
	cin >> floor;
	for (int i = 0; i < floor; i++) {
		for (int j = 0; j < floor; j++) {
			cout << '*';
		}
		cout << '\n';
	}
}