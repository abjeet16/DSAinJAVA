#include<stdio.h>
#include <stdlib.h>
struct Node{
    int val;
    struct Node* nxt;
};
struct Node* head = NULL;
int isEmpty(){
    if(head==NULL){
        printf("stack is Empty\n");
        return 1;
    }else{
        return 0;
    }
}
void pop(){
    if(isEmpty()){
        return;
    }
    printf("poped %d",head->val);
    head = head->nxt;
}
void peek(){
    if(isEmpty())
        return;
    printf("top : %d \n",head->val);
}
void display(struct Node* node){
    if(node==NULL)
        return;
    printf("%d ",node->val);
    display(node->nxt);
}
void push(int val){
    struct Node* new = (struct Node*)malloc(sizeof(struct Node));
    new->val = val;
    new->nxt = head;
    head = new;
}
void main(){
    while(1){
        printf("1.push \n2.display \n3.pop 4.peek\n");
        int c;
        scanf("%d",&c);
        switch(c){
            case 1:{
                int val;
                printf("enter value to insert\n");
                scanf("%d",&val);
                push(val);
                break;
            }
            case 2:
                display(head);
                break;
            case 3:
                pop();
                break;
            case 4:
                peek();
                break;
            case 5:
                exit(0);
            default:
                printf("invalid choice\n");
        }
    }
}