#include<iostream>
using namespace std;
int sum=0;
struct node
{
int data;
  node* left=NULL;node* right=NULL;
};
struct node* head=NULL;
void append(int val)
{
node* newnode=new node;
  newnode->data=val;
  newnode->left=NULL;
  newnode->right=NULL;
  if(head==NULL)
    head=newnode;
  else
  {
  node* temp=head;
    while(1)
    {
      if(val<temp->data)
      {
      if(temp->left!=NULL)
      {
    	temp=temp->left;
      }
      else
      {
      temp->left=newnode;
        break;
      }
      }
      else
      {
      if(temp->right!=NULL)
      {
    	temp=temp->right;
      }
      else
      {
      temp->right=newnode;
        break;
      }
      }
    }//while
  }
}
void traverse(node* head)
{
node* temp=head;
  if(temp==NULL)
    return;
  else
  {
  traverse(temp->left);
    sum+=temp->data;
    traverse(temp->right);
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
      append(val);
  }
  cout<<"Sum of all nodes are ";
  traverse(head);
  cout<<sum;
  return 0;
}