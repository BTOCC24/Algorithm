//20/1/1 09:17 1546
#include <iostream>
using namespace std;
int main()
{
	int N, max = -1;
	float avg = 0;
	int *grade;
	cin >> N;
	grade = new int[N];
	for (int i = 0; i < N; i++) {
		cin >> grade[i];
		if (grade[i] > max)
			max = grade[i];
		avg += grade[i];
	}
	cout << float((avg / N) / max * 100);
}
