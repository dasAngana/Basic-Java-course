public class Switch_cha1 {

    public static void main(String args[])
    {
        char Var='i';

        switch(Character.toLowerCase(Var))
        {
            case 'a':case'e':case'i':case'o':case'u': System.out.println("vowel"); break;

            default:System.out.println("not");
        }
    }
    
}
