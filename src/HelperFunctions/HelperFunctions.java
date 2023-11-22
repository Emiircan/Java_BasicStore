package HelperFunctions;

import Database.Address;

public class HelperFunctions {

    public static String checkCity(String city) {
        try {
            if (!Address.getCityList().contains(city))
                throw new RuntimeException("We can not continue your process because, there is no shipping that location.");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return city;
    }


    public static String generateShippingTrackingNumber(String fullName, String city, String zipCode) {

        String[] basHarfler = fullName.split(" ");
        String bh = "";
        for (String h : basHarfler) {
            bh = bh.concat(String.valueOf(h.charAt(0)));
        }
        return (city.substring(0, 3) + zipCode + bh).toUpperCase();
    }

    public static String checkZipCode(String zipCode) {
        String x = "";
        try {
            if (zipCode.length() == 5)
                x = zipCode;
            else
                throw new RuntimeException("Please enter valid Zip Code");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return x;
    }


}
