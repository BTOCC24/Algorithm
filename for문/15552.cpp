//20/1/1 05:03 15552
#include <iostream>
using namespace std;


int main() {
	cin.tie(NULL);
	ios_base::sync_with_stdio(false);
	int T, a, b;
	cin >> T;
	for (int i = 1; i <= T; i++) {
		cin >> a >> b;
		cout << a + b << "\n";
	}
	return 0;
}