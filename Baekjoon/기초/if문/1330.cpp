//20/1/1 04:18 1330
#include <iostream>
using namespace std;

int main() {
	int a, b;
	cin >> a >> b;
	if (a > b)
		cout << '>';
	else if (a < b)
		cout << '<';
	else
		cout << "==";
}