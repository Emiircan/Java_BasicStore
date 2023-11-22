package Models;

import static HelperFunctions.HelperFunctions.*;

public class User {

    private String fullName;
    private String city;
    private String zipCode;
    private String address;
    private double myPrice;
    private String shippingTrackingNumber;

    public User(String fullName, String address, String city,String zipCode) {
        this.fullName = fullName;
        this.city = checkCity(city);
        this.zipCode =checkZipCode(zipCode);
        this.address = address;
        this.shippingTrackingNumber = generateShippingTrackingNumber(fullName,city,zipCode);
    }

    public double getMyPrice() {
        return myPrice;
    }

    public void setMyPrice(double myPrice) {
        this.myPrice += myPrice;
    }

    @Override
    public String toString() {
        return "----------------\n" +
                "Full Name : " + this.fullName + '\n' +
                "City : " + this.city + '\n' +
                "Adress : " + this.address + '\n' +
                "Zip Code : " + this.zipCode + '\n' +
                "Your Shipping Tracking Number : " + this.shippingTrackingNumber + '\n' +
                "Total User Price : " + this.myPrice + '\n' +
                "----------------";
    }
}
