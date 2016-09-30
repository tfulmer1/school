
/*
Implements a pay calculator with abstract classes as the training objective
Unit 6 Problem 1
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 29 September 2016
*/

package U6_Problem1;

public class RegularPay extends PayCalculator
{
    public RegularPay(){
        this.payRate = 0.0;
    }

    public RegularPay(double payRate){
        this.payRate = payRate;
    }
}
