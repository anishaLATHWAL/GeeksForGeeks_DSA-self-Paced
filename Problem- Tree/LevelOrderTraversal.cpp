// This commit includes only the levelOrder function. 
// The rest of the implementation and context are present in the 
// GeeksforGeeks (GFG) code editor.

vector<int> levelOrder(Node* root)
    {
      //Your code here
      vector<int> ans;
      if(root==NULL) return ans;
      queue <Node*> q;
      q.push(root);
      while(!q.empty()){
          int size = q.size();
          Node* node = q.front();
          q.pop();
          if(node->left != NULL){
              q.push(node->left);
          }
          if(node->right !=NULL){
              q.push(node->right);
          }
          ans.push_back(node->data);
      }
      return ans;
    }