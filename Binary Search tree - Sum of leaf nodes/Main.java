#include<iostream>
using namespace std;
struct node
{
int data;
  node* left;
  node* right;
};
int sum=0;
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
void height(struct node* t)
{
    node* temp=t;
    if(temp==NULL)
    {return ;}
  	if(temp->left==NULL && temp->right==NULL)
    {
    sum+=temp->data;
    }
    height(temp->left);
    height(temp->right);
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
 height(head);
  cout<<"Sum of all leaf nodes are "<<sum;
  return 0;
}