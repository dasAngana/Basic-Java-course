public class isPalindrome {

   static void pali(int num)
    {
        int rev=0,rem;
        int p=num;
        do{
            rem=p%10;
            rev=rev*10+rem;
            p=p/10;
        }while(p>0);

        if(rev==num)
        System.out.println("palindrome.");
        else
        System.out.println("not palindrome.");
    }

    public static void main(String args[])
    {
        pali(123321);
        pali(123324);
        pali(3030);

    }
    
}
