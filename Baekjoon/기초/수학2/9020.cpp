//20/1/7 9020 15:09
#include <iostream>
using namespace std;

int main()
{
	cin.tie(NULL);
	ios_base::sync_with_stdio(false);

	const unsigned int size = 10001;
	unsigned int input;
	unsigned int i, j;
	unsigned int left, right;
	unsigned int T;

	bool *sosu = new bool[size];
	for (i = 0; i < size; i++)
		sosu[i] = true;
	sosu[0] = false;
	sosu[1] = false;

	for (i = 2; i < size; i++) {
		if (sosu[i]) {
			if (sosu[i] * sosu[i] > size)
				break;
			for (j = 2 * i; j < size; j += i)
				sosu[j] = false;
		}
	}
	cin >> T;
	for (i = 0; i < T; i++) {
		cin >> input;
		left = input / 2;

		while (true) {
			for (;!sosu[left]; left--) {}
			right = input - left;
			if (sosu[right]) {
				cout << left << ' ' << right << "\n";
				break;
			}
			else {
				left--;
			}
		}
	}
	return 0;
}