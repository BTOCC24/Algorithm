//20/1/2 11:40 1193
#include <iostream>
using namespace std;

int main()
{
	bool odd = false;
	int X, n = 0, left, right;
	cin >> X;
	for (n = 0; 1 + n * (n - 1) / 2 <= X; n++) {}
	right = n - 1;
	left = 1;
	if (right % 2 == 1)
		odd = true;
	for (int i = 0; X - (1 + (n - 2) * (n - 1) / 2) - i > 0; i++) {
		right--;
		left++;
	}
	if (!odd) {
		cout << left << "/" << right;
	}
	else {
		cout << right << "/" << left;
	}
}
