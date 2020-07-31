#include <iostream>
#include<vector>
#include<string>
using namespace std;

int main() 
{
  vector<int> v;
  int a;
  
  cin>>a;
  
    int ind=0;
  for(int i=0;i<a;i++)
  {
   if(ind==0)
   {
     ind++;
   cout<<"Enter the number of values to be inserted:"<<endl;
   }
  cout<<"Enter the value to be inserted:"<<endl;
    int k;
    cin>>k;
    v.push_back(k);
  }
  if(v.size()!=0)
  {
  cout<<"The values are:"<<endl;
  for(int i=0;i<a;i++)
    cout<<v[i]<<" ";
  }
  if(v.size()==0)
  {
  cout<<"No value has been inserted"<<endl;
  }
 
    return 0; 
}