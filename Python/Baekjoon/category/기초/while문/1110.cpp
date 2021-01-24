//20/1/1 08:21 1110
#include <iostream>
using namespace std;


int main() {
	int N, newN, x, y, D = 1;
	cin >> N;
	x = N / 10;
	y = N % 10;
	newN = (x + y)%10 + y * 10;
	while (!(N == newN)) {
		x = newN / 10;
		y = newN % 10;
		newN = (x + y) % 10 + y * 10;
		D++;
	}
	cout << D;
}