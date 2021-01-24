//20/1/2 11:34 1011
#include <iostream>
#include <math.h>
using namespace std;

int main()
{
	int T, x, y;
	cin >> T;
	for (int i = 0; i < T; i++) {
		cin >> x >> y;
		x = y - x;
		if (abs(pow((int)sqrt(x), 2) - x) == 0)
			cout << 2 * (int)sqrt(x) - 1 << endl;
		else if (x - abs(pow((int)sqrt(x), 2)) > abs(pow((int)sqrt(x) + 1, 2) - x))
			cout << 2 * (int)sqrt(x) + 1 << endl;
		else
			cout << 2 * (int)sqrt(x) << endl;
	}
}

/*
1

11
111

121

1121 1
1221

11221
12221

12321

122221
123221
123321

1223221
1233221
1233321

1234321

1 1
121 4
12321 9
1234321 16
123454321 25

n^2
*/
