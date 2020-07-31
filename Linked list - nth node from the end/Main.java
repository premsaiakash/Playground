#include<iostream>
using namespace std;
struct node{int data;node* next;};
struct node* head=NULL;
int count=0;
void push(int val)
{
node* newnode=new node;newnode->data=val;newnode->next=NULL;
  if(head==NULL)
    head=newnode;
  else
  {
  node* temp=head;
    while(temp->next!=NULL)
    temp=temp->next;
   temp->next=newnode;
  }
  count++;
}
void finder(int num)
{
  node* p=head;
  node* q=head;
  int flag=0;
  int steps=num-1;
  while(steps--)
  {
    q=q->next;
  }
  while(q->next!=NULL)
  {
  q=q->next;
  p=p->next;
  }
  if(flag==0)
  cout<<p->data<<" is the nth node element in the list"<<endl;
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
  cout<<"Enter the nth node:"<<endl;
  node* t=head;
 // while(t!=NULL)
 //   cout<<t->data<<endl;
  int num;
  cin>>num;
  if(num<=count)
  finder(num);
  else
    cout<<"There is no nth node in the list"<<endl;
  return 0;
}