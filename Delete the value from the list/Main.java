#include<iostream>
using namespace std;
struct node
{
  int data;
  node* next;
};
struct node* head=NULL;
void del(int ch)
{
  node* tem1=head;
  node* tem2=NULL;
  int flag=0;
  if(tem1->data==ch && tem1==head)
    head=tem1->next;
  else{
  while(tem1!=NULL)
  {
  		if(tem1->data==ch)
  		{
  			tem2->next=tem1->next;
   			flag=1; 
  		}
    	else if(head->data==ch)
    	{
    	head=tem1->next;
    	}
  		if(flag==1)
  		break;
  		else
  		{
  		tem2=tem1;
    	tem1=tem1->next;
  		}  
   }
  }
}
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
  cout<<"Before deletion:"<<endl;
  node* t=head;
  while(t!=NULL)
  {
    cout<<t->data<<endl;
    t=t->next;
  }
  cout<<"Enter the value to be deleted:"<<endl;
  int ch;
  cin>>ch;
  del(ch);
  cout<<"After deletion:"<<endl;
  node* te=head;
  while(te!=NULL)
  {
    cout<<te->data<<endl;
    te=te->next;
  }
  return 0;
}