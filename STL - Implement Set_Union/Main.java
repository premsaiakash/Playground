#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int b=2*n;
  int a[b];
  cout<<"Enter the no of values:"<<endl;
  if(n==0)
    cout<<"No values has been inserted"<<endl;
  else{
  cout<<"Enter the value of first array:"<<endl;
  cout<<"Enter the value of second array:"<<endl;
 
  int ind=0;
  for(int i=0;i<n;i++)
  {
  cin>>a[ind++];
  }
  for(int i=0;i<n;i++)
  {
   cin>>a[ind++];
  }
 for(int i=0;i<b-1;i++)
 {
 for(int j=i+1;j<b;j++)
 {
 if(a[i]>a[j])
 {
 int re=a[i];a[i]=a[j];a[j]=re;
 }
 }
 }
  int cn=0;
  for(int i=0;i<b;i++)
  {
    if(a[i]!=a[i+1])
    cn++;
    
  }
   cout<<"The union has "<<cn<<" elements:"<<endl;
  for(int i=0;i<b;i++)
  {
    if(a[i]!=a[i+1])
    cout<<a[i]<<"  ";
  }
  }
return 0;
}