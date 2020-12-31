#include <iostream>
using namespace std;

int main()
{
	int* data;
	int n, m;

	int sum = -1;
	cin >> n >> m;
	data = new int[n];
	for (int i = 0; i < n; i++)
		cin >> data[i];
	for (int i = 0; i < n; i++)
		for (int j = i+1; j < n; j++)
			for (int k = j+1; k < n; k++) {
				int hap = data[i] + data[j] + data[k];
				if (hap <= m && hap > sum) {
					sum = hap;
				}
			}
	cout << sum;
}
