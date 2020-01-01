//20/1/1 10:12 15596
#include <iostream>
#include <vector>
using namespace std;

long long sum(vector<int> &a) {
	long long sum=0;
	for (vector<int>::iterator p = a.begin(); p != a.end(); p++) {
		sum += *p;
	}
	return sum;
}

int main()
{
	long long result = 0;
	vector<int> a = { 10,20,30,40,50 };
	result = sum(a);
	cout << result;
}
