//Count of digits
#include<iostream>
 using namespace std;
 int count(int n)
{ int co=0;
    while(n>0)
    {
        co=co+1;
        n=n/10;
    }
    return co;}
    int main()
    {int n;
    cin >> n;
    cout<< count(n);
    return 0;
}

