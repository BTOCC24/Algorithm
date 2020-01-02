//20/1/2 09:30 1712
#include <iostream>
using namespace std;

int main()
{
	int a, b, c;
	int n;
	cin >> a >> b >> c;
	if (b >= c) {
		cout << -1;
		return 0;
	}
	n = a / (c - b) + 1;
	cout << n;
}
