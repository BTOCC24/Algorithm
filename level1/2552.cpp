//20/1/31 23:00 2552

#include <iostream>
using namespace std;

int main() {
	int floor;
	cin >> floor;
	for (int i = 0; i < floor; i++) {
		int star = i + 1;
		int blank = floor - star;
		for (int j = 0; j < blank; j++)
			cout << ' ';
		for (int j = 0; j < star; j++)
			cout << '*';
		cout << '\n';
	}
	for (int i = 1; i < floor; i++) {
		int star = floor-i;
		int blank = floor - star;
		for (int j = 0; j < blank; j++)
			cout << ' ';
		for (int j = 0; j < star; j++)
			cout << '*';
		cout << '\n';
	}
}