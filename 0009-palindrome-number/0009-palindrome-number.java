class Solution {
    public boolean isPalindrome(int x) 
    { int rev=0, k=x,i;
    if(x<0)
    return false;
        String str = k+ "";
        for(i=0;i<str.length();i++)
        {
           rev= rev *10 + k%10 ;
           k/=10;
        }
        if(rev==x)
        return true;
        else 
        return false;
    }
    public static void main(String args[])
    { int v;
        System.out.println("Enter a number");
        Scanner sc= new Scanner(System.in);
        v=sc.nextInt();
        Solution obj= new Solution();
        if( obj.isPalindrome(v))
        System.out.println("PAlindrom");
        else
        System.out.println("not PAlindrom");


    }

}