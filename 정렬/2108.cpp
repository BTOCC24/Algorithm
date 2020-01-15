//20/1/16 00:49 2108
#include <iostream>
#include <algorithm>
#include <cmath>
const int num = 8001;

using namespace std;
int main() {
	int n, sum = 0;
	int *arr;
	int cnt[num];
	fill_n(cnt, num, 0);
	cin >> n;
	arr = new int[n];
	for (int i = 0; i < n; i++) {
		cin >> arr[i];
		cnt[arr[i] + 4000]++;
		sum += arr[i];
	}
	sort(arr, arr + n);
	cout << round(sum / (double)n) << endl;
	cout << arr[n / 2] << endl;
	int max = *(max_element(cnt, cnt + num));
	if (count(cnt, cnt + num, max) == 1) {
		cout << (find(cnt, cnt + num, max) - cnt) - 4000 << endl;
	}
	else {
		cout << find(find(cnt, cnt + num, max) + 1, cnt + num, max) - cnt - 4000 << endl;
	}
	cout << *(max_element(arr, arr + n)) - *(min_element(arr, arr + n));
}
