package Database;

public class Items {

    public static double ItemName(String itemName){
        double itemPrice = 0;
        switch (itemName) {
            case "Rose teddy bear":
                itemPrice = 30.0;break;
            case "Iphone max":
                itemPrice = 850.23;break;
            case "laptop mouse":
                itemPrice = 23.50;break;
            case "Monitor":
                itemPrice = 90.23;break;
            case "charger":
                itemPrice = 43.20;break;
            case "hdmi cable":
                itemPrice = 5.90;break;
            case "mug":
                itemPrice = 30.0;break;
        }
        return itemPrice;
    }

    public static double colorPrice(String color) {
        double cPrice = 0;
        switch (color) {
            case "Red":
                cPrice = 10.0;break;
            case "Blue":
                cPrice = 6.0;break;
            case "Black":
                cPrice = 4.0;break;
            case "White":
                cPrice = 2.0;break;
        }
        return cPrice;
    }

    public static double customText(String text) {
        double textPrice = 0;
        if (text.length() > 10)
            textPrice = 5;
        else
            textPrice = 3;
        return textPrice;
    }

}



