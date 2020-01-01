//20/1/1 09:44 4344
#include <iostream>
#include <string>
using namespace std;
int main()
{
	int C;
	cin >> C;
	for (int i = 0; i < C; i++) {
		int n = 0;
		double avg = 0, cnt = 0;
		int *arr;
		cin >> n;
		arr = new int[n];
		for (int j = 0; j < n; j++) {
			cin >> arr[j];
			avg += arr[j];
		}
		avg /= n;
		for (int j = 0; j < n; j++) {
			if (arr[j] > avg)
				cnt++;
		}
		printf("%.3f%%\n", cnt / n * 100);
	}
}
