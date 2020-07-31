#include<iostream>
using namespace std;
struct node
{
int data;
  node* next;
};
struct node* head=NULL;
void push(int val)
{
  int flag=0;
  node* newnode=new node;
  newnode->data=val;
  newnode->next=NULL;
  if(head==NULL)
  {
  head=newnode;
  }
  else
  {
    node* prev=NULL;
    node* temp=head;
  while(temp!=NULL)
  {
    prev=temp;
  if(temp->data==val)
    flag=1;
    temp=temp->next;
  }
    if(flag==0)
     prev->next=newnode; 
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
  node* t=head;
  while(t!=NULL)
  {
  cout<<t->data<<endl;
    t=t->next;
  }
  return 0;
}