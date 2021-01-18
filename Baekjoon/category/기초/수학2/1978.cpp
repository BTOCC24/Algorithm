//20/1/5 1978 04:46
#include <iostream>
using namespace std;

bool issosu(int n) {
	bool result = false;
	int i;
	for (i= 2; i < n; i++) {
		if (n % i == 0)
			break;
	}
	if (i == n)
		result = true;
	return result;
}

int main()
{
	int N, input, cnt=0;
	cin >> N;
	for (int i = 1; i <= N; i++) {
		cin >> input;
		if (issosu(input)) cnt++;
	}
	cout << cnt;
}

