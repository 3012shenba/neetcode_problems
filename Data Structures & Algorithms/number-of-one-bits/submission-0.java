class Solution {
    public int hammingWeight(int n) 
    {
        ArrayList<Integer>list=new ArrayList();
        while(n>0)
        {
          int mod=n%2;
          if(mod==1)
          {
          list.add(mod);
          }
          n/=2;  
        }
        System.out.print(list);
        return list.size();
    }
}
