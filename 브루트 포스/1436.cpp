//20/1/10 23:22 1436
#include <iostream>
#include <string>
using namespace std;
int main() {
	int i, n, cnt = 0;
	cin >> n;
	for (i = 1; cnt < n; i++) {
		if (to_string(i).find("666")!=string::npos)
			cnt++;
	}
	cout << i-1 << endl;
}