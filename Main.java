package com.Ivanov;

public class Main {
    public static void main(String[] args) {
        Cars bmw = new Cars("BMV X6",5.6, 1200.5,
                "Red ", true);
        bmw.MaxSpeed = 220;
//    System.out.println(bmw.MaxSpeed);
//    bmw.setAll("BMV X6",5.6, 1200.5,
//            "Red ", true);
        System.out.println(bmw.toString());

        Cars volvo = new Cars("Volvo model", 8.9, 1500.5,
                "Yellow ", false);
        volvo.MaxSpeed = 160;
//    volvo.setAll("Volvo model", 8.9, 1500.5,
//            "Yellow ", false);
//    System.out.println(volvo.MaxSpeed);
    System.out.println(volvo.toString());
    }
}


