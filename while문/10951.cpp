//20/1/1 07:45 10952
#include <iostream>
using namespace std;


int main() {
	int a, b;
	cin >> a >> b;
	while (a != 0 && b != 0) {
		cout << (a + b) << endl;
		cin >> a >> b;
	}
	return 0;
}