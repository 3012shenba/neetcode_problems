class Solution {
    public boolean isPalindrome(String s) 
    {
        String res="";
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(!Character.isLetterOrDigit(c))
            {
                continue;
            }
            res+=c;
        }
       
        res=res.toLowerCase();
         System.out.print(res);
        int st=0;
        int end=res.length()-1;
       while(st<=end)
       {
            if(res.charAt(st)!=res.charAt(end))
            {
                return false;
            }
                st++;
                end--;
            
        }
        return true;
    }
}
