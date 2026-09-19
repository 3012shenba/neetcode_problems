class Solution {
    public String longestCommonPrefix(String[] strs) 
    {
        String temp=strs[0];
        for(int i=1;i<strs.length;i++)
        {
            String dup="";
            String comp=strs[i];
            int leng=0;
            if(comp.length()<temp.length())
            {
               leng=comp.length();
            }
            else
            {
            leng=temp.length();
            }
            
                for(int j=0;j<leng;j++)
                {
                    if(comp.charAt(j)==temp.charAt(j))
                    {
                        dup+=comp.charAt(j);
                    }
                    else
                    {
                        break;
                    }
                }
            
            temp=dup;
        }
        return temp;
    }
}