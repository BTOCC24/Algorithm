//20/1/1 04:17 2588
#include <iostream>
using namespace std;

int main() {
	int a, b;
	cin >> a >> b;
	cout << a * (b % 10) << endl;
	cout << a * ((b % 100) / 10) << endl;
	cout << a * (b / 100) << endl;
	cout << a * b << endl;
}