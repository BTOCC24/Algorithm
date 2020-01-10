//20/1/10 02:46 7568
#include <iostream>
using namespace std;

pair<int, int> people[50];
int Rank[50] = { 0, };

void compareRank(const int n) {
	for (int i = 0; i < n; i++)
		for (int j = 0; j < n; j++) {
			if (people[i].first < people[j].first && people[i].second < people[j].second) {
				Rank[i]++;
			}
		}
}

void printRank(const int n) {
	for (int i = 0; i < n; i++)
		cout << Rank[i] + 1 << ' ';
}

int main() {
	int n;
	cin >> n;
	for (int i = 0; i < n; i++)
		cin >> people[i].first >> people[i].second;

	compareRank(n);
	printRank(n);
}