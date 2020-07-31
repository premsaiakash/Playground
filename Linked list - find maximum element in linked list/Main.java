#include<iostream>
using namespace std;
struct node
{
int data;
  node* next=NULL;
};
int maxi=0;
struct node* head=NULL;
void push(int val)
{
  node* newnode=new node;
  newnode->data=val;
  newnode->next=NULL;
if(head==NULL)
{
head=newnode;
  maxi=newnode->data;
}
  else
  {
  node* t=head;
    while(t->next!=NULL)
    {
    t=t->next;
    }
    t->next=newnode;
    if(newnode->data>maxi)
      maxi=newnode->data;
  }
}
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
  cout<<maxi;
  return 0;
}