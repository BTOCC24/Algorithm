//20/1/9 1002 11:06
#include <iostream>
#include <cmath>
#include <algorithm>
using namespace std;

int main()
{
	unsigned int T;
	cin >> T;
	for (unsigned int i = 0; i < T; i++) {
		int x1, y1, x2, y2, r1, r2, r;
		double dist;

		cin >> x1 >> y1 >> r1 >> x2 >> y2 >> r2;
		if (r1 > r2)
			swap(r1, r2);
		dist = sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2));
		r = r1 + r2;
		if (dist > r)
			cout << 0 << endl;
		else if (dist == r)
			cout << 1 << endl;
		else {
			if (r1 + dist > r2)
				cout << 2 << endl;
			else if (r1 + dist == r2 && dist != 0)
				cout << 1 << endl;
			else if (r1 + dist == r2)
				cout << -1 << endl;
			else
				cout << 0 << endl;
		}
	}
}