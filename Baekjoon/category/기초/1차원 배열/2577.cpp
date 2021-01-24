//20/1/1 08:40 2920
#include <iostream>
using namespace std;


int main() {
	int a, b, c;
	cin >> a >> b >> c;
	a = a * b * c;
	int num[10] = { 0, };
	while (a > 0) {
		num[a % 10]++;
		a = a / 10;
	}
	for (int i = 0; i < 10; i++)
		cout << num[i] << endl;
	return 0;
}