#include<iostream>
using namespace std;
struct node
{
int data;node* left;node* right;
};
struct node* head=NULL;
void append(int);
void inorder(node* temp)
{
  if(temp==NULL)
    return;
  else
  {
  inorder(temp->left);
    cout<<temp->data<<" ";
    inorder(temp->right);
  }
  
}//end
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
  cout<<"Tree values are:"<<endl;
  inorder(head);
  return 0;
}
void append(int val)
{
node* newnode=new node;
newnode->data=val;newnode->left=NULL;newnode->right=NULL;
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
  		}
	}
}