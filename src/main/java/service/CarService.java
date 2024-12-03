package service;

import beans.IEngine;

public class CarService {
    IEngine engine;   //this variable is used for dependency injectiion in byType
    public void setEngine(IEngine engine){
        this.engine=engine;
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
