
/*
Creates a few clases for electronic devices, manipulates and tests them
Unit 4 Problem 4
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 12 Sept 2016
*/

package U4_problem4;

import U4_problem4.devices.*;

public class Electronics
{
    private String deviceName;
    private String model;
    private double price;
    private String manufacturer;
    private String typeDevice;

    public Electronics(){
        this.deviceName = "none";
        this.model = "None";
        this.price = 0.0;
        this.manufacturer = "None";
        this.typeDevice = "None";
    }

    public Electronics(String deviceName, String model, double price, String manufacturer, String typeDevice){
        this.deviceName = deviceName;
        this.model = model;
        this.price = price;
        this.manufacturer = manufacturer;
        this.typeDevice = typeDevice;
    }

    public void setDeviceNamce(String deviceName){
        this.deviceName = deviceName;
    }

    public String getDeviceName(){
        return deviceName;
    }

    public void setModel(String model){
        this.model = model;
    }

    public String getModel(){
        return model;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }

    public String getManufacturer(){
        return manufacturer;
    }

    public void setTypeDevice(String typeDevice){
        this.typeDevice = typeDevice;
    }

    public String getTypeDevice(){
        return typeDevice;
    }

    public String toString(){
        String outString = (
            "The " + model + " " + deviceName + " is a " + typeDevice +
            " manufactored by " + manufacturer + " and sold at $" + price
        );
        return outString;
    }

}
