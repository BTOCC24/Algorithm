//20/1/11 15:47 2750
#include <iostream>
using namespace std;
int main() {
	unsigned int N, temp, i, j;
	int *arr;
	cin >> N;
	arr = new int[N];
	for (i = 0; i < N; i++)
		cin >> arr[i];

	for (i = 0; i < N - 1; i++) {
		temp = i;
		for (j = i + 1; j < N; j++) {
			if (arr[temp] > arr[j])
				temp = j;
		}
		swap(arr[i], arr[temp]);
	}

	for (i = 0; i < N; i++) {
		cout << arr[i] << endl;
	}
}