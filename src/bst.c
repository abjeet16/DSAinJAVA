#include <stdio.h>
#include<stdlib.h>
struct Node{
    int val;
    struct Node* left;
    struct Node* right;
};
struct Node* head = NULL;
struct Node* cNode(int val){
    struct Node* node = (struct Node*)malloc(sizeof(struct Node));
    node->val = val;
    node->left = NULL;
    node->right = NULL;
    return node;
}
void preOrder(struct Node* root){
    if(root != NULL){
        printf("%d -> ", root->val);
        preOrder(root->left);
        preOrder(root->right);
    }
}
void inOrder(struct Node* root){
    if(root != NULL){
        inOrder(root->left);
        printf("%d -> ", root->val);
        inOrder(root->right);
    }
}
void postOrder(struct Node* root){
    if(root != NULL){
        postOrder(root->left);
        postOrder(root->right);
        printf("%d -> ", root->val);
    }
}
void display(struct Node* root){
    printf("1.pre order 2.in order 3.post order\n");
    int c;
    scanf("%d",&c);
    if(c==1){
        preOrder(root);
    }else if(c==2){
        inOrder(root);
    }else{
        postOrder(root);
    }
}
struct Node* insert(struct Node* root,int val){
    if(root==NULL)
        return cNode(val);
    printf("1.go left\n2.go right \nenter your choice\n");
    int c;
    scanf("%d",&c);
    if(c==1)
        root->left = insert(root->left,val);
    else
        root->right = insert(root->right,val);
    return root;
}
int main()
{
    while(1){
        printf("1.insert \n2.display \n3.exit\n");
        int c;
        scanf("%d",&c);
        switch(c){
            case 1:{
                int val;
                printf("enter value to insert\n");
                scanf("%d",&val);
                head = insert(head,val);
                break;
            }
            case 2:
                display(head);
                break;
            case 3:
                exit(0);
            default:
                printf("invalid choice\n");
        }
    }
    return 0;
}