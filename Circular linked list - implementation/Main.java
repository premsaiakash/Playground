#include<iostream>
using namespace std;
struct node
{
int data;
  node* next;
  node* prev;
};
struct node* head=NULL;
struct node* tail=NULL;
void push(int val)
{

  node* newnode=new node;
  newnode->data=val;
  newnode->prev=NULL;
  newnode->next=NULL;
  tail=newnode;
  if(head==NULL)
  {
  head=newnode;
    newnode->prev=head;
  }
  else
  {
  node* t=head;
    while(t->next!=NULL)
    {
    t=t->next;
    }
    t->next=newnode;
    newnode->prev=t;
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
  tail->next=head;
  head->prev=tail;
  node* temp=head;
  while(temp->next!=head)
  {
  cout<<temp->data<<endl;
  temp=temp->next;
  }
  cout<<temp->data<<endl;
  return 0;
}