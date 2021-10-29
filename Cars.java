package com.Ivanov;


public abstract class Cars {

    private String model;
    protected int MaxSpeed;
    private double Razgon;
    private double weight;
    private String color;
    private boolean isWorking;

    public Cars(String model,
                double Razgon,double weight,
                String color, boolean isWork) {
        this.model = model;
        this.Razgon = Razgon;
        this.weight = weight;
        this.color = color;
        this.isWorking = isWork;
        System.out.println(toString());

    }

    abstract void startEngine();


    public String toString(){
        return new StringBuilder("Model: ")
                .append(this.model)
                .append("Max speed: ")
                .append(this.MaxSpeed)
                .append("Razgon: ")
                .append(this.Razgon)
                .append("Car color: ")
                .append(this.color)
                .append("Is working: ")
                .append(isWorking)
                .toString();

    }


}


