#include <iostream>
using namespace std;

int main()
{
	int *arr;
	int n, m;
	int sum=0;
	cin >> n >> m;
	arr = new int[n];
	for (int i = 0; i < n; i++)
		cin >> arr[i];
	for(int i=0;i<n;i++)
		for(int j=1;j<n;j++)
			for (int k = 2; k < n; k++) {
				if (i == j || j == k || i == k)
					continue;
				if (m - (arr[i] + arr[j] + arr[k]) >= 0 && sum < arr[i] + arr[j] + arr[k]) {
					sum = arr[i] + arr[j] + arr[k];
				}
			}
	cout << sum;
}
