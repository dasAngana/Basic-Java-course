public class Challenge5 {

    static double Area(double radius)
    {
        if(radius>1)
     {  
        return radius*radius*Math.PI;
     }
        else 
        return -1;
}
static double Area(double length,double breadth)
{
    return 2*(length+breadth);
}

    public static void main(String args[])
    {
        System.out.println(Area(2.2));
        System.out.println(Area(2,1));
    }
    
}
