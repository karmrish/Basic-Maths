#include<iostream>
using namespace std;
void prime(int n)
{int co=0;
    for(int i=1;i<=n;i++)
    {if(n%i==0)
    co++;}
    if(co==2)
    cout<<"True";
    else
    cout<<"False";}
    int main()
    {
        int n;
        cin>>n;
        prime(n);
    }
