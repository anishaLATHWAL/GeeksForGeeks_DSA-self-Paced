
// This commit includes only the preorder function. 
// The rest of the implementation and context are present in the 
// GeeksforGeeks (GFG) code editor.

void preorderTraversal(Node* root, vector<int> &result){
    
    if(root==NULL) return;
    
    result.push_back(root->data);
    
    preorderTraversal(root->left,result);
    preorderTraversal(root->right,result);
}
vector <int> preorder(Node* root)
{
  // Your code here
  vector<int> result;
  preorderTraversal(root,result);
  return result;
}