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
void finder()
{
node* last=head;
  node* lsec=NULL;
  while(last->next!=NULL)
  {
  lsec=last;
    last=last->next;
  }
  if(lsec==NULL)
    cout<<"There is no second last element in the list"<<endl;
  else
    cout<<lsec->data<<" is the second last element in the list"<<endl;
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
  finder();
  return 0;
}