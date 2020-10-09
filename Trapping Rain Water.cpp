#include<bits/stdc++.h>
using namespace std;
long a[10000001];
long waterf(long a[],long n)
{
    long lmax[n],rmax[n],s=0;
    for(long i=0;i<n;i++)
	 {
	      if(i==0)
	       lmax[i]=a[i];
	      else
	           lmax[i]=max(lmax[i-1],a[i]);
	 }
	  for(long i=n-1;i>=0;i--)
	   {
	       if(i==n-1)
	       rmax[i]=a[i];
	       else
	          rmax[i]=max(rmax[i+1],a[i]);
	   }
	   for(long i=1;i<n-1;i++)
	   {
	       s+=min(lmax[i],rmax[i])-a[i];
	   }
	   return s;
}
int main()
{
	int t;
	long n;
	cin>>t;
	while(t--)
	{
	   cin>>n;
	   long s=0;
	   for(long i=0;i<n;i++)
	   {
	       cin>>a[i];
	   }
	   s=waterf(a,n);
	   cout<<s<<'\n';
	}
	return 0;
}
