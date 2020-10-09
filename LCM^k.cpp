#include<bits/stdc++.h>
using namespace std;
#define fast ios_base::sync_with_stdio(false);cin.tie(NULL);cout.tie(NULL)
#define ll long long
#define mx 1000001
long long p[1000001];
void seive()
{
    for(int i=0;i<mx;i++)
    p[i]=i;
    for(int i=2;i*i<mx;i++)
    {
        if(p[i])
        {
            for(int j=i*2;j<mx;j+=i)
            {
                if(p[j]==j)
                p[j]=i;
            }
        }
    }
}
ll power(ll a,ll b,ll m)
{
    ll res=1;
    while(b>0)
    {
        if(b&1)
        res=(res*a)%m;
        a=(a*a)%m;
        b/=2;
    }
    return res;
}
void solve(unsigned ll x,map<ll,ll> &m)
{
    map<ll,ll> m2;
    while(x!=1)
    {
        m2[p[x]]++;
        m[p[x]]=max(m2[p[x]],m[p[x]]);
        x/=p[x];
    }
}
int main()
{
    fast;
    seive();
    int t;
    cin>>t;
    ll n,m,k,l;
    while(t--)
    {
        cin>>n>>m>>k;
        ll a[n];
        map<ll,ll> m2;
        unsigned ll x=1;
        for(int i=0;i<n;i++)
        {
            cin>>a[i];
            solve(a[i],m2);
        }
        for(auto it:m2)
        {
            it.second=power(it.first,it.second*k,m);
            x=(x%m*(it.second%m))%m;
        }
        cout<<x<<'\n';
        m2.clear();
    }
    return 0;
}
