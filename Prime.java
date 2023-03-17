public class Prime {
    public static void main(String args[])
    {int count;
        System.out.print("the primes are: ");
        for(int i=2;i<50;i++)
        { count=0;
            for(int j=2;j<i;j++)
           { if(i%j==0)
            {
            count++;
           }}
           if(count==0)
           {
            System.out.print(i+" ");
           }
        
    }
    
}
}
