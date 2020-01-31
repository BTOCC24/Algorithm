//20/1/25 23:00 2441

#include <iostream>
using namespace std;

int main() {
	int input;
	cin >> input;
	int temp = input;
	for (int i = 0; i < input ; i++,temp--) {
		for (int j = 0; j < i; j++)
			cout << ' ';
		for (int j = 0; j < temp; j++)
			cout << '*';
		cout << '\n';
	}
}