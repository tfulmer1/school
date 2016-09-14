
/*
Creates a few clases for electronic devices, manipulates and tests them
Unit 4 Problem 4
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 12 Sept 2016
*/

package U4_problem4.devices;

import U4_problem4.Electronics;

public class Computers extends Electronics
{
    private int ram;
    private int diskSize;
    private double processor; 

    public Computers(){
        super();
        this.ram = 0;
        this.diskSize = 0;
        this.processor = 0.0;
        super.setTypeDevice("Computer");
    }

    public Computers(int ram, int diskSize, double processor){
        super();
        this.ram = ram;
        this.diskSize = diskSize;
        this.processor = processor;
        super.setTypeDevice("Computer");
    }

    public Computers(String deviceName, String model, double price, String manufacturer, int ram, int diskSize, double processor){
        super(deviceName, model, price, manufacturer, "Computer");
        this.ram = ram;
        this.diskSize = diskSize;
        this.processor = processor;
    }

    public void setRam(int ram){
        this.ram = ram;
    }

    public int getRam(){
        return ram;
    }

    public void setDiskSize(int diskSize){
        this.diskSize = diskSize;
    }

    public int getDiskSize(){
        return diskSize;
    }

    public void setProcessor(int ram){
        this.processor = processor;
    }

    public double getProcessor(){
        return processor;
    }

    public String toString(){
        String outString = (
            super.toString() + " This specific computer has " +
            ram + " GB of RAM with a " + processor + "Ghz processor and a " + 
            diskSize + " TB harddrive."
        );
        return outString;
    }
}