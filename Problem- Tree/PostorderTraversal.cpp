// This commit includes only the postOrder function. 
// The rest of the implementation and context are present in the 
// GeeksforGeeks (GFG) code editor.

void postorderTra(Node* root,vector<int> &result){
        if(root==NULL) return;
        
        postorderTra(root->left,result);
        postorderTra(root->right,result);
        result.push_back(root->data);
}
vector <int> postOrder(Node* root)
{
  // Your code here
  vector<int> result;
  postorderTra(root,result);
  return result;
}