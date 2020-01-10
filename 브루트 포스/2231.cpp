//20/1/9 10:00 2231
#include <iostream>
using namespace std;

int main()
{
	unsigned int n, sum = 0;
	cin >> n;
	for (unsigned int i = 0; i < n; i++) {
		sum = 0;
		for (int p = i; p > 0; p /= 10) {
			sum += (p % 10);
		}
		sum += i;
		if (sum == n) {
			cout << i;
			return 0;
		}
	}
	cout << 0;
	return 0;
}
