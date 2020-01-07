//20/1/6 1929 15:27
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
	cin >> input >> input2;
	for (int i = input; i <= input2; i++) {
		if (issosu(i)) {
			cout << i << endl;
		}
	}
}

