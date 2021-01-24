#include <iostream>
#include <algorithm>
using namespace std;
int main() {
	unsigned int N, i;
	int *arr;
	cin >> N;
	arr = new int[N];
	for (i = 0; i < N; i++)
		cin >> arr[i];

	sort(arr, arr + N);

	for (i = 0; i < N; i++) {
		cout << arr[i] << endl;
	}
}