//20/1/29 23:00 2445

#include <iostream>
using namespace std;

int main() {
	int floor, star, blank;
	cin >> floor;
	for (int i = 0; i < floor; i++) {
		star = i + 1;
		blank = 2 * (floor - star);
		for (int j = 0; j < star; j++)
			cout << '*';
		for (int j = 0; j < blank; j++)
			cout << ' ';
		for (int j = 0; j < star; j++)
			cout << '*';
		cout << '\n';
	}
	for (int i = 1; i < floor; i++) {
		star = floor - i;
		blank = 2 * (floor - star);
		for (int j = 0; j < star; j++)
			cout << '*';
		for (int j = 0; j < blank; j++)
			cout << ' ';
		for (int j = 0; j < star; j++)
			cout << '*';
		cout << '\n';
	}
}