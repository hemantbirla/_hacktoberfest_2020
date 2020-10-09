#include <bits/stdc++.h>
#define rep(i,n) for(int i = 0; i < (n); ++i)
#define repF(i,a,n) for(int i = (a); i <= (n); ++i)
#define repB(i,a,n) for(int i = (a); i >= (n); --i)
#define fast ios_base::sync_with_stdio(false);cin.tie(NULL);cout.tie(NULL)
using namespace std;
using ll = long long;
int main() {
    fast;
    string s;
    cin>>s;
    stack<char> s1;
    for(int i=0;i<s.length();i++)
    {
        if(s[i]=='(')
        s1.push('(');
        else if(s[i]==')'){
            if(s1.empty())
             s1.push(')');
            else if(s1.top()=='(')
               s1.pop();
            else 
              s1.push(')');
        }

    }
    cout<<s1.size()<<'\n';
}
