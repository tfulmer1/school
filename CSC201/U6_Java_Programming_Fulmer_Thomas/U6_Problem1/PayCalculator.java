
/*
Implements a pay calculator with abstract classes as the training objective
Unit 6 Problem 1
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 29 September 2016
*/

package U6_Problem1;

public abstract class PayCalculator
{
    public double payRate;

	public double computePay(double hours){
        double pay = payRate * hours;
        pay = ((int)(100*pay)) / 100.0;
        return pay;
    }
}
