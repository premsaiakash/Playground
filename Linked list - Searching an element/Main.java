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
  if(head==NULL)
  {
    node* newnode=new node;
    newnode->data=val;
  newnode->next=NULL;
  head=newnode;
  }
  else
  {
    node* newnode=new node;
    newnode->data=val;
  newnode->next=NULL;
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
 
  while(1)
  {
  int val;
   cin>>val;
   if(val<0)
     break;
    else
    {
      push(val);
    }
  }
  int check;int flag=0;
  cin>>check;
 node* cur=head;
  while(cur!=NULL)
  {
  if(cur->data==check)
    flag=1;
    cur=cur->next;
  }
  cout<<"Enter the value to be searched:"<<endl;
  if(flag==1)
    cout<<check<<" is present in the list";
  else
    cout<<check<<" is not present in the list";
  return 0;
}