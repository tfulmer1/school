package U1_Problem3;

/*
Simulates a vending machine, gives change based on inputs and selection
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 20 Aug 2016
*/

public class Product
{
    String name;
    int price;
    //takes the price multiplied by 100 to make an int
	public Product(String name, int price){
		this.name = name;
		this.price = price;
	}
}