//20/1/24 23:00 2440

#include <iostream>
using namespace std;

int main() {
	size_t input;
	cin >> input;
	while (input--) {
		for (size_t i = 0; i <= input; i++)
			cout << '*';
		cout << '\n';
	}
}