#include<iostream>
using namespace std;
struct node
{
int data;
  node* next;
  node* prev;
};
struct node* head=NULL;
struct node* tail;
void rev()
{
  node* cur=head;
  if(cur->next==NULL)
    return;
  else{
  node* net;
  while(cur!=NULL)
  {
    net=cur->prev;
    cur->prev=cur->next;
    cur->next=net;
    cur=cur->prev;
  }
  if(net!=NULL)
  net=net->prev;
  head=net;
  }
}
void push(int val)
{	
  node* newnode=new node;
  newnode->data=val;
  newnode->prev=NULL;
  newnode->next=NULL;
  if(head==NULL)
  {
  head=newnode;
  }
  else
  {
  	node* t=head;
    while(t->next!=NULL)
    t=t->next;
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
  node* temp=head;
  cout<<"Original order:"<<endl;
  while(temp!=NULL)
  {
  cout<<temp->data<<endl;
  temp=temp->next;
  }
  rev();
  node* temp1=head;
  cout<<"Reverse order:"<<endl;
  while(temp1!=NULL)
  {
  cout<<temp1->data<<endl;
  temp1=temp1->next;
  }
  return 0;
}