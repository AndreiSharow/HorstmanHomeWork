package ObjectOrientedProg;

import java.sql.SQLOutput;

public class Car {
    private double point=0;
    private double fuel=100;
    private double rashod;


    public Car(double rashod){
        this.rashod=rashod;
    }

    public void addFuel(double fuel){
        double bak;
        if(this.fuel==100){
            System.out.println("Fuel is full");
        }
        if(fuel>=100){
            bak=100;
        }else {
            bak=this.fuel+fuel;
        }
        if(bak>100){
            this.fuel=bak-(bak-100);
            return;
        }
        this.fuel+=fuel;

    }



    public  void go(double n){
        if(fuel-rashod>0 & n>0){
            fuel=fuel-rashod;
            point++;
            go(n-1);
        }
    }

    public String toString() {
        return "Distance:"+point+" "+"Fuel:"+fuel;
    }




    }




