
/*
Creates a few clases for electronic devices, manipulates and tests them
Unit 4 Problem 4
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 12 Sept 2016
*/

package U4_problem4.devices;

import U4_problem4.Electronics;

public class Phones extends Electronics
{
    private String service;
    private String phoneNumber;

    public Phones(){
        super();
        this.service = "No service";
        this.phoneNumber = "555-555-5555";
        super.setTypeDevice("Mobile Phone");
    }

    public Phones(String service, String phoneNumber){
        super();
        this.service = service;
        this.phoneNumber = phoneNumber;
        super.setTypeDevice("Mobile Phone");
    }

    public Phones(String deviceName, String model, double price, String manufacturer, String service, String phoneNumber){
        super(deviceName, model, price, manufacturer, "Mobile Phone");
        this.service = service;
        this.phoneNumber = phoneNumber;
    }

    public void setService(String service){
        this.service = service;
    }

    public String getService(){
        return service;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNUmber(){
        return phoneNumber;
    }

    public String toString(){
        String outString = (
            super.toString() + " This specific phone has phone number " +
            phoneNumber + " provided by " + service
        );
        return outString;
    }
}