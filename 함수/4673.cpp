//20/1/1 10:19 4673
#include <iostream>
using namespace std;

int selfnum(int n);

int main()
{
	int arr[11000] = { 0, };
	for (int i = 1; i <= 10000;i++) {
		int result = selfnum(i);
		arr[result]++;
	}
	for (int i = 1; i < 10000; i++) {
		if (arr[i] == 0) {
			cout << i << endl;
		}
	}
}

int selfnum(int n) {
	int result = 0, temp = n;
	for (; temp > 0; temp /= 10) {
		result += (temp % 10);
	}
	result += n;
	return result;
}