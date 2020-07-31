#include<iostream>
#include<vector>
#include<algorithm>

using namespace std;
int main()
{
  cout<<"Enter the value to be assigned and how many times:"<<endl;
  int val,num;
  cin>>val>>num;
  cout<<"The assigned values are:"<<endl;
  vector<int> v;
  v.assign(num,val);
  for(int i=0;i<v.size();i++)
    cout<<v[i]<<" ";
  cout<<endl<<"Enter the number of values to be inserted:"<<endl;
  int n;cin>>n;
  while(n--)
  {
  cout<<"Enter the value:"<<endl;
    int d;cin>>d;v.push_back(d);
  }
  cout<<"The values are:"<<endl;
  for(int i=0;i<v.size();i++)
    cout<<v[i]<<" ";
  cout<<endl<<"The first element erased is "<<v[0]<<endl;
 vector<int>::iterator it;
  it=v.begin();
  v.erase(it);
  cout<<"Enter the value to be inserted at the beginning:"<<endl;
  int beg;cin>>beg;
  v.emplace(v.begin(),beg);
  cout<<"Enter the value to be inserted at the end:"<<endl;
  int end;cin>>end;
  v.emplace_back(end);
   for(int i=0;i<v.size();i++)
    cout<<v[i]<<" ";
  return 0;
}