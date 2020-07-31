#include<iostream>
#include<stack>
using namespace std;
struct node
{
int data;
  node* next;
};
struct node* head=NULL;
stack<int> st;
void push(int val)
{
node* newnode=new node;
  newnode->data=val;
  newnode->next=NULL;
  if(head==NULL)
  {
  head=newnode;
    st.push(newnode->data);
  }
  else
  {
  node* temp=head;
    while(temp->next!=NULL)
      temp=temp->next;
    temp->next=newnode;
    st.push(newnode->data);
  }
}
int main()
{
  int data;
  while(1)
  {
  cin>>data;
    if(data<0)
      break;
    push(data);
  }
  while(!st.empty())
  {
  cout<<st.top()<<" ";
    st.pop();
  }
  return 0;
}