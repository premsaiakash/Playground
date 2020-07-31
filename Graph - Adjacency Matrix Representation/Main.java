#include<iostream>
using namespace std;
int main()
{
  int n;int e;
  cout<<"Please enter the number of nodes in the graph"<<endl;
  cin>>n;
  cout<<"Please enter the number of edges in the graph"<<endl;
  cin>>e;
  int arr[n][n];
  for(int i=0;i<n+1;i++)
  {
  for(int j=0;j<n+1;j++)
  {
  	arr[i][j]=0;
  }
  }
  string dir;
  cout<<"Is the graph directed"<<endl;
  cin>>dir;
  cout<<"Adjacency Matrix Representation:"<<endl;
  for(int i=1;i<n+1;i++)
  {
  		for(int j=1;j<=n;j++)
  		{
  			cout<<arr[i][j]<<" ";
  		}
    cout<<endl;
  }
  int n1;int n2;int w;
   for(int i=1;i<=e;i++)
   {
     cout<<"Enter the start node, end node and weight of edge no "<<i<<endl;
     cin>>n1>>n2>>w;
     if(dir=="yes")
     arr[n1][n2]=w;
     else
     {
     arr[n1][n2]=w;
       arr[n2][n1]=w;
     }
   }
  cout<<"Adjacency Matrix Representation:"<<endl;
  for(int i=1;i<n+1;i++)
  {
  	for(int j=1;j<n+1;j++)
  	{
  		cout<<arr[i][j]<<" ";
  	}
    cout<<endl;
   }
  return 0;
}