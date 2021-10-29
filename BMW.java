package com.Ivanov;

public class BMW extends Cars {

    private boolean isMPerformance = false;

    public BMW(boolean isMPerformance, String model, double Razgon, double weight,
               String color, boolean isWork) {
        super(model, Razgon, weight, color, isWork);
        this.isMPerformance = isMPerformance;
        this.MaxSpeed = MaxSpeed;
//        System.out.println(toString());

}

    public String toString( String model, double Razgon, double weight,
                            String color, boolean isWork) {
        super.toString();
        String isMPerformance = this.isMPerformance ? "is it " : "Isn't it";
        return new StringBuilder("Is performance: ")
                .append(this.isMPerformance)
                .toString();
    }


}
