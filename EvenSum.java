public class EvenSum {

    static boolean isEven(int x)
    {
        if(x<0) {return false;}
        if(x%2==0)
        return true;
        
        return false;
    }

    static void sumEven(int a,int b)
    {
        int sum=0;
        for(int i=a;i<b;i++)
        {
            if(isEven(i))
            sum+=i;
        }
        System.out.println("Sum ="+sum);

    }

    public static void main(String args[])
    {
        sumEven(5,13);
    }
    
}
