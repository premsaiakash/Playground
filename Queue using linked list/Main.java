#include<iostream>
using namespace std;
struct node
{
int data;
  node* next;
};
struct node* head=NULL;
void append(int val)
{
node* newnode=new node;
  newnode->data=val;
  newnode->next=NULL;
  if(head==NULL)
    head=newnode;
  else
  {
  node* t=head;
    while(t->next!=NULL)
      t=t->next;
    t->next=newnode;
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
      append(val);
  }
  node* temp=head;
  while(temp!=NULL)
  {
  cout<<temp->data<<" ";
    temp=temp->next;
  }
  return 0;
}