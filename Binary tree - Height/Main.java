#include<iostream>
using namespace std;
struct node
{
int data;
  node* left;
  node* right;
};
struct node* head=NULL;
void append(int val)
{
node* newnode=new node;
  newnode->data=val;
  newnode->left=NULL;
  newnode->right=NULL;
  if(head==NULL)
  {
  head=newnode;
  }
  else
  {
  node* temp=head;
    while(1)
    {
    if(val<temp->data)
    {
    	if(temp->left!=NULL)
      		temp=temp->left;
      	else
      	{
      	temp->left=newnode;break;
      	}
    }
     else
    {
    if(temp->right!=NULL)
      temp=temp->right;
      else
      {
      temp->right=newnode;break;
      }
    }
    }//while
  }//else
}
int height(struct node* head)
{
if(head==NULL)
  return 0;
  node* temp=head;
    int lh=height(temp->left);
    int rh=height(temp->right);
    if(lh<rh)
      return (rh+1);
    else
      return (lh+1);
}
int main()
{
  int val;
  while(1)
  {
  cin>>val;
    if(val<0)
      break;
    append(val);
  }
  int h=height(head);
  cout<<"Height of the tree is "<<h;
  return 0;
}