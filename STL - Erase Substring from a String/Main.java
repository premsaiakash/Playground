#include<iostream>
#include<string>
using namespace std;
int main()
{string k;
  cout<<"Enter the input string:"<<endl;
  getline(cin,k);
  
  cout<<"Position after which substring to be erased:"<<endl;
  int pos;
  cin>>pos;
  cout<<"Length of substring to delete:"<<endl;
  int len;
  cin>>len;
  k.erase(pos,len);
  cout<<k;
  return 0;
}