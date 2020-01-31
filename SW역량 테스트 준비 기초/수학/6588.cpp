//20/1/21 23:00 6588

#include <iostream>
#include <time.h>
#include <vector>
#include <algorithm>

#define max 1000000
using namespace std;

int main() {

	cin.tie(NULL);
	bool sosu[max + 1];
	fill_n(sosu, max + 1, true);
	size_t i, j;
	for (i = 4; i <= max; i+=2) {
		sosu[i] = false;
	}
	for (i = 3; i <= max; i+=2) {
		if (sosu[i] == true) {
			for (j = i * i; j <= max; j += i)
				sosu[j] = false;
		}
	}

	while (true) {
		size_t input;
		cin >> input;
		if (input == 0)
			break;
		for (size_t i = 3; i <= input; i += 2) {
			if (sosu[i]&& sosu[input-i]) {
				cout << input << " = " << i << " + " << input - i << '\n';
				break;
			}
		}
	}
}