#include <iostream>

using namespace std;

struct node{
    int x;
    node *next;
};

node *cur , *temp, *top=0;

int push(int y){
    temp = new node;
    temp -> x=y;
    temp -> next = top;
    top=temp;
}

int peak(){
    
    if (top!= 0){
        
        cout<<"|___"<<top->x<<"___|"<<endl;

    }
    else{
        cout<<"empty Stack";
    }
}


int pop(){
    cur = top;
    if (top !=0){
        top = top -> next;
        delete cur;
    }
    
}


int main(){
    system("cls");

    int input[100];
    int size;
    cout<<"Size of the stack is ";
    cin>>size;
    for(int i=0; i<size;i++){
        cout<<"=>   ";
        cin>>input[i];
        push(input[i]);
    }
     cout<<"The Inputs are"<<endl;
    for (; top!=0; pop()){
       
        peak();
    }
}
