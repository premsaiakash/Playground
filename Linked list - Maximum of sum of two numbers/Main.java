#include <iostream>
using namespace std;
struct node
{
int data;
  node* next;
};
int a=-1,b=-1;
void push(int val)
{
node* newnode=new node;
  newnode->next=NULL;
  newnode->data=val;
  if(val>a)
  {
    b=a;
  a=val;
  }
}
struct node* head=NULL;
int main() 
{
   int val;
  while(1)
  {
  cin>>val;
    if(val<0)
      break;
    else
      push(val);
  }
  cout<<a+b;
    return 0;
}