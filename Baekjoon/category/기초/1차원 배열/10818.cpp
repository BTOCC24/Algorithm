//20/1/1 08:29 10818
#include <iostream>
using namespace std;


int main() {
	int N;
	int input, min = 1000000, max=-1000000;
	cin >> N;
	for (int i = 1; i <= N; i++) {
		cin >> input;
		if (input < min)
			min = input;
		if (input > max)
			max = input;
	}
	cout << min << ' ' << max;
}