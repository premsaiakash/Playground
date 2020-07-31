#include<iostream>
#include<queue>
using namespace std;
int main()
{
  priority_queue<int> q;
  cout<<"Enter the number of values to be inserted:"<<endl;
  cout<<"Enter the values to be inserted in priority queue:"<<endl;
  cout<<"The priority queue elements are:"<<endl;
  int data;
  cin>>data;
  while(data--)
  {
  int v;
    cin>>v;
    q.push(v);
  }
  while(!q.empty())
  {
  cout<<q.top()<<" ";
    q.pop();
  }
  return 0;
}