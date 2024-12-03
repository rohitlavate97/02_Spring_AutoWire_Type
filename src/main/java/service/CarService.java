package service;

import beans.IEngine;

public class CarService {
    IEngine engine;   //this variable is used for dependency injectiion in byType
    public CarService(IEngine engine){
        this.engine=engine;
        System.out.println("Carservice parameterized constructor");;
    }
    public CarService(){
        System.out.println("Carservice constructor");
    }
    public void setEngine(IEngine engine){
        this.engine=engine;
        System.out.println("Carservice setter method");
    }
    public void drive(){
        int status= engine.start();
        if(status>0){
            System.out.println("Car is running");
        }else{
            System.out.println("Engine breakdown");
        }
    }
}
