// Author :Nandini Gupta
// Solution for CVDRUN in the October long challenge 2020

#include<iostream>
#include<string.h>
using namespace std;
int main(){
    int t;
    cin>>t;
    for(int r=0;r<t;r++){
        int n,k,start,end;
        cin>>n>>k>>start>>end;
        int current =start;
        int arr[n];
        memset(arr,0,sizeof(arr));

        for(int i=0;;i++){
            current=(current+k)%n;
            arr[current]=1;
            if(current==end){
                cout<<"YES"<<endl;
                
                break;
            }
            else if(current==start){
                cout<<"NO"<<endl;
                break;
            }
            else continue;
            
        }
        
    }
}
