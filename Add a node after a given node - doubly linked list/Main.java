#include<iostream>
using namespace std;
struct node
{
int data;
  node* left=NULL;
  node* right=NULL;
};
struct node* head=NULL;
void ad(int pos,int vall)
{
  
  int ind=0;
  node* time=NULL;
  node* f=head;
  if(head==NULL)
  {
  node* newnode=new node;
  newnode->left=NULL;
  newnode->data=vall;
  newnode->right=NULL;
    head=newnode;
  }
  while(f!=NULL && ind!=pos)
  {
    time=f;
  ind++;f=f->right;
  }
  if(f==NULL)
  {
    node* newnode=new node;
  newnode->data=vall;
  newnode->right=NULL;
  time->right=newnode;
    newnode->left=time;
  }
  else if(ind==pos)
  {
    node* newnode=new node;
  newnode->data=vall;
  newnode->right=time->right;
    time->right->left=newnode;
    time->right=newnode;
    newnode->left=time;
  }
}
void push(int val)
{
node* newnode=new node;
  newnode->left=NULL;
  newnode->data=val;
  newnode->right=NULL;
  node* temp=head;
  if(head==NULL)
    head=newnode;
  else
  {
  while(temp->right!=NULL)
  {
  temp=temp->right;
  }
    temp->right=newnode;
    newnode->left=temp;
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
  cout<<"Before inserting:"<<endl;
  node* t=head;
  while(t!=NULL)
  {
  cout<<t->data<<endl;
    t=t->right;
  }
  cout<<"Enter the value and position"<<endl;
  int pos,vall;
  cout<<"After inserting:"<<endl;
  cin>>pos;
  cin>>vall;
  ad(pos,vall);
  node* ti=head;
  while(ti!=NULL)
  {
  cout<<ti->data<<endl;
    ti=ti->right;
  }
  return 0;
}