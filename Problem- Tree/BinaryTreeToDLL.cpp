// This commit includes only the bToDLL function. 
// The rest of the implementation and context are present in the 
// GeeksforGeeks (GFG) code editor.

class Solution
{
    public: 
    //Function to convert binary tree to doubly linked list and return it.
    Node* prev = NULL;
    Node * bToDLL(Node *root)
    {
        // your code here
        
        if(root==NULL) return root;
        
        Node* head = bToDLL(root->left);
        if(prev==NULL) {
            head = root;
        }
        else{
            root->left = prev;
            prev->right = root;
        }
        prev=root;
        bToDLL(root->right);
        return head;
    }
};
