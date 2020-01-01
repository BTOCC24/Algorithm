//20/1/1 10:45 1065
#include <iostream>
using namespace std;

bool hansu(int n);

int main()
{
	int T, cnt = 0;
	cin >> T;
	for (int i = 1; i <= T; i++) {
		if (hansu(i))
			cnt++;
	}
	cout << cnt;

}

bool hansu(int n) {
	if (n < 100)
		return true;
	else {
		int x = (n / 100) - ((n / 10) % 10);
		int y = ((n / 10) % 10) - (n % 10);
		return x == y;
	}
}