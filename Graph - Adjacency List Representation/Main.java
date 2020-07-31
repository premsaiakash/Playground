#include<iostream>
#include<vector>
using namespace std;
int main()
{
  cout<<"Enter the number of vertices:"<<endl;
  cout<<"Enter the number of edges:"<<endl;
  int v;int e;
  vector<int> ven[v];
  cin>>v;
  cin>>e;
  for(int i=1;i<=e;i++)
  {
    int start,end;
    cin>>start>>end;
  cout<<"Enter the Start node and End node of edge "<<i<<endl;
    ven[start].push_back(end);
    ven[end].push_back(start);
  }
  cout<<"Adjacency List:"<<endl;
  for(int i=0;i<v;i++)
  {
  cout<<i<<"--->";
    for(auto x:ven[i])
    {
    cout<<x<<" ";
    }
    cout<<endl;
  }
  return 0;
}