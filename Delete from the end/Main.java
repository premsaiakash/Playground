#include<iostream>
using namespace std;
struct node
{
int data;node* next;
};
struct node* head=NULL;
void del()
{
node* cur=head;
  node* dup=NULL;
  while(cur->next!=NULL)
  {
  dup=cur;
    cur=cur->next;
  }
  dup->next=NULL;
}
void push(int val)
{
node* newnode=new node;
  newnode->data=val;
  newnode->next=NULL;
  if(head==NULL)
    head=newnode;
  else
  {
  node* temp=head;
    while(temp->next!=NULL)
    {
    temp=temp->next;
    }
    temp->next=newnode;
  }
}
int main()
{
  int count=0;
  int val;
  while(1)
  {
  cin>>val;
  if(val<0)
    break;
    else
    {   push(val);
	count++;  
    }
  }
  int dum=count;
  cout<<"Before deletion:"<<endl;
  node* t=head;
  while(t!=NULL)
  {
  cout<<t->data<<endl;t=t->next;
  }
  for(int i=1;i<count;i++)
  {
    del();
  cout<<"After "<<i<<" deletion:"<<endl;
    node* te=head;
  while(te!=NULL)
  {
  cout<<te->data<<endl;te=te->next;
  }
  }
  cout<<"After "<<dum<<" deletion:"<<endl;
  cout<<"No value to delete";
  return 0;
}