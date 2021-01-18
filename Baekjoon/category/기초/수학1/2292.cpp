//20/1/2 10:14 2292
#include <iostream>
using namespace std;

int main()
{
	int N, n = 0;
	cin >> N;
	for (n = 1; 3 * (n - 1)*n < (N - 1); n++) {}
	cout << n << endl;
}
//1+3n*(n-1)