
/*
Creates a few clases for electronic devices, manipulates and tests them
Unit 4 Problem 4
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 12 Sept 2016
*/

package U4_problem4.devices;

import U4_problem4.Electronics;

public class Tablets extends Electronics
{
    private int size;

    public Tablets(){
        super();
        this.size = 0;
        super.setTypeDevice("Tablet");
    }

    public Tablets(int size){
        super();
        this.size = size;
        super.setTypeDevice("Tablet");
    }

    public Tablets(String deviceName, String model, double price, String manufacturer, int size){
        super(deviceName, model, price, manufacturer, "Tablet");
        this.size = size;
    }

    public void setSize(int size){
        this.size = size;
    }

    public int getSize(){
        return size;
    }

    public String toString(){
        String outString = (
            super.toString() + " This specific tablet is " +
            size + " inches"
        );
        return outString;
    }
}