public class Swith_challenge {

  static boolean year(int x){

    if(x%4==0)
    return true;

    return false;
  }
   public static void main(String args[])
      {
        int month=2;
        int x=1994;
        if(month<1 || month>12)
        {
          System.out.println("-1");
          return;
        }
        if(year(x))
        {
          switch(month)
          {
            case 1:case 3:case 5:case 7:case 8:case 10:case 12: System.out.println("month is:31 days and year is:"+x); break;
          
          case 2: System.out.println("FEb month=29 days and year is: "+x);
          break;

          default: System.out.println("month is:30 days and year is:"+x);
        }
      }
      else{
        switch(month)
          {
            case 1:case 3:case 5:case 7:case 8:case 10:case 12: System.out.println("month is:31 days and year is:"+x); break;
          
          case 2: System.out.println("FEb month=28 days and year is: "+x);
          break;

          default: System.out.println("month is:30 days and year is:"+x);
        }

      }
      }
    
}
