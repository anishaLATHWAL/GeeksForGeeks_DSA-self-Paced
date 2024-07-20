// This commit includes only the height function. 
// The rest of the implementation and context are present in the 
// GeeksforGeeks (GFG) code editor.

int height(struct Node* node){
        // code here 
        if (node==NULL) return 0;
        
        else
        {
            return max(height(node->left),height(node->right))+1;
        }
    }