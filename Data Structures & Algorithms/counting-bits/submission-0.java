class Solution {
    public int[] countBits(int n) 
    {
        int res[]=new int[n+1];
        for(int i=0;i<=n;i++)
        {
            int temp=i;
            int sum=0;
            while(temp>0)
            {
                int mod=temp%2;
                sum+=mod;
                temp/=2;
            }
           res[i]=(sum);
        }
       
       return res;
    }
}
