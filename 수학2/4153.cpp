//20/1/8 4153 09:48
#include <iostream>
#include <cmath>
#include <algorithm>
using namespace std;

int main()
{
	int a, b, c;
	
	while(true){
		cin >> a >> b >> c;
		if (a == 0 && b == 0 && c == 0)
			break;
		if (a > c) swap(a, c);
		if (b > c)swap(b, c);
		if (pow(c, 2) == pow(a, 2) + pow(b, 2))
			cout << "right" << endl;
		else
			cout << "wrong" << endl;
	} 
}