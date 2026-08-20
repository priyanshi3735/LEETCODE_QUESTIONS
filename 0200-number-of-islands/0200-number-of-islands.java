class Solution {
    public int numIslands(char[][] grid) {
        int m=grid.length;
        int count=0;
        int n=grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1'){
                    count++;
                    dfs(grid,m,n,i,j);
                }
            }
        }
        return  count;
 
     }
   void dfs(char[][]grid,int m,int n,int i,int j){
    if(i>=m||j>=n||i<0||j<0||grid[i][j]=='0') return;
    grid[i][j]='0';
    dfs(grid,m,n,i+1,j);
    dfs(grid,m,n,i-1,j);
    dfs(grid,m,n,i,j+1);
    dfs(grid,m,n,i,j-1);

   }
}