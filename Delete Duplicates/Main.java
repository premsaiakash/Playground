#include<iostream>
using namespace std;
struct node
{
int data;
  node* next;
};
struct node* head=NULL;
void rem()
{
  node* p=head;
  while(p!=NULL)
  {
  	node* q=p;
  	while(q->next!=NULL)
  	{
    	if(q->next->data==p->data)
  		{
          q->next=q->next->next;
  		}
    	else
  		q=q->next;
  	}
    p=p->next;
  }
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
  int val;
  while(1)
  {
  cin>>val;
    if(val<0)
      break;
    else
      push(val);
  }
  cout<<"Linked list before removal of duplicates"<<endl;
  node* temp=head;
  while(temp!=NULL)
  {
  cout<<temp->data<<endl;
    temp=temp->next;
  }
  rem();
  cout<<"Linked list after removal of duplicates"<<endl;
  node* temp1=head;
  while(temp1!=NULL)
  {
  cout<<temp1->data<<endl;
    temp1=temp1->next;
  }
  return 0;
}