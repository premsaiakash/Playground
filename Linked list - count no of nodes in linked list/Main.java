#include<iostream>
using namespace std;
struct node
{
int data;
  node* next;
};
int count=0;
struct node* head=NULL;
void push(int val)
{
  node* newnode=new node;
  newnode->data=val;
  newnode->next=NULL;
  if(head==NULL)
  {
   head=newnode;
   count++; 
  }
  else
  {
   node* temp=head;
    while(temp->next!=NULL)
    {
    temp=temp->next;
    }
    temp->next=newnode;
    count++;
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
  cout<<"There are "<<count<<" values present in the list and the values are"<<endl;
  node* cur=head;
  while(cur!=NULL)
  {
  cout<<cur->data<<" ";
    cur=cur->next;
  }
  return 0;
}