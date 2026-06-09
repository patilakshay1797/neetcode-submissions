class Solution {
    public int trap(int[] height) {
             int[][] sol=new int[3][height.length];
        int vol=0;
        int maximum=0;
        for(int i=0;i<height.length;i++)
        {   
            maximum=Math.max(height[i],maximum);
            sol[0][i]=maximum;
        };
        maximum=0;
        for(int i=height.length-1;i>0;i--)
        {   
            maximum=Math.max(height[i],maximum);
            sol[1][i]=maximum;
            sol[2][i]=Math.min(sol[0][i],sol[1][i])-height[i];
            vol=vol+sol[2][i];
        }
        return vol;
    
    }
}
