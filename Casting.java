public class Casting {

    public static void main(String[] args) {
    

        short s1=Short.MAX_VALUE;
        System.out.println(s1);
        
        short newValue= s1;
        Short Value= (short) (newValue/2);
        System.out.println(Value);

        long l1=Long.MAX_VALUE;
        System.out.println(l1);
        
        long newlongValue= l1;
        long longValue= (newlongValue/2); // casting not required as integer can fit into long data type.
        System.out.println(longValue);
    }   
}
