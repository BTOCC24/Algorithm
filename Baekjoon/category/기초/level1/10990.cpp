//20/2/1 05:42 10990

#include <iostream>
using namespace std;

int main() {
	int floor, blank;
	cin >> floor;
	blank = floor - 1;
	for (int i = 0; i < blank; i++)
		cout << ' ';
	cout << '*' << endl;
	for (int i = 2, center = 1; i <= floor; i++, center += 2) {
		blank = floor - i;
		for (int j = 0; j < blank; j++) {
			cout << ' ';
		}
		cout << '*';
		for (int j = 0; j < center; j++)
			cout << ' ';
		cout << '*';
		cout << '\n';
	}
}