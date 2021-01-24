//20/1/2 10:08 2839
#include <iostream>
using namespace std;

int main()
{
	int N;
	int a, b; //a´Â 3kg b´Â 5kg
	cin >> N;
	b = N / 5;
	for (int imsi; b >= 0; b--) {
		imsi = N - b * 5;
		if (imsi % 3 == 0) {
			a = imsi / 3;
			break;
		}
	}
	if (b == -1)
		cout << -1;
	else
		cout << a + b;
}
