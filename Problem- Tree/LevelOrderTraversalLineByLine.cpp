

vector<vector<int>> levelOrder(Node* node)
{
  //Your code here

  vector<vector<int>> ans;
  if(node==NULL) return ans;
  queue <Node*> q;
  q.push(node);

  
  while(!q.empty()){
      int size = q.size();
      vector<int> level;
      for(int i=0;i<size;i++){
        
        Node* temp = q.front();
        q.pop();
        
        
        
        if(temp->left !=NULL){
            q.push(temp->left);
        }
        if(temp->right != NULL){
            q.push(temp->right);
        }
        level.push_back(temp->data);
      
      }
      ans.push_back(level);
  }
  return ans;
}