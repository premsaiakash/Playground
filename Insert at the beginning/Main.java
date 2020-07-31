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
node* newnode=new node;
  newnode->data=val;newnode->next=NULL;
  if(head==NULL)
    head=newnode;
  else
  {
  newnode->next=head;
    head=newnode;
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
  node* temp=head;
  while(temp!=NULL)
  {
  cout<<temp->data<<endl;
    temp=temp->next;
  }
  return 0;
}