#include<iostream>
using namespace std;
struct node
{
int data;node* left;node* right;
};
int height(struct node*);
void printlevelorder(struct node*,int);
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
    while(1){
  		if(val<temp->data)
  		{
  		
        if(temp->left!=NULL)
          temp=temp->left;
          else
          { temp->left=newnode;break;}
      
  		}
    	else
        {
  		
        if(temp->right!=NULL)
          temp=temp->right;
          else
          {temp->right=newnode;break;}
       
  		} 
    }
  }
}
void printing(struct node* temp)
{
  int h=height(temp);
 // cout<<h;
  for(int i=1;i<=h;i++)
  {
    printlevelorder(temp,i);
  }
}
void printlevelorder(struct node* n,int level)
{
  if(n==NULL)
    return;
  if(level==1)
  cout<<n->data<<" ";
  else if(level>1)
  {
  printlevelorder(n->left,level-1);
   printlevelorder(n->right,level-1); 
  }
}
int height(struct node* root)
{
if(root==NULL)
  return 0;
  int lh=height(root->left);
  int rh=height(root->right);
  if(lh>rh)
    return (lh+1);
  else
    return (rh+1);
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
  cout<<"Level order Traversal:"<<endl;
  printing(head);
  return 0;
}