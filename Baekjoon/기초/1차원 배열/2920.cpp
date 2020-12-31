//20/1/1 08:40 2920
#include <iostream>
using namespace std;


int main() {
	int incre = -1;
	int sound[8];
	for (int i = 0; i < 8; i++)
		cin >> sound[i];
	if (sound[0] == 1)
		incre = 1;
	for (int i = 0; i < 7; i++) {
		if (!(sound[i + 1] == sound[i] + incre)) {
			cout << "mixed";
			return 0;
		}
	}
	if (incre == 1)
		cout << "ascending";
	else
		cout << "descending";
	return 0;
}