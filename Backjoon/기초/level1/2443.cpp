//20/1/27 23:00 2443

#include <iostream>
using namespace std;

int main() {
	int floor;
	cin >> floor;
	int temp = 0;
	int star = 2 * floor - 1;
	for (int i = 0; i < floor; i++) {
		for (int j = 0; j < temp; j++)
			cout << ' ';
		for (int j = 0; j < star; j++)
			cout << '*';

		temp++;
		star -= 2;
		cout << '\n';
	}
}