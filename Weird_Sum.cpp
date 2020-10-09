//Dynammic Programming -July Circuits-Hackerearth

#include<bits/stdc++.h>
using namespace std;
#define fast ios_base::sync_with_stdio(false);cin.tie(NULL);cout.tie(NULL)
#define ll long long
long long p[10002][1002];
ll knap(ll a[],ll n,ll k,ll m)
{
    if(n==0 || k==0)
    return 0;
    if(p[n][k]!=-1)
    return p[n][k];
    else if(n==k)
    {
        ll res=0;
        while(k)
        {
          res=res+(a[k-1]*(k%m));
          k--;
        }
        return res;
    }
    else
    return p[n][k]=max(((a[n-1]*(k%m))+knap(a,n-1,k-1,m)),knap(a,n-1,k,m));
}
int main()
{
    fast;
    memset(p,-1,sizeof(p));
    ll n,k,m;
    cin>>n>>k>>m;
    ll i=0,a[n];
    while(i<n)
    {
        cin>>a[i];
        i++;
    }
    cout<<knap(a,n,k,m)<<'\n';
    return 0;
}
