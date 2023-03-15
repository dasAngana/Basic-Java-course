//Calculate the quantity of petrol and diesel in a budget of 1546.12 Rs
// according to respective prices 84.11, 74.91

public class Assesment1 {

    public static void main(String args[]){

        float petrolPrice=  84.11f;
        float dieselPrice = 74.91f;

        float Budget=1546.12f;

        float petrolQuantity = petrolPrice/Budget;
        float dieselQuantity = dieselPrice/Budget;

        System.out.println("Petrol Quantity:"+petrolQuantity);
        System.out.println("Diesel Quantity:"+dieselQuantity);

        double petrolPrice1=  84.11d;
        double dieselPrice1= 74.91d;

        double Budget1=1546.12d;
        double petrolQuantity1 = petrolPrice1/Budget1;
        double dieselQuantity1 = dieselPrice1/Budget1;

        System.out.println("Petrol Quantity1:"+petrolQuantity1);
        System.out.println("Diesel Quantity1:"+dieselQuantity1);


        
    }
    
}
