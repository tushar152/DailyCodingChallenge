class Solution
{
    static boolean check(int preorder[], int i1, int inorder[], int i2, int postorder[], int i3, int len)
    {
        if(len==0) return true;
        
        if(len==1) return ( (preorder[i1]==inorder[i2]) && (inorder[i2] == postorder[i3]) );
        
        int idx=-1;
        for(int i=0 ; i<len ; i+=1)
            if( inorder[i2+i] == preorder[i1] )
            {
                idx = i2+i;
                break;
            }
        if(idx==-1) return false;
        
        if( preorder[i1] != postorder[i3+len-1] ) return false;
        
        int left = idx-i2;
        
        boolean ret1 = check(preorder, i1+1, inorder, i2, postorder, i3, left);
        
        boolean ret2 = check(preorder , i1+1+left , inorder , i2+1+left , postorder , i3+left , len-left-1);
        
        return (ret1 && ret2);
    }
    static boolean checktree(int preorder[], int inorder[], int postorder[], int N)
    {
        return check(preorder, 0, inorder, 0, postorder, 0, N);
    }
}
