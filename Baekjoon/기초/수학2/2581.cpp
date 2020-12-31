//20/1/6 2581 15:25
#include <iostream>
using namespace std;

bool issosu(int n) {
	bool result = false;
	int i;
	for (i = 2; i < n; i++) {
		if (n % i == 0)
			break;
	}
	if (i == n)
		result = true;
	return result;
}

int main()
{
	int input, input2;
	int min = 0, sum = 0;
	cin >> input >> input2;
	for (int i = input; i <= input2; i++) {
		if (issosu(i)) {
			if (min == 0)
				min = i;
			sum += i;
		}
	}
	if (min == 0)
		cout << -1;
	else
		cout << sum << endl << min;
}

