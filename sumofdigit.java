public class sumofdigit {

    public static void main(String args[])
    {int num=12345;
        int sum=0,rem;
        do{
            rem=num%10;
            sum=sum+rem;
            num=num/10;
          }while(num>0);
 System.out.println("sum:"+sum);
    }
    
}
