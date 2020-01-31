//20/1/30 23:00 2446

#include <iostream>
using namespace std;

int main() {
	int floor, star, blank;
	cin >> floor;
	for (int i = 0; i < floor; i++) {
		blank = i;
		star = 2 * floor - 1 - 2 * blank;
		for (int j = 0; j < blank; j++)
			cout << ' ';
		for (int j = 0; j < star; j++)
			cout << '*';
		cout << '\n';
	}
	for (int i = 1; i < floor; i++) {
		blank = floor - (i+1);
		star = i * 2 + 1;
		for (int j = 0; j < blank; j++)
			cout << ' ';
		for (int j = 0; j < star; j++)
			cout << '*';
		cout << '\n';
	}
}