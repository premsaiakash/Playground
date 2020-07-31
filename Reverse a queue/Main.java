#include<iostream>
using namespace std;
int front=-1;
int rear=-1;
int a[10];
void enque(int data)
{
if(front==-1)
{
front++;rear++;
}
  else
  {
  rear++;
  }
  a[rear]=data;
}
int main()
{
  int ind=1;
  while(1)
  {
    int data;
  cin>>data;
      if(data<0)
      break;
    if(ind==1)
    {
      cout<<"Before reversing:"<<endl;ind++;
    }
      enque(data);
    cout<<data<<" ";
  }
  if(front!=-1 && rear!=-1){
     
  cout<<endl<<"After reversing:"<<endl;}
  if(front==-1 && rear==-1)
    cout<<"Queue is empty"<<endl;
  else
  {
  for(int i=rear;i>=front;i--)
    cout<<a[i]<<" ";
  }
  return 0;
}