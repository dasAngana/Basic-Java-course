public class challenge3 {
    public static char marks(int m)
    {
        if(m>=80)
        return 'A';

        else if (m<80 && m>=60)
        return 'B';

        else if(m<60 && m>40)
        return 'C';

        else
        return 'f';
    }


    public static void main(String args[])
    {
        String Name="AXE";
        int mark=67;

        System.out.println("Grade:"+marks(mark));
    }
}
