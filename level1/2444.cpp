//20/1/28 23:00 2444

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

	temp = 1;
	star = 2 * floor - 3;
	for (int i = 1; i < floor; i++) {
		for (int j = 0; j < temp; j++)
			cout << ' ';
		for (int j = 0; j < star; j++)
			cout << '*';

		temp++;
		star -= 2;
		cout << '\n';
	}
}