//20/1/7 4948 15:00
#include <iostream>
using namespace std;
int main()
{
	unsigned int n, cnt;
	unsigned int i, j;
	cin.tie(NULL);
	ios_base::sync_with_stdio(false);

	while (true) {
		cin >> n;
		cnt = 0;
		if (n == 0)break;

		bool *sosu = new bool[2 * n + 1];
		for (i = 0; i < 2 * n + 1; i++)
			sosu[i] = true;
		sosu[1] = false;

		for (i = 2; i <= 2 * n; i++) {
			if (sosu[i]) {
				if (sosu[i] * sosu[i] > 1000001)
					break;
				for (j = 2 * i; j <= 2 * n; j += i)
					sosu[j] = false;
			}
		}

		for (i = n + 1; i <= 2 * n; i++) {
			if (sosu[i]) cnt++;
		}
		cout << cnt << "\n";
		delete[] sosu;
	}

	return 0;
}