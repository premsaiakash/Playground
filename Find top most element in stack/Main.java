#include<iostream>
#include<stack>
using namespace std;
int main()
{
  int data;
  stack<int> st1;
  stack<int> st2;
  stack<int> st3;
  cout<<"Before maximizing:"<<endl;
  while(1)
  {
    cin>>data;
    if(data<0)
      break;
    st2.push(data);
    if(!st1.empty())
    {
      if(st1.top()>data)
      {
      st1.push(st1.top());
      }
      else
        st1.push(data);
    }
    else
    {
    st1.push(data);
    }
  }
  while(!st2.empty())
  {
  cout<<st2.top()<<" ";
  st2.pop();
  }
  cout<<endl;
  cout<<"After maximizing:"<<endl;
  while(!st1.empty())
  {
  st3.push(st1.top());
  st1.pop();
  }
  while(!st3.empty())
  {
  cout<<st3.top()<<" ";
  st3.pop();
  }
  return 0;
}