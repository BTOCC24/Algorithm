//20/1/1 04:32 2884
#include <iostream>
using namespace std;

int main() {
	int h, m;
	cin >> h >> m;
	if (m >= 45)
		m -= 45;
	else {
		if (h == 0)
			h = 24;
		h -= 1;
		m += 15;
	}
	cout << h << ' ' << m;
}