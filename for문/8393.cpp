//20/1/1 04:50 8393
#include <iostream>
using namespace std;

int main() {
	int n, sum = 0;
	cin >> n;
	for (int i = 1; i <= n; i++)
		sum += i;
	cout << sum;
	return 0;
}