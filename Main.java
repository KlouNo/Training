package com.Ivanov;

public class Main {
    public static void main(String[] args) {
        Cars bmw = new Cars("BMV X6",5.6, 1200.5,
                "Red ", true);
        bmw.MaxSpeed = 220;


        BMW m3 = new BMW(true, "M3 ",5.6, 1200.5,
                "Blue ", true);

        Cars volvo = new Cars("Volvo model", 8.9, 1500.5,
                "Yellow ", false);
        volvo.MaxSpeed = 160;

    }
}


