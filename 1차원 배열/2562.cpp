//20/1/1 08:36 2562
#include <iostream>
using namespace std;


int main() {
	int input[9], max = 0, index = -1;
	for (int i = 0; i < 9; i++) {
		cin >> input[i];
		if (input[i] > max) {
			max = input[i];
			index = i+1;
		}
	}
	cout << max << endl << index;
}