//20/1/7 1929 13:44 에라토스테네스의 채
#include <iostream>
using namespace std;
int main()
{
	unsigned int n, m;
	unsigned int i, j;
	cin.tie(NULL);
	ios_base::sync_with_stdio(false);

	cin >> n >> m;
	bool *sosu = new bool[m+1];
	for (i = 0; i < m + 1; i++)
		sosu[i] = true;
	sosu[1] = false;

	for (i = 2; i <= m; i++) {
		if (sosu[i]) {
			if (sosu[i] * sosu[i] > 1000001)
				break;
			for (j = 2 * i; j <= m; j += i)
				sosu[j] = false;
		}
	}

	for (i = n; i <= m; i++) {
		if (sosu[i]) cout << i << "\n";
	}
	delete[] sosu;
	return 0;
}