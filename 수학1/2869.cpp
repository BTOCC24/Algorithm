//20/1/2 12:01 2869
#include <iostream>
#include <math.h>
using namespace std;

int main()
{
	int A, B, V;
	cin >> A >> B >> V;
	int d;

	d = ceil((double)(V - A) / (double)(A - B)) + 1;
	cout << d;
}


// D일 갈수있는거리
// A+(A-B)*(D-1) >= V
// (V-A)/(A-B)+1 <= D
// 5
// 8
// 