#include<iostream>
#include<string>
using namespace std;
int main()
{
  cout<<"Enter the input string:"<<endl;
  string org;
  getline(cin,org);
   cout<<"Enter the substring to be inserted:"<<endl;
  string sup;
  getline(cin,sup);
   cout<<"Enter the start position of substring:"<<endl;
  int pos;
  cin>>pos;int len;cin>>len;
  org.replace(pos,len,sup);
  cout<<org;
  return 0;
}