// This commit includes only the inOrder function. 
// The rest of the implementation and context are present in the 
// GeeksforGeeks (GFG) code editor.

class Solution {
  public:
    // Function to return a list containing the inorder traversal of the tree.
    void inorderTra(Node* root,vector<int> &result){
        if(root==NULL) return;
        
        inorderTra(root->left,result);
        result.push_back(root->data);
        inorderTra(root->right,result);
        
    }
    vector<int> inOrder(Node* root) {
        // Your code here
        vector<int> result;
        inorderTra(root,result);
        return result;
    }
};