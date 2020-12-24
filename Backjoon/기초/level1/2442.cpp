//20/1/26 23:00 2442

#include <iostream>
using namespace std;

int main() {
	int floor;
	cin >> floor;
	int temp = floor-1;
	int star = 1;
	for (int i = 0; i < floor; i++) {
		for (int j = 0; j < temp; j++)
			cout << ' ';
		for (int j = 0; j < star; j++)
			cout << '*';

		temp--;
		star += 2;
		cout << '\n';
	}
}