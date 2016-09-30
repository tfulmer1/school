
/*
Implements a pay calculator with abstract classes as the training objective
Unit 6 Problem 1
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 29 September 2016
*/

package U6_Problem1;

public class Driver
{
    public static void main(String[] args){
        PayCalculator[] employees = {
            new HazardPay(15.7),
            new RegularPay(16.3)
        };

        for(PayCalculator employee : employees){
            System.out.println("Pay for 40 hour week: " + employee.computePay(40));
        };
    }
}
