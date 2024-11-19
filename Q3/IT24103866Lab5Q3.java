import java.util.Scanner;
public class IT24103866Lab5Q3 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int startDate,endDate;

        System.out.print("Enter Start Date (1-31): ");
        startDate = input.nextInt();

        System.out.print("Enter End Date (1-31): ");
        endDate = input.nextInt();

        if (endDate < 1 || endDate > 31 || startDate <1 || startDate > 31)
        {
            System.out.print("Error: Start Date must be between 1 and 31");
            return;
        }
        if (startDate >= endDate)
        {
            System.out.print("Error: Start Date must be less than End Date");
            return;
        }

        final double perDayCharges = 48000;
        final double threeToFourDaysDiscount = 0.1;
        final double fiveOrMoreDaysDiscount = 0.2;

        //calculation
        int daysReserved = endDate - startDate;

        double discountRate = 0;
        if (daysReserved >= 3 ||daysReserved <= 4)
        {
            discountRate = threeToFourDaysDiscount;
        }
        if (daysReserved >=5)
        {
            discountRate = fiveOrMoreDaysDiscount;
        }

        //calculations
        double totalAmountWithOutDiscount = perDayCharges * daysReserved;
        double discount = discountRate * totalAmountWithOutDiscount;
        double totalAmount = totalAmountWithOutDiscount - discount;

        System.out.println();
        System.out.println("Room Charge per Day: Rs. "+perDayCharges+"/=");
        System.out.println("number of Days Reserved: "+daysReserved);
        System.out.println("Total amount to be Paid: "+totalAmount);
        

        

        

        

        


    }
}