public class printevenusingwhile {

    static boolean even(int x)
    {
        if(x%2==0)
        return true;

        return false;
    }
    public static void main(String args[])
    {
        int p=5;
        while(p<30)
        {
            if(even(p))
            System.out.print(p+" ");

            p++;
        }
    }
    
}
