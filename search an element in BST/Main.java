#include<iostream>
using namespace std;
struct node
{
int data;node* left;node* right;
};
struct node* head=NULL;
int check=0;
int flag=0;
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
    }
  }
}
void traverse(node* temp)
{
if(temp==NULL)
  return;
  else
  {
  traverse(temp->left);
    if(temp->data==check)
      flag=1;
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
    {break;}
    else
    append(val);
  }
  cin>>check;
  printf("Enter the element to be searched: \n");
  traverse(head);
  if(flag==1)
  cout<<check<<" is present in the BST"<<endl;
  else
  cout<<check<<" is not present in the BST"<<endl; 
  return 0;
}