 #include<iostream>
 using namespace std;
 int palin(int n)
 {
    int rev=0;
    int dup=n;
    while(n>0)
    {int ld=n%10;
    n=n/10;
rev=rev*10+ld;}
if(dup==rev)
cout<<"True";
else
cout<<"False";}
int main()
{int n;
cin>>n;
cout<<palin(n);}