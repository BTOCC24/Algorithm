//20/1/9 10870 14:37
#include <iostream>

using namespace std;
int fibonacci(int n) {
	if (n == 0 || n == 1)
		return n;
	return fibonacci(n - 2) + fibonacci(n - 1);
}
int main()
{
	int n;
	cin >> n;
	cout << fibonacci(n);
}