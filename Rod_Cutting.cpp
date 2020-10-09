//Rod Cutting:-https://www.geeksforgeeks.org/cutting-a-rod-dp-13/

#include <bits/stdc++.h>
#define rep(i,n) for(int i = 0; i < (n); ++i)
#define repF(i,a,n) for(int i = (a); i <= (n); ++i)
#define repB(i,a,n) for(int i = (a); i >= (n); --i)
#define fast ios_base::sync_with_stdio(false);cin.tie(NULL);
#define INF INT_MAX
#define T ll t; cin>>t; while(t--)
#define umii unordered_map<int,int>
#define umll unordered_map<ll,ll>
#define mii map<int,int>
#define mll map<ll,ll>
#define vi vector<int>
#define vl vector<ll>
#define F first
#define S second
#define seti set<int>
#define setl set<ll>
#define pb push_back
#define MOD 1000000007
#define all(z) z.begin(),z.end()
using namespace std;
using ll = long long;
vector<vi> tree; // O(n)
int dp[102][102], mx;
/*int LCSubstring(string s1, string s2, int l1, int l2) {
	if (l1 == 0 || l2 == 0)
		return dp[l1][l2] = 0;
	else if (dp[l1][l2] != -1)
		return dp[l1][l2];
	else if (s1[l1 - 1] == s2[l2 - 1])
	{
		dp[l1][l2] = 1 + LCSubstring(s1, s2, l1 - 1, l2 - 1);
		mx = max(mx, dp[l1][l2]);
		return dp[l1][l2];
	}
	else {
		dp[l1][l2] = 0;
		dp[l1][l2 - 1] = LCSubstring(s1, s2, l1, l2 - 1);
		mx = max(mx, dp[l1][l2 - 1]);
		dp[l1 - 1][l2] = LCSubstring(s1, s2, l1 - 1, l2);
		mx = max(mx, dp[l1 - 1][l2]);
		return 0;
	}
}*/
int main() {
	fast;
	int l1, l2, c;
	string s1, s2;
	T{

		cin >> l1 >> l2;
		memset(dp, 0, sizeof(dp));
		mx = 0;
		cin >> s1 >> s2;
		c = 0;
		for (int i = 1; i <= l1; i++) {
			for (int j = 1; j <= l2; j++) {
				if (s1[i - 1] == s2[j - 1]) {
					dp[i][j] = 1 + dp[i - 1][j - 1];
				}
				else {
					dp[i][j] = 0;
				}
				cout << dp[i][j] << " ";
				c = max(c, dp[i][j]);
			}
			cout << '\n';
		}
		//LCSubstring(s1, s2, l1, l2);
		cout << c << '\n';
	}
	return 0;
}
