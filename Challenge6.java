import javax.lang.model.util.ElementScanner14;

public class Challenge6 {

    void Equal(int a,int b,int c)
    {
        if(a<0||b<0||c<0)
            System.out.println("invalid");
        else if(a==b && b==c)
            System.out.println("All are equal");
        else
             System.out.println("All are different");   
    }

    public static void main(String args[])
    {
        Challenge6 obj=new Challenge6();
        obj.Equal(100, 20, 201);
    }
    
}
